package view.backing;

import javax.faces.component.UISelectItems;

import oracle.adf.view.rich.component.rich.RichDocument;
import oracle.adf.view.rich.component.rich.RichForm;
import oracle.adf.view.rich.component.rich.RichMenu;
import oracle.adf.view.rich.component.rich.RichQuery;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputDate;
import oracle.adf.view.rich.component.rich.input.RichInputListOfValues;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;
import oracle.adf.view.rich.component.rich.layout.RichPanelFormLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelHeader;
import oracle.adf.view.rich.component.rich.layout.RichPanelLabelAndMessage;
import oracle.adf.view.rich.component.rich.layout.RichPanelSplitter;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.nav.RichCommandMenuItem;
import oracle.adf.view.rich.component.rich.output.RichMessages;
import oracle.adf.view.rich.component.rich.output.RichOutputText;
import oracle.adf.view.rich.component.rich.output.RichPanelCollection;

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
    private RichInputListOfValues tenKhachHangId;
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
    private RichInputText it7;
    private RichPanelSplitter ps3;
    private RichPanelGroupLayout pgl4;
    private RichTable t1;
    private RichPanelFormLayout pfl2;
    private RichPanelLabelAndMessage plam2;
    private RichOutputText ot28;
    private RichPanelLabelAndMessage plam7;
    private RichOutputText ot29;
    private RichPanelLabelAndMessage plam8;
    private RichOutputText ot30;
    private RichInputListOfValues tenHangHoaId;
    private RichInputText it9;
    private RichSelectOneChoice soc5;
    private UISelectItems si5;
    private RichInputText it10;
    private RichInputText it11;
    private RichInputText it12;
    private RichInputText it13;
    private RichInputDate id2;
    private RichInputText it14;
    private RichInputDate id3;
    private RichPanelGroupLayout pgl5;
    private RichPanelGroupLayout pgl6;
    private RichButton b10;
    private RichButton b11;
    private RichButton b12;
    private RichButton b13;
    private RichButton b14;
    private RichButton b15;
    private RichButton b16;
    private RichButton b17;
    private RichButton b18;

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

    public void setTenKhachHangId(RichInputListOfValues tenKhachHangId) {
        this.tenKhachHangId = tenKhachHangId;
    }

    public RichInputListOfValues getTenKhachHangId() {
        return tenKhachHangId;
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

    public void setIt7(RichInputText it7) {
        this.it7 = it7;
    }

    public RichInputText getIt7() {
        return it7;
    }

    public void setPs3(RichPanelSplitter ps3) {
        this.ps3 = ps3;
    }

    public RichPanelSplitter getPs3() {
        return ps3;
    }


    public void setPgl4(RichPanelGroupLayout pgl4) {
        this.pgl4 = pgl4;
    }

    public RichPanelGroupLayout getPgl4() {
        return pgl4;
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

    public void setPlam2(RichPanelLabelAndMessage plam2) {
        this.plam2 = plam2;
    }

    public RichPanelLabelAndMessage getPlam2() {
        return plam2;
    }

    public void setOt28(RichOutputText ot28) {
        this.ot28 = ot28;
    }

    public RichOutputText getOt28() {
        return ot28;
    }

    public void setPlam7(RichPanelLabelAndMessage plam7) {
        this.plam7 = plam7;
    }

    public RichPanelLabelAndMessage getPlam7() {
        return plam7;
    }

    public void setOt29(RichOutputText ot29) {
        this.ot29 = ot29;
    }

    public RichOutputText getOt29() {
        return ot29;
    }

    public void setPlam8(RichPanelLabelAndMessage plam8) {
        this.plam8 = plam8;
    }

    public RichPanelLabelAndMessage getPlam8() {
        return plam8;
    }

    public void setOt30(RichOutputText ot30) {
        this.ot30 = ot30;
    }

    public RichOutputText getOt30() {
        return ot30;
    }

    public void setTenHangHoaId(RichInputListOfValues tenHangHoaId) {
        this.tenHangHoaId = tenHangHoaId;
    }

    public RichInputListOfValues getTenHangHoaId() {
        return tenHangHoaId;
    }

    public void setIt9(RichInputText it9) {
        this.it9 = it9;
    }

    public RichInputText getIt9() {
        return it9;
    }

    public void setSoc5(RichSelectOneChoice soc5) {
        this.soc5 = soc5;
    }

    public RichSelectOneChoice getSoc5() {
        return soc5;
    }

    public void setSi5(UISelectItems si5) {
        this.si5 = si5;
    }

    public UISelectItems getSi5() {
        return si5;
    }

    public void setIt10(RichInputText it10) {
        this.it10 = it10;
    }

    public RichInputText getIt10() {
        return it10;
    }

    public void setIt11(RichInputText it11) {
        this.it11 = it11;
    }

    public RichInputText getIt11() {
        return it11;
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

    public void setId2(RichInputDate id2) {
        this.id2 = id2;
    }

    public RichInputDate getId2() {
        return id2;
    }

    public void setIt14(RichInputText it14) {
        this.it14 = it14;
    }

    public RichInputText getIt14() {
        return it14;
    }

    public void setId3(RichInputDate id3) {
        this.id3 = id3;
    }

    public RichInputDate getId3() {
        return id3;
    }

    public void setPgl5(RichPanelGroupLayout pgl5) {
        this.pgl5 = pgl5;
    }

    public RichPanelGroupLayout getPgl5() {
        return pgl5;
    }

    public void setPgl6(RichPanelGroupLayout pgl6) {
        this.pgl6 = pgl6;
    }

    public RichPanelGroupLayout getPgl6() {
        return pgl6;
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
}
