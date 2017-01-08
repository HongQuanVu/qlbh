package view.backing;

import javax.faces.component.UISelectItems;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.RichMenu;
import oracle.adf.view.rich.component.rich.RichQuery;
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
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.nav.RichCommandMenuItem;
import oracle.adf.view.rich.component.rich.output.RichMessages;
import oracle.adf.view.rich.component.rich.output.RichOutputText;
import oracle.adf.view.rich.component.rich.output.RichPanelCollection;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.Key;

public class DanhSachHoaDonBanHang {
    private RichForm f1;
    private RichDocument d1;
    private RichPanelSplitter ps1;
    private RichPanelSplitter ps2;
    private RichPanelGroupLayout pgl1;
    private RichPanelHeader ph1;
    private RichQuery qryId1;
    private RichTable resId1;
    private RichMessages m1;
    private RichPanelCollection pc1;
    private RichMenu m2;
    private RichCommandMenuItem cmi1;
    private RichPanelFormLayout pfl1;
    private RichPanelLabelAndMessage plam1;
    private RichOutputText ot16;
    private RichInputText it1;
    private RichInputText it2;
    private RichInputDate id1;
    private RichSelectOneChoice soc1;
    private UISelectItems si1;
    private RichInputText it3;
    private RichInputText it4;
    private RichInputText it5;
    private RichInputText it6;
    private RichSelectOneChoice soc2;
    private UISelectItems si2;
    private RichPanelLabelAndMessage plam3;
    private RichOutputText ot18;
    private RichPanelLabelAndMessage plam4;
    private RichOutputText ot19;
    private RichPanelLabelAndMessage plam5;
    private RichOutputText ot20;
    private RichPanelLabelAndMessage plam6;
    private RichOutputText ot21;
    private RichPanelGroupLayout pgl2;
    private RichPanelGroupLayout pgl3;
    private RichButton b1;
    private RichButton b2;
    private RichButton b3;
    private RichButton b4;
    private RichButton b5;
    private RichButton b6;
    private RichButton b7;
    private RichButton b8;
    private RichButton b9;
    private RichPanelGroupLayout pgl4;
    private RichPanelSplitter ps3;
    private RichSelectOneChoice soc8;
    private UISelectItems si8;
    private RichPanelLabelAndMessage plam2;
    private RichOutputText ot4;
    private RichTable t1;
    private RichPanelFormLayout pfl2;
    private RichPanelLabelAndMessage plam7;
    private RichOutputText ot27;
    private RichPanelLabelAndMessage plam8;
    private RichOutputText ot28;
    private RichSelectOneChoice soc6;
    private UISelectItems si6;
    private RichInputText it7;
    private RichSelectOneChoice soc7;
    private UISelectItems si7;
    private RichInputText it8;
    private RichInputText it9;
    private RichInputText it10;
    private RichSelectOneChoice soc9;
    private UISelectItems si9;
    private RichPanelLabelAndMessage plam9;
    private RichOutputText ot29;
    private RichPanelLabelAndMessage plam10;
    private RichOutputText ot30;
    private RichInputText it11;
    private RichPanelGroupLayout pgl6;
    private RichPanelGroupLayout pgl5;
    private RichButton b10;
    private RichButton b11;
    private RichButton b12;
    private RichButton b13;
    private RichButton b14;
    private RichButton b15;
    private RichButton b16;
    private RichButton b17;
    private RichButton b18;
    private RichPanelLabelAndMessage plam11;
    private RichOutputText ot31;
    private RichPanelLabelAndMessage plam12;
    private RichOutputText ot34;
    private RichPanelLabelAndMessage plam13;
    private RichOutputText ot35;
    private RichPanelLabelAndMessage plam14;
    private RichOutputText ot36;
    private RichInputText it12;
    private RichInputText it13;
    private RichPanelCollection pc2;
    private RichMenu m3;
    private RichCommandMenuItem cmi2;
    private RichPanelTabbed pt2;
    private RichShowDetailItem tabChiTietHoaDon;
    private RichShowDetailItem sdi1;
    private RichPanelFormLayout pfl3;
    private RichPanelLabelAndMessage plam15;
    private RichOutputText ot37;
    private RichInputText it14;
    private RichInputDate id2;
    private RichInputText it15;
    private RichInputText it16;
    private RichInputText it17;
    private RichPanelLabelAndMessage plam16;
    private RichOutputText ot38;
    private RichSelectOneChoice soc10;
    private UISelectItems si10;
    private RichSelectOneChoice soc11;
    private UISelectItems si11;
    private RichInputText it18;
    private RichPanelGroupLayout pgl7;
    private RichButton b19;
    private RichButton b20;
    private RichButton b21;
    private RichButton b22;
    private RichPanelSplitter ps4;
    private RichPanelSplitter ps5;
    private RichTable t2;
    private RichButton b23;
    private RichButton b24;
    private RichButton b25;
    private RichButton b26;
    private RichPanelLabelAndMessage plam17;
    private RichOutputText ot48;
    private RichPanelLabelAndMessage plam18;
    private RichOutputText ot49;

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

    public void setPs1(RichPanelSplitter ps1) {
        this.ps1 = ps1;
    }

    public RichPanelSplitter getPs1() {
        return ps1;
    }

    public void setPs2(RichPanelSplitter ps2) {
        this.ps2 = ps2;
    }

    public RichPanelSplitter getPs2() {
        return ps2;
    }

    public void setPgl1(RichPanelGroupLayout pgl1) {
        this.pgl1 = pgl1;
    }

    public RichPanelGroupLayout getPgl1() {
        return pgl1;
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

    public void setM1(RichMessages m1) {
        this.m1 = m1;
    }

    public RichMessages getM1() {
        return m1;
    }

    public void setPc1(RichPanelCollection pc1) {
        this.pc1 = pc1;
    }

    public RichPanelCollection getPc1() {
        return pc1;
    }

    public void setM2(RichMenu m2) {
        this.m2 = m2;
    }

    public RichMenu getM2() {
        return m2;
    }

    public void setCmi1(RichCommandMenuItem cmi1) {
        this.cmi1 = cmi1;
    }

    public RichCommandMenuItem getCmi1() {
        return cmi1;
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

    public void setOt16(RichOutputText ot16) {
        this.ot16 = ot16;
    }

    public RichOutputText getOt16() {
        return ot16;
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


    public void setId1(RichInputDate id1) {
        this.id1 = id1;
    }

    public RichInputDate getId1() {
        return id1;
    }

    public void setSoc1(RichSelectOneChoice soc1) {
        this.soc1 = soc1;
    }

    public RichSelectOneChoice getSoc1() {
        return soc1;
    }

    public void setSi1(UISelectItems si1) {
        this.si1 = si1;
    }

    public UISelectItems getSi1() {
        return si1;
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

    public void setSoc2(RichSelectOneChoice soc2) {
        this.soc2 = soc2;
    }

    public RichSelectOneChoice getSoc2() {
        return soc2;
    }

    public void setSi2(UISelectItems si2) {
        this.si2 = si2;
    }

    public UISelectItems getSi2() {
        return si2;
    }

    public void setPlam3(RichPanelLabelAndMessage plam3) {
        this.plam3 = plam3;
    }

    public RichPanelLabelAndMessage getPlam3() {
        return plam3;
    }

    public void setOt18(RichOutputText ot18) {
        this.ot18 = ot18;
    }

    public RichOutputText getOt18() {
        return ot18;
    }

    public void setPlam4(RichPanelLabelAndMessage plam4) {
        this.plam4 = plam4;
    }

    public RichPanelLabelAndMessage getPlam4() {
        return plam4;
    }

    public void setOt19(RichOutputText ot19) {
        this.ot19 = ot19;
    }

    public RichOutputText getOt19() {
        return ot19;
    }

    public void setPlam5(RichPanelLabelAndMessage plam5) {
        this.plam5 = plam5;
    }

    public RichPanelLabelAndMessage getPlam5() {
        return plam5;
    }

    public void setOt20(RichOutputText ot20) {
        this.ot20 = ot20;
    }

    public RichOutputText getOt20() {
        return ot20;
    }

    public void setPlam6(RichPanelLabelAndMessage plam6) {
        this.plam6 = plam6;
    }

    public RichPanelLabelAndMessage getPlam6() {
        return plam6;
    }

    public void setOt21(RichOutputText ot21) {
        this.ot21 = ot21;
    }

    public RichOutputText getOt21() {
        return ot21;
    }

    public void setPgl2(RichPanelGroupLayout pgl2) {
        this.pgl2 = pgl2;
    }

    public RichPanelGroupLayout getPgl2() {
        return pgl2;
    }

    public void setPgl3(RichPanelGroupLayout pgl3) {
        this.pgl3 = pgl3;
    }

    public RichPanelGroupLayout getPgl3() {
        return pgl3;
    }

    public void setB1(RichButton b1) {
        this.b1 = b1;
    }

    public RichButton getB1() {
        return b1;
    }

    public void setB2(RichButton b2) {
        this.b2 = b2;
    }

    public RichButton getB2() {
        return b2;
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


    public void setPgl4(RichPanelGroupLayout pgl4) {
        this.pgl4 = pgl4;
    }

    public RichPanelGroupLayout getPgl4() {
        return pgl4;
    }


    public void setPs3(RichPanelSplitter ps3) {
        this.ps3 = ps3;
    }

    public RichPanelSplitter getPs3() {
        return ps3;
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

    public void setPlam2(RichPanelLabelAndMessage plam2) {
        this.plam2 = plam2;
    }

    public RichPanelLabelAndMessage getPlam2() {
        return plam2;
    }

    public void setOt4(RichOutputText ot4) {
        this.ot4 = ot4;
    }

    public RichOutputText getOt4() {
        return ot4;
    }

    public void setT1(RichTable t1) {
        this.t1 = t1;
    }

    public RichTable getT1() {
        return t1;
    }

    public void setPfl2(RichPanelFormLayout pfl2) {
        this.pfl2 = pfl2;
    }

    public RichPanelFormLayout getPfl2() {
        return pfl2;
    }

    public void setPlam7(RichPanelLabelAndMessage plam7) {
        this.plam7 = plam7;
    }

    public RichPanelLabelAndMessage getPlam7() {
        return plam7;
    }

    public void setOt27(RichOutputText ot27) {
        this.ot27 = ot27;
    }

    public RichOutputText getOt27() {
        return ot27;
    }

    public void setPlam8(RichPanelLabelAndMessage plam8) {
        this.plam8 = plam8;
    }

    public RichPanelLabelAndMessage getPlam8() {
        return plam8;
    }

    public void setOt28(RichOutputText ot28) {
        this.ot28 = ot28;
    }

    public RichOutputText getOt28() {
        return ot28;
    }

    public void setSoc6(RichSelectOneChoice soc6) {
        this.soc6 = soc6;
    }

    public RichSelectOneChoice getSoc6() {
        return soc6;
    }

    public void setSi6(UISelectItems si6) {
        this.si6 = si6;
    }

    public UISelectItems getSi6() {
        return si6;
    }

    public void setIt7(RichInputText it7) {
        this.it7 = it7;
    }

    public RichInputText getIt7() {
        return it7;
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

    public void setIt8(RichInputText it8) {
        this.it8 = it8;
    }

    public RichInputText getIt8() {
        return it8;
    }

    public void setIt9(RichInputText it9) {
        this.it9 = it9;
    }

    public RichInputText getIt9() {
        return it9;
    }

    public void setIt10(RichInputText it10) {
        this.it10 = it10;
    }

    public RichInputText getIt10() {
        return it10;
    }

    public void setSoc9(RichSelectOneChoice soc9) {
        this.soc9 = soc9;
    }

    public RichSelectOneChoice getSoc9() {
        return soc9;
    }

    public void setSi9(UISelectItems si9) {
        this.si9 = si9;
    }

    public UISelectItems getSi9() {
        return si9;
    }

    public void setPlam9(RichPanelLabelAndMessage plam9) {
        this.plam9 = plam9;
    }

    public RichPanelLabelAndMessage getPlam9() {
        return plam9;
    }

    public void setOt29(RichOutputText ot29) {
        this.ot29 = ot29;
    }

    public RichOutputText getOt29() {
        return ot29;
    }

    public void setPlam10(RichPanelLabelAndMessage plam10) {
        this.plam10 = plam10;
    }

    public RichPanelLabelAndMessage getPlam10() {
        return plam10;
    }

    public void setOt30(RichOutputText ot30) {
        this.ot30 = ot30;
    }

    public RichOutputText getOt30() {
        return ot30;
    }

    public void setIt11(RichInputText it11) {
        this.it11 = it11;
    }

    public RichInputText getIt11() {
        return it11;
    }

    public void setPgl6(RichPanelGroupLayout pgl6) {
        this.pgl6 = pgl6;
    }

    public RichPanelGroupLayout getPgl6() {
        return pgl6;
    }

    public void setPgl5(RichPanelGroupLayout pgl5) {
        this.pgl5 = pgl5;
    }

    public RichPanelGroupLayout getPgl5() {
        return pgl5;
    }

    public void setB10(RichButton b10) {
        this.b10 = b10;
    }

    public RichButton getB10() {
        return b10;
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

    public void setB14(RichButton b14) {
        this.b14 = b14;
    }

    public RichButton getB14() {
        return b14;
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

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }
    
    
    public String btnChitetHangHoaRollback_action() {
        System.out.println("Rollback Execute ...");
        BindingContainer bindings = getBindings();
        //Get Iterator of table
        DCIteratorBinding currentIter =(DCIteratorBinding)bindings.get("ChiTietHoaDonBanHangView2"+"Iterator");
        DCIteratorBinding parentIter = (DCIteratorBinding)bindings.get("HoaDonBanHangView1"+"Iterator");
        
        Key parentKey = null ;
        if ( parentIter.getCurrentRow()!=null)
             parentKey = parentIter.getCurrentRow().getKey();
        //Get current row key
        Key currentKey = null ;
        if ( currentIter.getCurrentRow()!=null)
             currentKey = currentIter.getCurrentRow().getKey();
        
        OperationBinding operationBinding = bindings.getOperationBinding("Rollback");
        Object result = operationBinding.execute();
        parentIter.executeQuery();
        if(parentKey!=null)
            parentIter.setCurrentRowWithKey(parentKey.toStringFormat(true));
        if(currentKey!=null)
            currentIter.setCurrentRowWithKey(currentKey.toStringFormat(true));
        
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    
    public String btnHoaDonChiTietCommit_action() {
        
        BindingContainer bindings = getBindings();
        //Get Iterator of table
        DCIteratorBinding currentIter =(DCIteratorBinding)bindings.get("ChiTietHoaDonBanHangView2"+"Iterator");
        DCIteratorBinding parentIter = (DCIteratorBinding)bindings.get("HoaDonBanHangView1"+"Iterator");
        
        Key parentKey = null ;
        if ( parentIter.getCurrentRow()!=null)
             parentKey = parentIter.getCurrentRow().getKey();
        //Get current row key
        Key currentKey = null ;
        if ( currentIter.getCurrentRow()!=null)
             currentKey = currentIter.getCurrentRow().getKey();
        
        OperationBinding operationBinding = bindings.getOperationBinding("Commit");
        Object result = operationBinding.execute();
        parentIter.executeQuery();
        if(parentKey!=null)
            parentIter.setCurrentRowWithKey(parentKey.toStringFormat(true));
        if(currentKey!=null)
            currentIter.setCurrentRowWithKey(currentKey.toStringFormat(true));
 
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
        
    }

    public String btnHoaDonCommit_action() {
        BindingContainer bindings = getBindings();
        //Get Iterator of table
        DCIteratorBinding parentIter = (DCIteratorBinding)bindings.get("HoaDonBanHangView1"+"Iterator");
             //Get current row key
        Key parentKey = null ;
        if ( parentIter.getCurrentRow()!=null)
             parentKey = parentIter.getCurrentRow().getKey();
        OperationBinding operationBinding = bindings.getOperationBinding("Commit");
        Object result = operationBinding.execute();
        parentIter.executeQuery();
        if(parentKey!=null)
            parentIter.setCurrentRowWithKey(parentKey.toStringFormat(true));
        //if (!operationBinding.getErrors().isEmpty()) {
        //    return null;
        //}
        if (!operationBinding.getErrors().isEmpty()) {
            return null;
        }
        return null;
    }

    public String btnHoaDonRollback_action() {
        System.out.println("Rollback Execute ...");
        BindingContainer bindings = getBindings();
        //Get Iterator of table
        DCIteratorBinding parentIter = (DCIteratorBinding)bindings.get("HoaDonBanHangView1"+"Iterator");
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

    public void setPlam11(RichPanelLabelAndMessage plam11) {
        this.plam11 = plam11;
    }

    public RichPanelLabelAndMessage getPlam11() {
        return plam11;
    }

    public void setOt31(RichOutputText ot31) {
        this.ot31 = ot31;
    }

    public RichOutputText getOt31() {
        return ot31;
    }

    public void setPlam12(RichPanelLabelAndMessage plam12) {
        this.plam12 = plam12;
    }

    public RichPanelLabelAndMessage getPlam12() {
        return plam12;
    }

    public void setOt34(RichOutputText ot34) {
        this.ot34 = ot34;
    }

    public RichOutputText getOt34() {
        return ot34;
    }

    public void setPlam13(RichPanelLabelAndMessage plam13) {
        this.plam13 = plam13;
    }

    public RichPanelLabelAndMessage getPlam13() {
        return plam13;
    }

    public void setOt35(RichOutputText ot35) {
        this.ot35 = ot35;
    }

    public RichOutputText getOt35() {
        return ot35;
    }

    public void setPlam14(RichPanelLabelAndMessage plam14) {
        this.plam14 = plam14;
    }

    public RichPanelLabelAndMessage getPlam14() {
        return plam14;
    }

    public void setOt36(RichOutputText ot36) {
        this.ot36 = ot36;
    }

    public RichOutputText getOt36() {
        return ot36;
    }

    public void setIt12(RichInputText it12) {
        this.it12 = it12;
    }

    public RichInputText getIt12() {
        return it12;
    }

    public void setIt13(RichInputText it13) {
        this.it13 = it13;
    }

    public RichInputText getIt13() {
        return it13;
    }

    public void setPc2(RichPanelCollection pc2) {
        this.pc2 = pc2;
    }

    public RichPanelCollection getPc2() {
        return pc2;
    }

    public void setM3(RichMenu m3) {
        this.m3 = m3;
    }

    public RichMenu getM3() {
        return m3;
    }

    public void setCmi2(RichCommandMenuItem cmi2) {
        this.cmi2 = cmi2;
    }

    public RichCommandMenuItem getCmi2() {
        return cmi2;
    }

    public void setPt2(RichPanelTabbed pt2) {
        this.pt2 = pt2;
    }

    public RichPanelTabbed getPt2() {
        return pt2;
    }

    public void setTabChiTietHoaDon(RichShowDetailItem tabChiTietHoaDon) {
        this.tabChiTietHoaDon = tabChiTietHoaDon;
    }

    public RichShowDetailItem getTabChiTietHoaDon() {
        return tabChiTietHoaDon;
    }


    public void setSdi1(RichShowDetailItem sdi1) {
        this.sdi1 = sdi1;
    }

    public RichShowDetailItem getSdi1() {
        return sdi1;
    }


    public void setPfl3(RichPanelFormLayout pfl3) {
        this.pfl3 = pfl3;
    }

    public RichPanelFormLayout getPfl3() {
        return pfl3;
    }

    public void setPlam15(RichPanelLabelAndMessage plam15) {
        this.plam15 = plam15;
    }

    public RichPanelLabelAndMessage getPlam15() {
        return plam15;
    }

    public void setOt37(RichOutputText ot37) {
        this.ot37 = ot37;
    }

    public RichOutputText getOt37() {
        return ot37;
    }

    public void setIt14(RichInputText it14) {
        this.it14 = it14;
    }

    public RichInputText getIt14() {
        return it14;
    }

    public void setId2(RichInputDate id2) {
        this.id2 = id2;
    }

    public RichInputDate getId2() {
        return id2;
    }

    public void setIt15(RichInputText it15) {
        this.it15 = it15;
    }

    public RichInputText getIt15() {
        return it15;
    }

    public void setIt16(RichInputText it16) {
        this.it16 = it16;
    }

    public RichInputText getIt16() {
        return it16;
    }

    public void setIt17(RichInputText it17) {
        this.it17 = it17;
    }

    public RichInputText getIt17() {
        return it17;
    }

    public void setPlam16(RichPanelLabelAndMessage plam16) {
        this.plam16 = plam16;
    }

    public RichPanelLabelAndMessage getPlam16() {
        return plam16;
    }

    public void setOt38(RichOutputText ot38) {
        this.ot38 = ot38;
    }

    public RichOutputText getOt38() {
        return ot38;
    }

    public void setSoc10(RichSelectOneChoice soc10) {
        this.soc10 = soc10;
    }

    public RichSelectOneChoice getSoc10() {
        return soc10;
    }

    public void setSi10(UISelectItems si10) {
        this.si10 = si10;
    }

    public UISelectItems getSi10() {
        return si10;
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

    public void setIt18(RichInputText it18) {
        this.it18 = it18;
    }

    public RichInputText getIt18() {
        return it18;
    }

    public void setPgl7(RichPanelGroupLayout pgl7) {
        this.pgl7 = pgl7;
    }

    public RichPanelGroupLayout getPgl7() {
        return pgl7;
    }

    public void setB19(RichButton b19) {
        this.b19 = b19;
    }

    public RichButton getB19() {
        return b19;
    }

    public void setB20(RichButton b20) {
        this.b20 = b20;
    }

    public RichButton getB20() {
        return b20;
    }

    public void setB21(RichButton b21) {
        this.b21 = b21;
    }

    public RichButton getB21() {
        return b21;
    }

    public void setB22(RichButton b22) {
        this.b22 = b22;
    }

    public RichButton getB22() {
        return b22;
    }

    public void setPs4(RichPanelSplitter ps4) {
        this.ps4 = ps4;
    }

    public RichPanelSplitter getPs4() {
        return ps4;
    }

    public void setPs5(RichPanelSplitter ps5) {
        this.ps5 = ps5;
    }

    public RichPanelSplitter getPs5() {
        return ps5;
    }

    public void setT2(RichTable t2) {
        this.t2 = t2;
    }

    public RichTable getT2() {
        return t2;
    }

    public void setB23(RichButton b23) {
        this.b23 = b23;
    }

    public RichButton getB23() {
        return b23;
    }

    public void setB24(RichButton b24) {
        this.b24 = b24;
    }

    public RichButton getB24() {
        return b24;
    }

    public void setB25(RichButton b25) {
        this.b25 = b25;
    }

    public RichButton getB25() {
        return b25;
    }

    public void setB26(RichButton b26) {
        this.b26 = b26;
    }

    public RichButton getB26() {
        return b26;
    }

    public void setPlam17(RichPanelLabelAndMessage plam17) {
        this.plam17 = plam17;
    }

    public RichPanelLabelAndMessage getPlam17() {
        return plam17;
    }

    public void setOt48(RichOutputText ot48) {
        this.ot48 = ot48;
    }

    public RichOutputText getOt48() {
        return ot48;
    }

    public void setPlam18(RichPanelLabelAndMessage plam18) {
        this.plam18 = plam18;
    }

    public RichPanelLabelAndMessage getPlam18() {
        return plam18;
    }

    public void setOt49(RichOutputText ot49) {
        this.ot49 = ot49;
    }

    public RichOutputText getOt49() {
        return ot49;
    }
}
