package com.whty.euicc.rsp.profile;

import org.junit.Test;

import com.whty.euicc.rsp.profile.ProfileUtil;


public class ProfileUtilTest {
	
	private String euiccOtpk = "5F494104A96D0DEBC352387638D1A7ECBB0651234465BEA4A3F5195A9696FC53237E6298BEF31CD2D44C5B17FF2A1B1F4EC2553A1A0C8976337DAA4767B4A6D20F31D3DB";
	private String smdpOtpk = "5F494104C64BEC120BE34A4177A37F28BCA83E00B2ABBD0763F4FF0A507F12A29446F3C1A8F2EED30D229BEF097635D09CD64B643DECA1451AABACEC30916D8202CA10F7";

	
	@Test
	public void generateBPPTest()throws Exception{
		String profile = "A04F800102810100821447534D412050726F66696C65205061636B616765830A89019990001234567893A506810084008B00A610060667810F010201060667810F010204870BA0090607913386994211F0B08201F9A0058000810101810667810F010201A207A105C60301020AA305A1038B010FA40C830A98109909002143658739A528A10A82044221002680020098831A61184F10A0000000871002FF33FF01890000010050045553494DA682019EA10A8204422100258002022B831B8001019000800102A406830101950108800158A40683010A95010882010A8316800101A40683010195010880015AA40683010A95010882010F830B80015BA40683010A95010882011A830A800101900080015A970082011B8316800103A406830101950108800158A40683010A95010882010F8316800111A40683010195010880014AA40683010A95010882010F8321800103A406830101950108800158A40683010A950108840132A4068301019501088201048321800101A406830101950108800102A406830181950108800158A40683010A950108820104831B800101900080011AA406830101950108800140A40683010A95010882010A8310800101900080015AA40683010A95010882011583158001019000800118A40683010A95010880014297008201108310800101A40683010195010880015A97008201158316800113A406830101950108800148A40683010A95010882010F830B80015EA40683010A95010882011A83258001019000800102A010A406830101950108A406830102950108800158A40683010A950108A33FA0058000810103A13630118001018108303030303030303082020099300D800102810831323334353637383012800200818108393239343536373882020088A241A0058000810104A138A0363010800101810831323131FFFFFFFF8201013010800102810831303030FFFFFFFF820102301080010A810835363738FFFFFFFF830101B37CA0058000810102810667810F010204A21DA11B83027FF18410A0000000871002FF33FF018900000100C60301810AA30B8309082943019134876765A406A104C7022F06A80F830D0A2E178CE73204000000000000AD1383110247534D41206555494343FFFFFFFFFFFFAE03830100B20483020040B606830419F1FF01A225A0058000810128A11CA01A301880020081810839323338FFFFFFFF82020081830101840122A43AA0058000810105A131A12F8001018101018210000102030405060708090A0B0C0D0E0F83100102030405060708090A0B0C0D0E0F008603010203A681B5A0058000810106A13E4F07A00000015153504F08A0000001515350414F08A000000151000000820382FC8083010FC90481028000EA11800F0100000100000002011203B2010000A26C30229501388201018301013017301580018886101122334455667788991011121314800130229501348201028301013017301580018886101122334455667788991011121314800130229501C882010383010130173015800188861011223344556677889910111213148001A681C7A0058000810107A1504F07A00000015153504F08A0000001515350414F10A00000055910100102736456616C75654F08A000000151000000820380800083010FC90481028000EA11800F01000001000000020112036C756500A26C30229501388201018301013017301580018886101122334455667788112233445566778830229501348201028301013017301580018886101122334455667788112233445566778830229501C882010383010130173015800188861011223344556677881122334455667788A720A0038101094F09A00000055910100001A0050403B00000810112040100040100A740A00381010A4F09A00000055910100002A0050403B00020810112040100040100301E8010A0000000871002FF33FF018900000100810402000100820402000100AA07A0058000810163";
		String initialMacChaining = "94EAA47DB3820EC8E6174181E1CEDA1F";
		String S_ENC = "50FD0CA7F4A375A0E9429AC5E536EDCC"; 
		String S_MAC = "BF66220491FE7C0688888150EA13349D";
		String iccid = "A0000102030405060709";
		String transactionId = "1122334455667700";
		
		ProfileUtil one = new ProfileUtil();
		String data = one.generateBPP(iccid, profile, initialMacChaining, S_ENC, S_MAC, transactionId, euiccOtpk, smdpOtpk, false);
		System.out.println("generateBPP: " + data);
		
	}
	
	@Test
	public void initialiseSecureChannelTest()throws Exception{
		String iccid = "A0000102030405060708";
		String transactionId = "1122334455667700";
		ProfileUtil one = new ProfileUtil();
		String data = one.initialiseSecureChannel(iccid, transactionId, euiccOtpk, smdpOtpk);
		System.out.println("ES8+.initialiseSecureChannel: " + data);
	}
	
	@Test
	public void configureIsdpTest()throws Exception{
		String iccid = "A0000102030405060708";
		ProfileUtil one = new ProfileUtil();
		String data = one.configureIsdp(iccid);
		System.out.println("ES8+.configureIsdp: " + data);
	}
	
	@Test
	public void storeMetadataTest()throws Exception{
		String iccid = "A0000102030405060708";
		ProfileUtil one = new ProfileUtil();
		
		String data = one.storeMetadata(iccid);
		System.out.println("ES8+.storeMetadata: " + data);
	}
	
	@Test
	public void replaceSessionKeysTest()throws Exception{
		String iccid = "A0000102030405060708";
		ProfileUtil one = new ProfileUtil();
		String data = one.replaceSessionKeys();
		System.out.println("ES8+.replaceSessionKeys: " + data);
	}
	
	@Test
	public void loadProfileElementsTest()throws Exception{
		String profile = "A04F800102810100821447534D412050726F66696C65205061636B616765830A89019990001234567893A506810084008B00A610060667810F010201060667810F010204870BA0090607913386994211F0B08201F9A0058000810101810667810F010201"+
				"A207A105C60301020AA305A1038B010FA40C830A98109909002143658739A528A10A82044221002680020098831A61184F10A0000000871002FF33FF01890000010050045553494DA682019EA10A8204422100258002022B831B8001019000800102A406"+
				"830101950108800158A40683010A95010882010A8316800101A40683010195010880015AA40683010A95010882010F830B80015BA40683010A95010882011A830A800101900080015A970082011B8316800103A406830101950108800158A40683010A95"+
				"010882010F8316800111A40683010195010880014AA40683010A95010882010F8321800103A406830101950108800158A40683010A950108840132A4068301019501088201048321800101A406830101950108800102A406830181950108800158A40683"+
				"010A950108820104831B800101900080011AA406830101950108800140A40683010A95010882010A8310800101900080015AA40683010A95010882011583158001019000800118A40683010A95010880014297008201108310800101A406830101950108"+
				"80015A97008201158316800113A406830101950108800148A40683010A95010882010F830B80015EA40683010A95010882011A83258001019000800102A010A406830101950108A406830102950108800158A40683010A950108A33FA0058000810103A1"+
				"3630118001018108303030303030303082020099300D800102810831323334353637383012800200818108393239343536373882020088A241A0058000810104A138A0363010800101810831323334FFFFFFFF8201013010800102810831303030FFFFFF"+
				"FF820102301080010A810835363738FFFFFFFF830101B37CA0058000810102810667810F010204A21DA11B83027FF18410A0000000871002FF33FF018900000100C60301810AA30B8309082943019134876765A406A104C7022F06A80F830D0A2E178CE7"+
				"3204000000000000AD1383110247534D41206555494343FFFFFFFFFFFFAE03830100B20483020040B606830419F1FF01A225A0058000810128A11CA01A301880020081810839323338FFFFFFFF82020081830101840122A43AA0058000810105A131A12F"+
				"8001018101018210000102030405060708090A0B0C0D0E0F83100102030405060708090A0B0C0D0E0F008603010203A681B5A0058000810106A13E4F07A00000015153504F08A0000001515350414F08A000000151000000820382FC8083010FC9048102"+
				"8000EA11800F0100000100000002011203B2010000A26C30229501388201018301013017301580018886101122334455667788991011121314151630229501348201028301013017301580018886101122334455667788991011121314151630229501C8"+
				"82010383010130173015800188861011223344556677889910111213141516A681C7A0058000810107A1504F07A00000015153504F08A0000001515350414F10A00000055910100102736456616C75654F08A000000151000000820380800083010FC904"+
				"81028000EA11800F01000001000000020112036C756500A26C302295013882010183010130173015800180861011223344556677881122334455667788302295013482010283010130173015800180861011223344556677881122334455667788302295"+
				"01C882010383010130173015800180861011223344556677881122334455667788A720A0038101094F09A00000055910100001A0050403B00000810112040100040100A740A00381010A4F09A00000055910100002A0050403B000208101120401000401"+
				"00301E8010A0000000871002FF33FF018900000100810402000100820402000100AA07A0058000810163";
		ProfileUtil one = new ProfileUtil();
		String data = one.loadProfileElements(profile);
		System.out.println("ES8+.loadProfileElements: " + data);
	}
}
