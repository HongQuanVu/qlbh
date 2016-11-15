package view.backing;

import oracle.adf.controller.TaskFlowId;
import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.fragment.RichRegion;

public class Test {
    private RichForm f1;
    private RichDocument d1;
    private RichRegion r1;
    private String taskFlowId = "/WEB-INF/ChungTuMuaHang_TaskFlow.xml#ChungTuMuaHang_TaskFlow";
    private RichRegion r2;
    

    public void setF1(RichForm f1) {
        this.f1 = f1;
    }

    public RichForm getF1() {
        return f1;
    }

    public void setD1(RichDocument d1) {
        this.d1 = d1;
    }

    public RichDocument getD1() {
        return d1;
    }

    public void setR1(RichRegion r1) {
        this.r1 = r1;
    }

    public RichRegion getR1() {
        return r1;
    }

    public TaskFlowId getDynamicTaskFlowId() {
        return TaskFlowId.parse(taskFlowId);
    }

    public void setDynamicTaskFlowId(String taskFlowId) {
        this.taskFlowId = taskFlowId;
    }

    public void setR2(RichRegion r2) {
        this.r2 = r2;
    }

    public RichRegion getR2() {
        return r2;
    }

    
}
