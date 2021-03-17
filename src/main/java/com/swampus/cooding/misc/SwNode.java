package com.swampus.cooding.misc;

import java.util.Objects;

public class SwNode {
    private String id;
    private SwNode reference;
    private boolean root;

    public SwNode(String id, boolean root) {
        this.root = root;
        this.id = id;
    }

    public boolean isRoot() {
        return root;
    }

    public String getId() {
        return id;
    }

    public SwNode getReference() {
        return reference;
    }

    public void setReference(SwNode reference) {
        this.reference = reference;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SwNode swNode = (SwNode) o;
        return root == swNode.root &&
                Objects.equals(id, swNode.id) &&
                Objects.equals(reference, swNode.reference);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, reference, root);
    }
}
