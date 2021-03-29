package com.swampus.cooding.task.intermediate;

import com.swampus.cooding.misc.Command;
import com.swampus.cooding.misc.CreditCardAuth;
import com.swampus.cooding.misc.Employee;
import com.swampus.cooding.misc.SecretAgent;
import org.junit.Before;
import org.junit.Test;
import org.mockito.internal.util.reflection.Whitebox;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class SeniorTest {

    private Senior senior = new Senior();

    @Before
    public void setUp() throws Exception {
        senior.setTaxTable(null);
    }

    @Test
    public void calculateNetSalary() throws Exception {
        Map<String, Long> taxCategory = new HashMap<>();
        taxCategory.put("A", 10L);
        taxCategory.put("B", 25L);

        senior.setTaxTable(taxCategory);

        Map<Employee, Double> employeeDoubleMap = new HashMap<>();
        Employee employeeBig = new Employee();
        employeeBig.setPersonalCode("12345");
        employeeBig.setTaxCategory("A");
        employeeBig.setName("ABCDE");

        Employee employeeTwo = new Employee();
        employeeTwo.setPersonalCode("111-222");
        employeeTwo.setTaxCategory("A");
        employeeTwo.setName("The Jack");

        Employee employeeTree = new Employee();
        employeeTree.setPersonalCode("33333");
        employeeTree.setTaxCategory("B");
        employeeTree.setName("Thk");


        Employee employeeZero = new Employee();
        employeeZero.setPersonalCode("testZero");
        employeeZero.setTaxCategory("B");
        employeeZero.setName("ZeroOne");


        employeeDoubleMap.put(employeeBig, 2000.0);
        employeeDoubleMap.put(employeeTwo, 4000.0);
        employeeDoubleMap.put(employeeTree, 10000.0);
        employeeDoubleMap.put(employeeZero, 0.0);

        Map<String, Double> employeeSalary = senior.calculateNetSalary(employeeDoubleMap);

        assertEquals(4, employeeSalary.size());
        assertEquals(new Double(1800.0), employeeSalary.get("12345"));
        assertEquals(new Double(3600.0), employeeSalary.get("111-222"));
        assertEquals(new Double(7500.0), employeeSalary.get("33333"));
        assertEquals(new Double(0.0), employeeSalary.get("testZero"));


    }

    @Test
    public void broodForce() throws Exception {
        assertEquals("3422", senior.broodForce(new CreditCardAuth()));
    }

    @Test
    public void privateFieldValue() throws Exception {
        SecretAgent secretAgent = new SecretAgent("1234");
        Whitebox.setInternalState(secretAgent, "sValue", "T2");
        assertEquals("T2", senior.privateFieldValue(secretAgent));
    }

    @Test
    public void collectData() throws Exception {
        List<SecretAgent> secretAgents = new ArrayList<>();
        SecretAgent secretAgent = new SecretAgent("A");
        SecretAgent secretAgent2 = new SecretAgent("B");
        SecretAgent secretAgent3 = new SecretAgent("q");
        SecretAgent secretAgent4 = new SecretAgent("Q");
        SecretAgent secretAgent5 = new SecretAgent("1");
        SecretAgent secretAgent6 = new SecretAgent("2");
        SecretAgent secretAgent7 = new SecretAgent("Q");

        secretAgents.add(secretAgent);
        secretAgents.add(secretAgent2);
        secretAgents.add(secretAgent3);
        secretAgents.add(secretAgent4);
        secretAgents.add(secretAgent5);
        secretAgents.add(secretAgent6);
        secretAgents.add(secretAgent7);

        assertEquals("ABqZZZ12ZZZ", senior.collectData(secretAgents));

    }

    @Test
    public void commandExecutionResult() throws Exception {
        List<Command> commands = new ArrayList<>();
        Command command1 = new Command(1100, "ABC");
        Command command2 = new Command(2500, "0101");
        Command command3 = new Command(1500, "QWER");
        command1.start();
        command2.start();
        command3.start();
        commands.add(command1);
        commands.add(command2);
        commands.add(command3);
        List<String> result = senior.commandExecutionResult(commands);

        assertEquals(3, result.size());
        assertEquals("ABC", result.get(0));
        assertEquals("QWER", result.get(1));
        assertEquals("0101", result.get(2));
    }

}