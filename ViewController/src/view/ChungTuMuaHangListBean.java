package view;

import oracle.adf.model.BindingContext;

import oracle.adf.model.binding.DCIteratorBinding;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.Key;

public class ChungTuMuaHangListBean {
    public ChungTuMuaHangListBean() {
    }

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public String b7_action() {
        System.out.println("Commit Execute ...");
        BindingContainer bindings = getBindings();
        //Get Iterator of table
        DCIteratorBinding parentIter = (DCIteratorBinding)bindings.get("ChungTuMuaHangView1"+"Iterator");
             //Get current row key
        Key parentKey = parentIter.getCurrentRow().getKey();
        OperationBinding operationBinding = bindings.getOperationBinding("Commit");
        Object result = operationBinding.execute();
        parentIter.executeQuery();
        parentIter.setCurrentRowWithKey(parentKey.toStringFormat(true));
        //if (!operationBinding.getErrors().isEmpty()) {
        //    return null;
        //}
        return "refresh";
    }
}
