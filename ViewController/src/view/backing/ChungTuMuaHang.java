package view.backing;


import javax.faces.component.UISelectItems;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.RichQuery;
import oracle.adf.view.rich.component.rich.RichQuickQuery;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputDate;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;
import oracle.adf.view.rich.component.rich.layout.RichPanelFormLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelHeader;
import oracle.adf.view.rich.component.rich.layout.RichPanelLabelAndMessage;
import oracle.adf.view.rich.component.rich.layout.RichPanelSplitter;
import oracle.adf.view.rich.component.rich.layout.RichPanelTabbed;
import oracle.adf.view.rich.component.rich.layout.RichShowDetailItem;
import oracle.adf.view.rich.component.rich.layout.RichToolbar;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.nav.RichCommandLink;
import oracle.adf.view.rich.component.rich.output.RichMessages;
import oracle.adf.view.rich.component.rich.output.RichOutputText;
import oracle.adf.view.rich.component.rich.output.RichPanelCollection;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.Key;

public class ChungTuMuaHang {
    private RichForm f1;
    private RichDocument d1;
    private RichPanelGroupLayout pgl1;
    private RichMessages m1;
    private RichPanelGroupLayout pgl2;
    private RichPanelHeader ph2;
    private RichPanelGroupLayout pgl3;
    private RichPanelHeader ph1;
    private RichQuery qryId1;
    private RichTable resId1;
    private RichPanelCollection pc1;
    private RichPanelSplitter ps1;
    private RichPanelFormLayout pfl1;
    private RichPanelLabelAndMessage plam1;
    private RichOutputText ot13;
    private RichInputText it1;
    private RichInputText it2;
    private RichSelectOneChoice soc3;
    private UISelectItems si3;
    private RichInputDate id1;
    private RichSelectOneChoice soc4;
    private UISelectItems si4;
    private RichInputText it3;
    private RichInputText it4;
    private RichInputText it5;
    private RichInputText it6;
    private RichPanelLabelAndMessage plam2;
    private RichOutputText ot14;
    private RichPanelLabelAndMessage plam3;
    private RichOutputText ot15;
    private RichPanelLabelAndMessage plam4;
    private RichOutputText ot16;
    private RichPanelLabelAndMessage plam5;
    private RichOutputText ot17;
    private RichPanelGroupLayout pgl4;
    private RichPanelGroupLayout pgl5;
    private RichPanelGroupLayout pgl15;
    private RichButton b5;
    private RichButton b6;
    private RichButton b7;
    private RichButton b8;
    private RichButton b9;
    private RichPanelHeader ph3;
    private RichPanelGroupLayout pgl6;
    private RichTable t1;
    private RichPanelCollection pc2;
    private RichPanelHeader ph5;
    private RichPanelFormLayout pfl2;
    private RichPanelLabelAndMessage plam6;
    private RichOutputText ot29;
    private RichSelectOneChoice soc7;
    private UISelectItems si7;
    private RichInputText it7;
    private RichSelectOneChoice soc8;
    private UISelectItems si8;
    private RichInputText it8;
    private RichPanelLabelAndMessage plam7;
    private RichOutputText ot30;
    private RichPanelLabelAndMessage plam8;
    private RichOutputText ot31;
    private RichInputText it9;
    private RichPanelLabelAndMessage plam9;
    private RichOutputText ot32;
    private RichPanelLabelAndMessage plam10;
    private RichOutputText ot33;
    private RichPanelLabelAndMessage plam11;
    private RichOutputText ot34;
    private RichPanelLabelAndMessage plam12;
    private RichOutputText ot35;
    private RichPanelGroupLayout pgl8;
    private RichPanelGroupLayout pgl7;
    private RichButton b14;
    private RichButton b17;
    private RichButton b18;
    private RichButton b15;
    private RichButton b16;
    private RichPanelHeader ph4;
   
    private RichQuickQuery qq1;
    private RichCommandLink cl1;
    private RichTable t3;
    private RichPanelSplitter ps2;
    private RichPanelSplitter ps3;
    private RichToolbar t2;
    private RichButton b1;
    private RichPanelTabbed pt2;
    private RichShowDetailItem tab1;
    private RichShowDetailItem sdi1;
    private RichPanelSplitter ps4;
    private RichTable t4;
    private RichPanelCollection pc3;
    private RichButton b2;
    private RichPanelFormLayout pfl3;
    private RichPanelLabelAndMessage plam13;
    private RichOutputText ot36;
    private RichInputText it16;
    private RichInputDate id5;
    private RichInputText it17;
    private RichInputText it18;
    private RichInputText it19;
    private RichInputText it20;
    private RichSelectOneChoice soc11;
    private UISelectItems si11;
    private RichSelectOneChoice soc12;
    private UISelectItems si12;
    private RichOutputText ot37;
    
    private RichPanelLabelAndMessage plam15;
    private RichOutputText ot38;
    private RichPanelLabelAndMessage plam16;
    private RichOutputText ot39;
    private RichPanelLabelAndMessage plam17;
    private RichOutputText ot40;
    private RichPanelGroupLayout pgl51;
    private RichPanelGroupLayout pgl52;
    private RichButton b91;
    private RichButton b92;

    private RichButton b93;
    private RichButton b94;
    private RichButton b95;
    private RichButton b96;
    private RichButton b97;
    private RichButton b98;
    private RichButton b99;
    
    private RichButton b21;
    private RichButton b81;
    
    private RichButton b3;
    private RichButton b4;
    private RichButton b10;
    private RichPanelFormLayout pfl4;
    private RichPanelLabelAndMessage plam18;
    private RichOutputText ot41;
    private RichInputText it21;
    private RichInputDate id6;
    private RichInputText it22;
    private RichInputText it23;
    private RichInputText it24;
    private RichInputText it25;
    private RichSelectOneChoice soc13;
    private UISelectItems si13;
    private RichSelectOneChoice soc14;
    private UISelectItems si14;
    private RichPanelLabelAndMessage plam19;
    private RichOutputText ot42;
    private RichPanelLabelAndMessage plam20;
    private RichOutputText ot43;
    private RichInputText it26;
    private RichPanelLabelAndMessage plam21;
    private RichOutputText ot44;
    
    private RichButton b11;
    private RichButton b12;
    private RichButton b13;
    private RichPanelLabelAndMessage plam140;
    private RichOutputText ot370;
    private RichPanelLabelAndMessage plam141;
    
    private RichSelectOneChoice soc120;
    private UISelectItems si120;
    private RichPanelLabelAndMessage plam14;
    private RichOutputText ot371;
    private RichPanelLabelAndMessage plam150;
    private RichOutputText ot380;


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


    public void setPgl1(RichPanelGroupLayout pgl1) {
        this.pgl1 = pgl1;
    }

    public RichPanelGroupLayout getPgl1() {
        return pgl1;
    }


    public void setM1(RichMessages m1) {
        this.m1 = m1;
    }

    public RichMessages getM1() {
        return m1;
    }


    public void setPgl2(RichPanelGroupLayout pgl2) {
        this.pgl2 = pgl2;
    }

    public RichPanelGroupLayout getPgl2() {
        return pgl2;
    }


    public void setPh2(RichPanelHeader ph2) {
        this.ph2 = ph2;
    }

    public RichPanelHeader getPh2() {
        return ph2;
    }


    public void setPgl3(RichPanelGroupLayout pgl3) {
        this.pgl3 = pgl3;
    }

    public RichPanelGroupLayout getPgl3() {
        return pgl3;
    }

    public void setPh1(RichPanelHeader ph1) {
        this.ph1 = ph1;
    }

    public RichPanelHeader getPh1() {
        return ph1;
    }

    public void setQryId1(RichQuery qryId1) {
        this.qryId1 = qryId1;
    }

    public RichQuery getQryId1() {
        return qryId1;
    }

    public void setResId1(RichTable resId1) {
        this.resId1 = resId1;
    }

    public RichTable getResId1() {
        return resId1;
    }

    public void setPc1(RichPanelCollection pc1) {
        this.pc1 = pc1;
    }

    public RichPanelCollection getPc1() {
        return pc1;
    }

    public void setPs1(RichPanelSplitter ps1) {
        this.ps1 = ps1;
    }

    public RichPanelSplitter getPs1() {
        return ps1;
    }

    public void setPfl1(RichPanelFormLayout pfl1) {
        this.pfl1 = pfl1;
    }

    public RichPanelFormLayout getPfl1() {
        return pfl1;
    }

    public void setPlam1(RichPanelLabelAndMessage plam1) {
        this.plam1 = plam1;
    }

    public RichPanelLabelAndMessage getPlam1() {
        return plam1;
    }

    public void setOt13(RichOutputText ot13) {
        this.ot13 = ot13;
    }

    public RichOutputText getOt13() {
        return ot13;
    }

    public void setIt1(RichInputText it1) {
        this.it1 = it1;
    }

    public RichInputText getIt1() {
        return it1;
    }

    public void setIt2(RichInputText it2) {
        this.it2 = it2;
    }

    public RichInputText getIt2() {
        return it2;
    }

    public void setSoc3(RichSelectOneChoice soc3) {
        this.soc3 = soc3;
    }

    public RichSelectOneChoice getSoc3() {
        return soc3;
    }

    public void setSi3(UISelectItems si3) {
        this.si3 = si3;
    }

    public UISelectItems getSi3() {
        return si3;
    }

    public void setId1(RichInputDate id1) {
        this.id1 = id1;
    }

    public RichInputDate getId1() {
        return id1;
    }

    public void setSoc4(RichSelectOneChoice soc4) {
        this.soc4 = soc4;
    }

    public RichSelectOneChoice getSoc4() {
        return soc4;
    }

    public void setSi4(UISelectItems si4) {
        this.si4 = si4;
    }

    public UISelectItems getSi4() {
        return si4;
    }

    public void setIt3(RichInputText it3) {
        this.it3 = it3;
    }

    public RichInputText getIt3() {
        return it3;
    }

    public void setIt4(RichInputText it4) {
        this.it4 = it4;
    }

    public RichInputText getIt4() {
        return it4;
    }

    public void setIt5(RichInputText it5) {
        this.it5 = it5;
    }

    public RichInputText getIt5() {
        return it5;
    }

    public void setIt6(RichInputText it6) {
        this.it6 = it6;
    }

    public RichInputText getIt6() {
        return it6;
    }

    public void setPlam2(RichPanelLabelAndMessage plam2) {
        this.plam2 = plam2;
    }

    public RichPanelLabelAndMessage getPlam2() {
        return plam2;
    }

    public void setOt14(RichOutputText ot14) {
        this.ot14 = ot14;
    }

    public RichOutputText getOt14() {
        return ot14;
    }

    public void setPlam3(RichPanelLabelAndMessage plam3) {
        this.plam3 = plam3;
    }

    public RichPanelLabelAndMessage getPlam3() {
        return plam3;
    }

    public void setOt15(RichOutputText ot15) {
        this.ot15 = ot15;
    }

    public RichOutputText getOt15() {
        return ot15;
    }

    public void setPlam4(RichPanelLabelAndMessage plam4) {
        this.plam4 = plam4;
    }

    public RichPanelLabelAndMessage getPlam4() {
        return plam4;
    }

    public void setOt16(RichOutputText ot16) {
        this.ot16 = ot16;
    }

    public RichOutputText getOt16() {
        return ot16;
    }

    public void setPlam5(RichPanelLabelAndMessage plam5) {
        this.plam5 = plam5;
    }

    public RichPanelLabelAndMessage getPlam5() {
        return plam5;
    }

    public void setOt17(RichOutputText ot17) {
        this.ot17 = ot17;
    }

    public RichOutputText getOt17() {
        return ot17;
    }


    public void setPgl4(RichPanelGroupLayout pgl4) {
        this.pgl4 = pgl4;
    }

    public RichPanelGroupLayout getPgl4() {
        return pgl4;
    }


    public void setB5(RichButton b5) {
        this.b5 = b5;
    }

    public RichButton getB5() {
        return b5;
    }

    public void setB6(RichButton b6) {
        this.b6 = b6;
    }

    public RichButton getB6() {
        return b6;
    }

    public void setB7(RichButton b7) {
        this.b7 = b7;
    }

    public RichButton getB7() {
        return b7;
    }
    public void setB8(RichButton b8) {
        this.b8 = b8;
    }

    public RichButton getB8() {
        return b8;
    }
    
    public void setB9(RichButton b9) {
        this.b9 = b9;
    }

    public RichButton getB9() {
        return b9;
    }


    public void setPh3(RichPanelHeader ph3) {
        this.ph3 = ph3;
    }

    public RichPanelHeader getPh3() {
        return ph3;
    }

    public void setPgl6(RichPanelGroupLayout pgl6) {
        this.pgl6 = pgl6;
    }

    public RichPanelGroupLayout getPgl6() {
        return pgl6;
    }


    public void setT1(RichTable t1) {
        this.t1 = t1;
    }

    public RichTable getT1() {
        return t1;
    }

    public void setPc2(RichPanelCollection pc2) {
        this.pc2 = pc2;
    }

    public RichPanelCollection getPc2() {
        return pc2;
    }

    public void setPh5(RichPanelHeader ph5) {
        this.ph5 = ph5;
    }

    public RichPanelHeader getPh5() {
        return ph5;
    }

    public void setPfl2(RichPanelFormLayout pfl2) {
        this.pfl2 = pfl2;
    }

    public RichPanelFormLayout getPfl2() {
        return pfl2;
    }

    public void setPlam6(RichPanelLabelAndMessage plam6) {
        this.plam6 = plam6;
    }

    public RichPanelLabelAndMessage getPlam6() {
        return plam6;
    }

    public void setOt29(RichOutputText ot29) {
        this.ot29 = ot29;
    }

    public RichOutputText getOt29() {
        return ot29;
    }

    public void setSoc7(RichSelectOneChoice soc7) {
        this.soc7 = soc7;
    }

    public RichSelectOneChoice getSoc7() {
        return soc7;
    }

    public void setSi7(UISelectItems si7) {
        this.si7 = si7;
    }

    public UISelectItems getSi7() {
        return si7;
    }

    public void setIt7(RichInputText it7) {
        this.it7 = it7;
    }

    public RichInputText getIt7() {
        return it7;
    }

    public void setSoc8(RichSelectOneChoice soc8) {
        this.soc8 = soc8;
    }

    public RichSelectOneChoice getSoc8() {
        return soc8;
    }

    public void setSi8(UISelectItems si8) {
        this.si8 = si8;
    }

    public UISelectItems getSi8() {
        return si8;
    }

    public void setIt8(RichInputText it8) {
        this.it8 = it8;
    }

    public RichInputText getIt8() {
        return it8;
    }

    public void setPlam7(RichPanelLabelAndMessage plam7) {
        this.plam7 = plam7;
    }

    public RichPanelLabelAndMessage getPlam7() {
        return plam7;
    }

    public void setOt30(RichOutputText ot30) {
        this.ot30 = ot30;
    }

    public RichOutputText getOt30() {
        return ot30;
    }

    public void setPlam8(RichPanelLabelAndMessage plam8) {
        this.plam8 = plam8;
    }

    public RichPanelLabelAndMessage getPlam8() {
        return plam8;
    }

    public void setOt31(RichOutputText ot31) {
        this.ot31 = ot31;
    }

    public RichOutputText getOt31() {
        return ot31;
    }

    public void setIt9(RichInputText it9) {
        this.it9 = it9;
    }

    public RichInputText getIt9() {
        return it9;
    }

    public void setPlam9(RichPanelLabelAndMessage plam9) {
        this.plam9 = plam9;
    }

    public RichPanelLabelAndMessage getPlam9() {
        return plam9;
    }

    public void setOt32(RichOutputText ot32) {
        this.ot32 = ot32;
    }

    public RichOutputText getOt32() {
        return ot32;
    }

    public void setPlam10(RichPanelLabelAndMessage plam10) {
        this.plam10 = plam10;
    }

    public RichPanelLabelAndMessage getPlam10() {
        return plam10;
    }

    public void setOt33(RichOutputText ot33) {
        this.ot33 = ot33;
    }

    public RichOutputText getOt33() {
        return ot33;
    }

    public void setPlam11(RichPanelLabelAndMessage plam11) {
        this.plam11 = plam11;
    }

    public RichPanelLabelAndMessage getPlam11() {
        return plam11;
    }

    public void setOt34(RichOutputText ot34) {
        this.ot34 = ot34;
    }

    public RichOutputText getOt34() {
        return ot34;
    }

    public void setPlam12(RichPanelLabelAndMessage plam12) {
        this.plam12 = plam12;
    }

    public RichPanelLabelAndMessage getPlam12() {
        return plam12;
    }

    public void setOt35(RichOutputText ot35) {
        this.ot35 = ot35;
    }

    public RichOutputText getOt35() {
        return ot35;
    }

    public void setPgl5(RichPanelGroupLayout pgl5) {
        this.pgl5 = pgl5;
    }

    public RichPanelGroupLayout getPgl5() {
        return pgl5;
    }
    public void setPgl15(RichPanelGroupLayout pgl5) {
        this.pgl15 = pgl5;
    }

    public RichPanelGroupLayout getPgl15() {
        return pgl15;
    }
    public void setPgl8(RichPanelGroupLayout pgl8) {
        this.pgl8 = pgl8;
    }

    public RichPanelGroupLayout getPgl8() {
        return pgl8;
    }

    public void setPgl7(RichPanelGroupLayout pgl7) {
        this.pgl7 = pgl7;
    }

    public RichPanelGroupLayout getPgl7() {
        return pgl7;
    }


    public void setB14(RichButton b14) {
        this.b14 = b14;
    }

    public RichButton getB14() {
        return b14;
    }


    public void setB17(RichButton b17) {
        this.b17 = b17;
    }

    public RichButton getB17() {
        return b17;
    }

    public void setB18(RichButton b18) {
        this.b18 = b18;
    }

    public RichButton getB18() {
        return b18;
    }

    public void setB15(RichButton b15) {
        this.b15 = b15;
    }

    public RichButton getB15() {
        return b15;
    }

    public void setB16(RichButton b16) {
        this.b16 = b16;
    }

    public RichButton getB16() {
        return b16;
    }

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }

    public String buttonChiTietCommit_action() {
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
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public void setPh4(RichPanelHeader ph4) {
        this.ph4 = ph4;
    }

    public RichPanelHeader getPh4() {
        return ph4;
    }
    public void refreshData(){
    
    }
    public String btnChungTuNhapHangCommit_action() {
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
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public String btnChitetHangHoaRollback_action() {
        System.out.println("Rollback Execute ...");
        BindingContainer bindings = getBindings();
        //Get Iterator of table
        DCIteratorBinding parentIter = (DCIteratorBinding)bindings.get("ChungTuMuaHangView1"+"Iterator");
             //Get current row key
        Key parentKey = parentIter.getCurrentRow().getKey();
        OperationBinding operationBinding = bindings.getOperationBinding("Rollback");
        Object result = operationBinding.execute();
        parentIter.executeQuery();
        parentIter.setCurrentRowWithKey(parentKey.toStringFormat(true));
        //if (!operationBinding.getErrors().isEmpty()) {
        //    return null;
        //}
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public String btnChungTuRollBack_action() {
        System.out.println("Rollback Execute ...");
        BindingContainer bindings = getBindings();
        //Get Iterator of table
        DCIteratorBinding parentIter = (DCIteratorBinding)bindings.get("ChungTuMuaHangView1"+"Iterator");
             //Get current row key
        Key parentKey = parentIter.getCurrentRow().getKey();
        OperationBinding operationBinding = bindings.getOperationBinding("Rollback");
        Object result = operationBinding.execute();
        parentIter.executeQuery();
        parentIter.setCurrentRowWithKey(parentKey.toStringFormat(true));
        //if (!operationBinding.getErrors().isEmpty()) {
        //    return null;
        //}
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    

    public void setQq1(RichQuickQuery qq1) {
        this.qq1 = qq1;
    }

    public RichQuickQuery getQq1() {
        return qq1;
    }

    public void setCl1(RichCommandLink cl1) {
        this.cl1 = cl1;
    }

    public RichCommandLink getCl1() {
        return cl1;
    }

    public void setT3(RichTable t3) {
        this.t3 = t3;
    }

    public RichTable getT3() {
        return t3;
    }

    public void setPs2(RichPanelSplitter ps2) {
        this.ps2 = ps2;
    }

    public RichPanelSplitter getPs2() {
        return ps2;
    }

    public void setPs3(RichPanelSplitter ps3) {
        this.ps3 = ps3;
    }

    public RichPanelSplitter getPs3() {
        return ps3;
    }

    public void setT2(RichToolbar t2) {
        this.t2 = t2;
    }

    public RichToolbar getT2() {
        return t2;
    }

    public void setB1(RichButton b1) {
        this.b1 = b1;
    }

    public RichButton getB1() {
        return b1;
    }

    public void setPt2(RichPanelTabbed pt2) {
        this.pt2 = pt2;
    }

    public RichPanelTabbed getPt2() {
        return pt2;
    }

    public void setTab1(RichShowDetailItem tab1) {
        this.tab1 = tab1;
    }

    public RichShowDetailItem getTab1() {
        return tab1;
    }

    public void setSdi1(RichShowDetailItem sdi1) {
        this.sdi1 = sdi1;
    }

    public RichShowDetailItem getSdi1() {
        return sdi1;
    }

    public void setPs4(RichPanelSplitter ps4) {
        this.ps4 = ps4;
    }

    public RichPanelSplitter getPs4() {
        return ps4;
    }

    public void setT4(RichTable t4) {
        this.t4 = t4;
    }

    public RichTable getT4() {
        return t4;
    }

    public void setPc3(RichPanelCollection pc3) {
        this.pc3 = pc3;
    }

    public RichPanelCollection getPc3() {
        return pc3;
    }


    public void setB2(RichButton b2) {
        this.b2 = b2;
    }

    public RichButton getB2() {
        return b2;
    }

    public void setPfl3(RichPanelFormLayout pfl3) {
        this.pfl3 = pfl3;
    }

    public RichPanelFormLayout getPfl3() {
        return pfl3;
    }

    public void setPlam13(RichPanelLabelAndMessage plam13) {
        this.plam13 = plam13;
    }

    public RichPanelLabelAndMessage getPlam13() {
        return plam13;
    }

    public void setOt36(RichOutputText ot36) {
        this.ot36 = ot36;
    }

    public RichOutputText getOt36() {
        return ot36;
    }

    public void setIt16(RichInputText it16) {
        this.it16 = it16;
    }

    public RichInputText getIt16() {
        return it16;
    }

    public void setId5(RichInputDate id5) {
        this.id5 = id5;
    }

    public RichInputDate getId5() {
        return id5;
    }

    public void setIt17(RichInputText it17) {
        this.it17 = it17;
    }

    public RichInputText getIt17() {
        return it17;
    }

    public void setIt18(RichInputText it18) {
        this.it18 = it18;
    }

    public RichInputText getIt18() {
        return it18;
    }

    public void setIt19(RichInputText it19) {
        this.it19 = it19;
    }

    public RichInputText getIt19() {
        return it19;
    }

    public void setIt20(RichInputText it20) {
        this.it20 = it20;
    }

    public RichInputText getIt20() {
        return it20;
    }

    public void setSoc11(RichSelectOneChoice soc11) {
        this.soc11 = soc11;
    }

    public RichSelectOneChoice getSoc11() {
        return soc11;
    }

    public void setSi11(UISelectItems si11) {
        this.si11 = si11;
    }

    public UISelectItems getSi11() {
        return si11;
    }

    public void setSoc12(RichSelectOneChoice soc12) {
        this.soc12 = soc12;
    }

    public RichSelectOneChoice getSoc12() {
        return soc12;
    }

    public void setSi12(UISelectItems si12) {
        this.si12 = si12;
    }

    public UISelectItems getSi12() {
        return si12;
    }


    public void setOt37(RichOutputText ot37) {
        this.ot37 = ot37;
    }

    public RichOutputText getOt37() {
        return ot37;
    }

    public void setPlam15(RichPanelLabelAndMessage plam15) {
        this.plam15 = plam15;
    }

    public RichPanelLabelAndMessage getPlam15() {
        return plam15;
    }

    public void setOt38(RichOutputText ot38) {
        this.ot38 = ot38;
    }

    public RichOutputText getOt38() {
        return ot38;
    }

    public void setPlam16(RichPanelLabelAndMessage plam16) {
        this.plam16 = plam16;
    }

    public RichPanelLabelAndMessage getPlam16() {
        return plam16;
    }

    public void setOt39(RichOutputText ot39) {
        this.ot39 = ot39;
    }

    public RichOutputText getOt39() {
        return ot39;
    }

    public void setPlam17(RichPanelLabelAndMessage plam17) {
        this.plam17 = plam17;
    }

    public RichPanelLabelAndMessage getPlam17() {
        return plam17;
    }

    public void setOt40(RichOutputText ot40) {
        this.ot40 = ot40;
    }

    public RichOutputText getOt40() {
        return ot40;
    }

    public void setPgl51(RichPanelGroupLayout pgl51) {
        this.pgl51 = pgl51;
    }

    public RichPanelGroupLayout getPgl51() {
        return pgl51;
    }

    public void setPgl52(RichPanelGroupLayout pgl52) {
        this.pgl52 = pgl52;
    }

    public RichPanelGroupLayout getPgl52() {
        return pgl52;
    }

    public void setB91(RichButton b9) {
        this.b91 = b9;
    }

    public RichButton getB91() {
        return b91;
    }

    public void setB92(RichButton b9) {
        this.b92 = b9;
    }

    public RichButton getB92() {
        return b92;
    }

    public void setB3(RichButton b3) {
        this.b3 = b3;
    }

    public RichButton getB3() {
        return b3;
    }

    public void setB4(RichButton b4) {
        this.b4 = b4;
    }

    public RichButton getB4() {
        return b4;
    }

    public void setB94(RichButton b9) {
        this.b94 = b9;
    }

    public RichButton getB94() {
        return b94;
    }
    
    public void setB95(RichButton b9) {
        this.b95 = b9;
    }

    public RichButton getB95() {
        return b95;
    }


    public void setB21(RichButton b2) {
        this.b21 = b2;
    }

    public RichButton getB21() {
        return b21;
    }

    public void setB81(RichButton b8) {
        this.b8 = b8;
    }

    public RichButton getB81() {
        return b8;
    }

    public void setB93(RichButton b9) {
        this.b93 = b9;
    }

    public RichButton getB93() {
        return b93;
    }

    public void setB10(RichButton b10) {
        this.b10 = b10;
    }

    public RichButton getB10() {
        return b10;
    }

    public void setPfl4(RichPanelFormLayout pfl4) {
        this.pfl4 = pfl4;
    }

    public RichPanelFormLayout getPfl4() {
        return pfl4;
    }

    public void setPlam18(RichPanelLabelAndMessage plam18) {
        this.plam18 = plam18;
    }

    public RichPanelLabelAndMessage getPlam18() {
        return plam18;
    }

    public void setOt41(RichOutputText ot41) {
        this.ot41 = ot41;
    }

    public RichOutputText getOt41() {
        return ot41;
    }

    public void setIt21(RichInputText it21) {
        this.it21 = it21;
    }

    public RichInputText getIt21() {
        return it21;
    }

    public void setId6(RichInputDate id6) {
        this.id6 = id6;
    }

    public RichInputDate getId6() {
        return id6;
    }

    public void setIt22(RichInputText it22) {
        this.it22 = it22;
    }

    public RichInputText getIt22() {
        return it22;
    }

    public void setIt23(RichInputText it23) {
        this.it23 = it23;
    }

    public RichInputText getIt23() {
        return it23;
    }

    public void setIt24(RichInputText it24) {
        this.it24 = it24;
    }

    public RichInputText getIt24() {
        return it24;
    }

    public void setIt25(RichInputText it25) {
        this.it25 = it25;
    }

    public RichInputText getIt25() {
        return it25;
    }

    public void setSoc13(RichSelectOneChoice soc13) {
        this.soc13 = soc13;
    }

    public RichSelectOneChoice getSoc13() {
        return soc13;
    }

    public void setSi13(UISelectItems si13) {
        this.si13 = si13;
    }

    public UISelectItems getSi13() {
        return si13;
    }

    public void setSoc14(RichSelectOneChoice soc14) {
        this.soc14 = soc14;
    }

    public RichSelectOneChoice getSoc14() {
        return soc14;
    }

    public void setSi14(UISelectItems si14) {
        this.si14 = si14;
    }

    public UISelectItems getSi14() {
        return si14;
    }

    public void setPlam19(RichPanelLabelAndMessage plam19) {
        this.plam19 = plam19;
    }

    public RichPanelLabelAndMessage getPlam19() {
        return plam19;
    }

    public void setOt42(RichOutputText ot42) {
        this.ot42 = ot42;
    }

    public RichOutputText getOt42() {
        return ot42;
    }

    public void setPlam20(RichPanelLabelAndMessage plam20) {
        this.plam20 = plam20;
    }

    public RichPanelLabelAndMessage getPlam20() {
        return plam20;
    }

    public void setOt43(RichOutputText ot43) {
        this.ot43 = ot43;
    }

    public RichOutputText getOt43() {
        return ot43;
    }

    public void setIt26(RichInputText it26) {
        this.it26 = it26;
    }

    public RichInputText getIt26() {
        return it26;
    }

    public void setPlam21(RichPanelLabelAndMessage plam21) {
        this.plam21 = plam21;
    }

    public RichPanelLabelAndMessage getPlam21() {
        return plam21;
    }

    public void setOt44(RichOutputText ot44) {
        this.ot44 = ot44;
    }

    public RichOutputText getOt44() {
        return ot44;
    }


    public void setB96(RichButton b10) {
        this.b96 = b10;
    }

    public RichButton getB96() {
        return b96;
    }
    public void setB97(RichButton b10) {
        this.b97 = b10;
    }

    public RichButton getB97() {
        return b97;
    }
    
    public void setB98(RichButton b10) {
        this.b98 = b10;
    }

    public RichButton getB98() {
        return b98;
    }
    public void setB99(RichButton b10) {
        this.b99 = b10;
    }

    public RichButton getB99() {
        return b99;
    }

    public void setB11(RichButton b11) {
        this.b11 = b11;
    }

    public RichButton getB11() {
        return b11;
    }

    public void setB12(RichButton b12) {
        this.b12 = b12;
    }

    public RichButton getB12() {
        return b12;
    }

    public void setB13(RichButton b13) {
        this.b13 = b13;
    }

    public RichButton getB13() {
        return b13;
    }

    public void setPlam140(RichPanelLabelAndMessage plam14) {
        this.plam140 = plam14;
    }

    public RichPanelLabelAndMessage getPlam140() {
        return plam140;
    }

    public void setOt370(RichOutputText ot37) {
        this.ot370 = ot37;
    }

    public RichOutputText getOt370() {
        return ot370;
    }

    public void setPlam141(RichPanelLabelAndMessage plam14) {
        this.plam141= plam14;
    }

    public RichPanelLabelAndMessage getPlam141() {
        return plam141;
    }


    public void setSoc120(RichSelectOneChoice soc12) {
        this.soc120 = soc12;
    }

    public RichSelectOneChoice getSoc120() {
        return soc120;
    }

    public void setSi120(UISelectItems si12) {
        this.si120 = si12;
    }

    public UISelectItems getSi120() {
        return si120;
    }

    public void setPlam14(RichPanelLabelAndMessage plam14) {
        this.plam14 = plam14;
    }

    public RichPanelLabelAndMessage getPlam14() {
        return plam14;
    }

    public void setOt371(RichOutputText ot37) {
        this.ot371 = ot37;
    }

    public RichOutputText getOt371() {
        return ot37;
    }

    public void setPlam150(RichPanelLabelAndMessage plam15) {
        this.plam150 = plam15;
    }

    public RichPanelLabelAndMessage getPlam150() {
        return plam150;
    }

    public void setOt380(RichOutputText ot38) {
        this.ot380 = ot38;
    }

    public RichOutputText getOt380() {
        return ot380;
    }
}
