package ceshi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.mktech.entity.DbShaocheng;
import com.mktech.utils.CommonUtil;

public class Getdataimpl {

	public ArrayList<DbShaocheng> getTotal() {
		Connection conn = null;
		PreparedStatement pst = null;
		conn = ceshi.Chart1dao.getConnection();
		String sql = "select * from (select * from DB_SHAOCHENG order by ID desc limit 10) t order by ID asc ";
		ArrayList<DbShaocheng> list = null;
		try {
			pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			ArrayList<DbShaocheng> array = new ArrayList<DbShaocheng>();

			while (rs.next()) {
				DbShaocheng chart1 = new DbShaocheng();
				chart1.setTimestamp(rs.getString("timestamp"));
				chart1.setL0001(rs.getDouble("l0001"));
				chart1.setL0002(rs.getDouble("l0002"));
				chart1.setL0003(rs.getDouble("l0003"));
				chart1.setL0004(rs.getDouble("l0004"));
				chart1.setL0005(rs.getDouble("l0005"));
				chart1.setL0006(rs.getDouble("l0006"));
				chart1.setL0007(rs.getDouble("l0007"));
				chart1.setL0008(rs.getDouble("l0008"));
				chart1.setL0009(rs.getDouble("l0009"));
				chart1.setL0010(rs.getDouble("l0010"));
				chart1.setL0011(rs.getDouble("l0011"));
				chart1.setL0012(rs.getDouble("l0012"));
				chart1.setL0013(rs.getDouble("l0013"));
				chart1.setL0014(rs.getDouble("l0014"));
				chart1.setL0015(rs.getDouble("l0015"));
				chart1.setL0016(rs.getDouble("l0016"));
				chart1.setL0017(rs.getDouble("l0017"));
				chart1.setL0018(rs.getDouble("l0018"));
				chart1.setL0019(rs.getDouble("l0019"));
				chart1.setL0020(rs.getDouble("l0020"));
				chart1.setL0021(rs.getDouble("l0021"));
				chart1.setL0022(rs.getDouble("l0022"));
				chart1.setL0023(rs.getDouble("l0023"));
				chart1.setL0024(rs.getDouble("l0024"));
				chart1.setL0025(rs.getDouble("l0025"));
				chart1.setL0026(rs.getDouble("l0026"));
				chart1.setL0027(rs.getDouble("l0027"));
				chart1.setL0028(rs.getDouble("l0028"));
				chart1.setL0029(rs.getDouble("l0029"));
				chart1.setL0030(rs.getDouble("l0030"));
				chart1.setL0031(rs.getDouble("l0031"));
				chart1.setL0032(rs.getDouble("l0032"));
				chart1.setL0033(rs.getDouble("l0033"));
				chart1.setL0034(rs.getDouble("l0034"));
				chart1.setL0035(rs.getDouble("l0035"));
				chart1.setL0036(rs.getDouble("l0036"));
				chart1.setL0037(rs.getDouble("l0037"));
				chart1.setL0038(rs.getDouble("l0038"));
				chart1.setL0039(rs.getDouble("l0039"));
				chart1.setL0040(rs.getDouble("l0040"));
				chart1.setL0041(rs.getDouble("l0041"));
				chart1.setL0042(rs.getDouble("l0042"));
				chart1.setL0043(rs.getDouble("l0043"));
				chart1.setL0044(rs.getDouble("l0044"));
				chart1.setL0045(rs.getDouble("l0045"));
				chart1.setL0046(rs.getDouble("l0046"));
				chart1.setL0047(rs.getDouble("l0047"));
				chart1.setL0048(rs.getDouble("l0048"));
				chart1.setL0049(rs.getDouble("l0049"));
				chart1.setL0050(rs.getDouble("l0050"));
				chart1.setL0051(rs.getDouble("l0051"));
				chart1.setL0052(rs.getDouble("l0052"));
				chart1.setL0053(rs.getDouble("l0053"));
				chart1.setL0054(rs.getDouble("l0054"));
				chart1.setL0055(rs.getDouble("l0055"));
				chart1.setL0056(rs.getDouble("l0056"));
				chart1.setL0057(rs.getDouble("l0057"));
				chart1.setL0058(rs.getDouble("l0058"));
				chart1.setL0059(rs.getDouble("l0059"));
				chart1.setL0060(rs.getDouble("l0060"));
				chart1.setL0061(rs.getDouble("l0061"));
				chart1.setL0062(rs.getDouble("l0062"));
				chart1.setL0063(rs.getDouble("l0063"));
				chart1.setL0064(rs.getDouble("l0064"));
				chart1.setL0065(rs.getDouble("l0065"));
				chart1.setL0066(rs.getDouble("l0066"));
				chart1.setL0067(rs.getDouble("l0067"));
				chart1.setL0068(rs.getDouble("l0068"));
				chart1.setL0069(rs.getDouble("l0069"));
				chart1.setL0070(rs.getDouble("l0070"));
				chart1.setL0071(rs.getDouble("l0071"));
				chart1.setL0072(rs.getDouble("l0072"));
				chart1.setL0073(rs.getDouble("l0073"));
				chart1.setL0074(rs.getDouble("l0074"));
				chart1.setL0075(rs.getDouble("l0075"));
				chart1.setL0076(rs.getDouble("l0076"));
				chart1.setL0077(rs.getDouble("l0077"));
				chart1.setL0078(rs.getDouble("l0078"));
				chart1.setL0079(rs.getDouble("l0079"));
				chart1.setL0080(rs.getDouble("l0080"));
				chart1.setL0081(rs.getDouble("l0081"));
				chart1.setL0082(rs.getDouble("l0082"));
				chart1.setL0083(rs.getDouble("l0083"));
				chart1.setL0084(rs.getDouble("l0084"));
				chart1.setL0085(rs.getDouble("l0085"));
				chart1.setL0086(rs.getDouble("l0086"));
				chart1.setL0087(rs.getDouble("l0087"));
				chart1.setL0088(rs.getDouble("l0088"));
				chart1.setL0089(rs.getDouble("l0089"));
				chart1.setL0090(rs.getDouble("l0090"));
				chart1.setL0091(rs.getDouble("l0091"));
				chart1.setL0092(rs.getDouble("l0092"));
				chart1.setL0093(rs.getDouble("l0093"));
				chart1.setL0094(rs.getDouble("l0094"));
				chart1.setL0095(rs.getDouble("l0095"));
				chart1.setL0096(rs.getDouble("l0096"));
				chart1.setL0097(rs.getDouble("l0097"));
				chart1.setL0098(rs.getDouble("l0098"));
				chart1.setL0099(rs.getDouble("l0099"));
				chart1.setL0100(rs.getDouble("l0100"));

				/*
				 * SimpleDateFormat sdf = new SimpleDateFormat(
				 * "yyyy-MM-dd'T'HH:mm:ss"); String str =
				 * sdf.format(rs.getString("timestamp"));
				 * 
				 * chart1.setDateStr(str);
				 */
				CommonUtil time1 = new CommonUtil();
				String str = time1.timestamp2Date(rs.getString("timestamp"));
				chart1.setDateStr(str);
				double wlb = 100 * chart1.getL0006() / chart1.getL0005();
				chart1.setwlb(wlb);
				array.add(chart1);
			}
			rs.close();
			conn.close();
			return array;
		} catch (Exception e) {
			System.out.println("错误1 " + e);
		}

		return list;
	}
}