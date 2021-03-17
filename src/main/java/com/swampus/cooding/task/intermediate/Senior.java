package com.swampus.cooding.task.intermediate;

import com.swampus.cooding.misc.Command;
import com.swampus.cooding.misc.CreditCardAuth;
import com.swampus.cooding.misc.Employee;
import com.swampus.cooding.misc.SecretAgent;

import java.util.List;
import java.util.Map;

public class Senior {

    private Map<String, Long> taxTable;

    /**
     * Task1
     * you have field taxTable there is String KEY - tax category value and VALUE the number (percent of tax)
     * personsGrossSalary parameter is provided it is a map where key is Employee - is a company employee and
     * value is amount of gross salary (before tax) you need to return map where KEY is employee personal code and
     * VALUE is amount of salary after tax. To get employee personal code  already have getter
     * to get salaray after tax you need to use taxTable find percent by tax category (find value by key) after you found percent
     * you need to decrease salary before tax on that percent and you will get salary after tax
     * tax category, personal code you can find inside employee (already exists method)
     * tax category percent to decrease you can find in taxTable it is value for key (tax category)
     */
    public Map<String, Double> calculateNetSalary(Map<Employee, Double> personsGrossSalary) {
        return null;
    }

    /**
     * Task2
     * To Auth credit card you need 4 digits String code like 0111, 0123 or 3245
     * You don't know the code. ( because card is not yours ;) )
     * You have incoming parameter CreditCardAuth creditCardAuth it is objects that extends thread.
     * You can call method .setAuthCode providing any code, then call method .start() of creditCardAuth and that
     * object will start check of provided code it will took some time to check.
     * You can load result by calling .getResult() it will be SUCCESS - if code is ok, FAILED - not ok
     * or IN PROGRESS if check still not finished. (it will take some time to perform auth)
     * you need to return code that is ok for auth (creditCardAuth on finish will assign SUCCESS to .getResult(),
     * but note creditCardAuth is parallel thread )
     * /!!\ WARNING /!!\
     * 1. you know that digit [1] is 3 so code is: 3*** - that will really help
     * 2. and if you are going to use .join() to make thread finish and then load result and make a cycle...
     * I have very bad news for you: thread will work some time and if it run one-by one you will wait too long
     * it will never finish So think what you can do.
     * setCode(); start(); join(); get result. and one by one will not help. Think!!!
     */
    public String broodForce(CreditCardAuth creditCardAuth) {
        return "";
    }

    /**
     * Task3
     * you have incoming param SecretAgent it have private field sValue that is String, return that field value
     * Note: that field is private and you can not modify SecretAgent.class (not possible to add getter())
     * What to do ? Google:... it is task of able to Google problem
     */
    public String privateFieldValue(SecretAgent secretAgent) {
        return null;
    }


    /**
     * Task4
     * you have incoming list with SecretAgent secretAgents objects.
     * SecretAgent class have method .getPhrase()
     * you need collect all getPhrase() results of all objects in list into Single string and return
     * if secretAgent will throw you RuntimeException, then you can count that .getPhrase() return "ZZZ" for that case
     * Remember about String concatenation in Cycle, what Class can we use for that ?
     */
    public String collectData(List<SecretAgent> secretAgents) {
        return null;
    }

    /**
     * Task5
     * you have incoming param. It is a list of Command that is a running thread (Class extends thread and running)
     * when thread finished result is accessible by .getResult() method (before thread finished it is not correct)
     * you need to get result`s from all Command`s class`es inside List and put that String result Result List (list you need to return)
     * but in result List (that should be returned) you need keep order. First thread finished its result is first in Result list e.t.c
     * for example
     * incomming commands (
     * 1. Command result="AB" working time 100seconds,
     * 2. Command result="CC" working time 50 seconds,
     * 3. Command result="DD" working time 101 seconds.
     * the result list (method return) should be List<String>[ CC, AB, DD ]
     */
    public List<String> commandExecutionResult(List<Command> commands) {
        return null;
    }


    public Map<String, Long> getTaxTable() {
        return taxTable;
    }

    public void setTaxTable(Map<String, Long> taxTable) {
        this.taxTable = taxTable;
    }
}
