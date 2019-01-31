// automatically generated by the FlatBuffers compiler, do not modify

package mbtool.daemon.v3;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class FileWriteResponse extends Table {
  public static FileWriteResponse getRootAsFileWriteResponse(ByteBuffer _bb) { return getRootAsFileWriteResponse(_bb, new FileWriteResponse()); }
  public static FileWriteResponse getRootAsFileWriteResponse(ByteBuffer _bb, FileWriteResponse obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; }
  public FileWriteResponse __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public boolean success() { int o = __offset(4); return o != 0 ? 0!=bb.get(o + bb_pos) : false; }
  public String errorMsg() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer errorMsgAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public ByteBuffer errorMsgInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 6, 1); }
  public long bytesWritten() { int o = __offset(8); return o != 0 ? bb.getLong(o + bb_pos) : 0L; }
  public FileWriteError error() { return error(new FileWriteError()); }
  public FileWriteError error(FileWriteError obj) { int o = __offset(10); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }

  public static int createFileWriteResponse(FlatBufferBuilder builder,
      boolean success,
      int error_msgOffset,
      long bytes_written,
      int errorOffset) {
    builder.startObject(4);
    FileWriteResponse.addBytesWritten(builder, bytes_written);
    FileWriteResponse.addError(builder, errorOffset);
    FileWriteResponse.addErrorMsg(builder, error_msgOffset);
    FileWriteResponse.addSuccess(builder, success);
    return FileWriteResponse.endFileWriteResponse(builder);
  }

  public static void startFileWriteResponse(FlatBufferBuilder builder) { builder.startObject(4); }
  public static void addSuccess(FlatBufferBuilder builder, boolean success) { builder.addBoolean(0, success, false); }
  public static void addErrorMsg(FlatBufferBuilder builder, int errorMsgOffset) { builder.addOffset(1, errorMsgOffset, 0); }
  public static void addBytesWritten(FlatBufferBuilder builder, long bytesWritten) { builder.addLong(2, bytesWritten, 0L); }
  public static void addError(FlatBufferBuilder builder, int errorOffset) { builder.addOffset(3, errorOffset, 0); }
  public static int endFileWriteResponse(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}
