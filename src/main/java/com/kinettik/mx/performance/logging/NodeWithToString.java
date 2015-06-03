
package com.kinettik.mx.performance.logging;

public class NodeWithToString extends NodeNoToString {

    public NodeWithToString(final String name, final String ip, final long childs) {
        super(name, ip, childs);
    }

    @Override
    public String toString() {
        return "NodeWithToString [name=" + name + ", ip=" + ip + ", childs=" + childs + "]";
    }

}
