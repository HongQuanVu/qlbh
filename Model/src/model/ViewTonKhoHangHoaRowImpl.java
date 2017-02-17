package model;

import java.math.BigDecimal;

import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Jan 15 11:37:51 PST 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ViewTonKhoHangHoaRowImpl extends ViewRowImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        HangHoaId,
        MaHang,
        TenHang,
        TenDonViTinh,
        SoLuongMua,
        SoLuongBan,
        SoLuongTon;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        protected int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        protected static final int firstIndex() {
            return firstIndex;
        }

        protected static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        protected static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int HANGHOAID = AttributesEnum.HangHoaId.index();
    public static final int MAHANG = AttributesEnum.MaHang.index();
    public static final int TENHANG = AttributesEnum.TenHang.index();
    public static final int TENDONVITINH = AttributesEnum.TenDonViTinh.index();
    public static final int SOLUONGMUA = AttributesEnum.SoLuongMua.index();
    public static final int SOLUONGBAN = AttributesEnum.SoLuongBan.index();
    public static final int SOLUONGTON = AttributesEnum.SoLuongTon.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ViewTonKhoHangHoaRowImpl() {
    }
}
