/*
Câu lệnh truy vấn SQL
*/

--Select bảng [User]:
SELECT * FROM [User]
--TÌM KIẾM VÀ KIỂM TRA USER:
SELECT * FROM [User] WHERE [username] = ? AND [password] = ?

--insert 
INSERT INTO [dbo].[User]([username],[password],[role])VALUES(?,?,?)
--update password theo [username]:
UPDATE [dbo].[User] SET [password] = ? WHERE [username] = ?
--delete [User]:
DELETE FROM [dbo].[User] WHERE [username] = ?
------------------------------------------------------------------------------------------------------------------

--select bảng Student:
SELECT * FROM [Student]
--TÌM KIẾM SINH VIÊN THEO MÃ:
SELECT * FROM [Student] WHERE [maSV] = ?

--insert
INSERT INTO [dbo].[Student]([maSV],[hoTen],[email],[sdt],[diaChi],[gioiTinh],[hình]) VALUES(?, ?, ?, ?, ?, ?, ?)

--update sinh  viên theo mã sinh viên:
UPDATE [dbo].[Student] SET [hoTen] = ?,[email] = ?,[sdt] = ?,[diaChi] = ?,[gioiTinh] = ?,[hình] = ? WHERE [maSV] = ?

--delete sinh viên theo mã sinh viên:
DELETE FROM [dbo].[Student] WHERE [maSV] = ?
--------------------------------------------------------------------------------------------------------------------

--select bảng Grade:
SELECT * FROM [Grade]
--tìm kiếm điểm sinh viên theo mã:
SELECT * FROM [Grade] WHERE [maSV] = ?

--insert
INSERT INTO [dbo].[Grade]([maSV],[tiengAnh],[tinHoc],[GDTC]) VALUES( ?, ?, ?, ?)

--update điểm theo mã sinh viên:
UPDATE [dbo].[Grade] SET [tiengAnh] = ?,[tinHoc] = ?,[GDTC] = ? WHERE [maSV] = ?

--delete điểm theo mã sinh viên:
DELETE FROM [dbo].[Grade] WHERE [maSV] = ?
--sắp xếp theo điểm trung bình:
SELECT TOP ? * FROM Grade ORDER BY (tiengAnh+tinHoc+GDTC)/3 DESC

