package com.isc.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "loaidichvu")
public class LoaiDichVu {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "LOAIDV_ID")
	private int loaiDichVu_Id;

	@Column(name = "LOAIDV_MA")
	private String maLoaiDichVu;

	@Column(name = "LOAIDV_TEN")
	private String tenLoaiDichVu;
	
	@Column(name = "LOAIDV_TINHTRANG")
	private int tinhTrangLoaiDichVu;

	@OneToMany(mappedBy = "loaiDichVu", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<DichVu> dichVu;

	public LoaiDichVu() {
	}

	public LoaiDichVu(int loaiDichVu_Id, String maLoaiDichVu, String tenLoaiDichVu, int tinhTrangLoaiDichVu,
			List<DichVu> dichVu) {
		super();
		this.loaiDichVu_Id = loaiDichVu_Id;
		this.maLoaiDichVu = maLoaiDichVu;
		this.tenLoaiDichVu = tenLoaiDichVu;
		this.tinhTrangLoaiDichVu = tinhTrangLoaiDichVu;
		this.dichVu = dichVu;
	}

	public int getLoaiDichVu_Id() {
		return loaiDichVu_Id;
	}

	public void setLoaiDichVu_Id(int loaiDichVu_Id) {
		this.loaiDichVu_Id = loaiDichVu_Id;
	}

	public String getMaLoaiDichVu() {
		return maLoaiDichVu;
	}

	public void setMaLoaiDichVu(String maLoaiDichVu) {
		this.maLoaiDichVu = maLoaiDichVu;
	}

	public String getTenLoaiDichVu() {
		return tenLoaiDichVu;
	}

	public void setTenLoaiDichVu(String tenLoaiDichVu) {
		this.tenLoaiDichVu = tenLoaiDichVu;
	}

	public int getTinhTrangLoaiDichVu() {
		return tinhTrangLoaiDichVu;
	}

	public void setTinhTrangLoaiDichVu(int tinhTrangLoaiDichVu) {
		this.tinhTrangLoaiDichVu = tinhTrangLoaiDichVu;
	}

	
}
