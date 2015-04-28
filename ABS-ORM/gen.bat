java -cp D:\Kuliah\TA\Eksperimen\Lib\absfrontend.jar; abs.backend.java.JavaBackend -d . absorm.abs

cp ../ABS-ORMLib/AbsDbOrm.java Test
cp ../ABS-ORMLib/AccountDbImpl_fli.java Test

javac -cp D:\Kuliah\TA\Eksperimen\Lib\absfrontend.jar; Test/AbsDbOrm.java -Xlint:unchecked
javac -cp D:\Kuliah\TA\Eksperimen\Lib\absfrontend.jar; Test/AccountDbImpl_fli.java -Xlint:unchecked
