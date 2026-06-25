.class public final Lexpo/modules/video/player/VideoPlayer;
.super Lexpo/modules/kotlin/sharedobjects/SharedObject;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ljava/lang/AutoCloseable;
.implements LFd/p;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b4\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0016\n\u0002\u0010\u0007\n\u0002\u00084\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010 \n\u0002\u0008\t\n\u0002\u0008\u0003\n\u0002\u0008\r\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0010\u0006\n\u0002\u0008\u0004*\u0004\u00ff\u0001\u0082\u0002\u0008\u0007\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u00032\u00020\u0004B-\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J!\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00152\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u001bH\u0002\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u001bH\u0002\u00a2\u0006\u0004\u0008 \u0010\u001fJ\u000f\u0010\"\u001a\u00020!H\u0002\u00a2\u0006\u0004\u0008\"\u0010#J\u0017\u0010%\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020!H\u0002\u00a2\u0006\u0004\u0008%\u0010&J\u0017\u0010)\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020\'H\u0002\u00a2\u0006\u0004\u0008)\u0010*J\u000f\u0010,\u001a\u00020+H\u0002\u00a2\u0006\u0004\u0008,\u0010-J\u000f\u0010.\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008.\u0010\u001fJ\u000f\u0010/\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008/\u0010\u001fJ\r\u00100\u001a\u00020\u001b\u00a2\u0006\u0004\u00080\u0010\u001fJ\u0017\u00103\u001a\u00020\u001b2\u0008\u00102\u001a\u0004\u0018\u000101\u00a2\u0006\u0004\u00083\u00104J\r\u00105\u001a\u00020\u001b\u00a2\u0006\u0004\u00085\u0010\u001fJ\u0015\u00108\u001a\u00020\u001b2\u0006\u00107\u001a\u000206\u00a2\u0006\u0004\u00088\u00109J\u0015\u0010:\u001a\u00020\u001b2\u0006\u00107\u001a\u000206\u00a2\u0006\u0004\u0008:\u00109J\u000f\u0010;\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\u0008;\u0010\u001fJ\r\u0010=\u001a\u00020<\u00a2\u0006\u0004\u0008=\u0010>R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008?\u0010@\u001a\u0004\u0008A\u0010BR\u0016\u0010F\u001a\u00020C8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008D\u0010ER \u0010K\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002060H0G8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008I\u0010JR\u001c\u0010O\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001010L8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008M\u0010NR\u0017\u0010U\u001a\u00020P8\u0006\u00a2\u0006\u000c\n\u0004\u0008Q\u0010R\u001a\u0004\u0008S\u0010TR\u0017\u0010[\u001a\u00020V8\u0006\u00a2\u0006\u000c\n\u0004\u0008W\u0010X\u001a\u0004\u0008Y\u0010ZR\u0017\u0010a\u001a\u00020\\8\u0006\u00a2\u0006\u000c\n\u0004\u0008]\u0010^\u001a\u0004\u0008_\u0010`R\u0017\u0010g\u001a\u00020b8\u0006\u00a2\u0006\u000c\n\u0004\u0008c\u0010d\u001a\u0004\u0008e\u0010fR\u0017\u0010m\u001a\u00020h8\u0006\u00a2\u0006\u000c\n\u0004\u0008i\u0010j\u001a\u0004\u0008k\u0010lR\u001a\u0010q\u001a\u00020+8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008n\u0010o\u001a\u0004\u0008p\u0010-R\u0017\u0010w\u001a\u00020r8\u0006\u00a2\u0006\u000c\n\u0004\u0008s\u0010t\u001a\u0004\u0008u\u0010vR\"\u0010\u007f\u001a\u00020x8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008y\u0010z\u001a\u0004\u0008{\u0010|\"\u0004\u0008}\u0010~R\u001d\u0010\u0085\u0001\u001a\u00030\u0080\u00018\u0006\u00a2\u0006\u0010\n\u0006\u0008\u0081\u0001\u0010\u0082\u0001\u001a\u0006\u0008\u0083\u0001\u0010\u0084\u0001R1\u0010\u008b\u0001\u001a\u00020!2\u0007\u0010\u0086\u0001\u001a\u00020!8F@FX\u0086\u008e\u0002\u00a2\u0006\u0016\n\u0006\u0008\u0087\u0001\u0010\u0088\u0001\u001a\u0005\u0008\u0089\u0001\u0010#\"\u0005\u0008\u008a\u0001\u0010&R+\u0010\u0092\u0001\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0018\n\u0006\u0008\u008c\u0001\u0010\u008d\u0001\u001a\u0006\u0008\u008e\u0001\u0010\u008f\u0001\"\u0006\u0008\u0090\u0001\u0010\u0091\u0001R7\u0010\u0096\u0001\u001a\u0004\u0018\u00010\t2\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010\t8B@BX\u0082\u008e\u0002\u00a2\u0006\u0018\n\u0006\u0008\u0093\u0001\u0010\u0088\u0001\u001a\u0006\u0008\u0094\u0001\u0010\u008f\u0001\"\u0006\u0008\u0095\u0001\u0010\u0091\u0001R*\u0010\u009e\u0001\u001a\u00030\u0097\u00018\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0018\n\u0006\u0008\u0098\u0001\u0010\u0099\u0001\u001a\u0006\u0008\u009a\u0001\u0010\u009b\u0001\"\u0006\u0008\u009c\u0001\u0010\u009d\u0001R(\u0010\u0018\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0018\n\u0006\u0008\u009f\u0001\u0010\u00a0\u0001\u001a\u0006\u0008\u00a1\u0001\u0010\u00a2\u0001\"\u0006\u0008\u00a3\u0001\u0010\u00a4\u0001R\'\u0010\u00a9\u0001\u001a\u00020!8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0016\n\u0006\u0008\u00a5\u0001\u0010\u00a6\u0001\u001a\u0005\u0008\u00a7\u0001\u0010#\"\u0005\u0008\u00a8\u0001\u0010&R0\u0010\u00ae\u0001\u001a\u00020!2\u0007\u0010\u00aa\u0001\u001a\u00020!8\u0006@FX\u0086\u000e\u00a2\u0006\u0016\n\u0006\u0008\u00ab\u0001\u0010\u00a6\u0001\u001a\u0005\u0008\u00ac\u0001\u0010#\"\u0005\u0008\u00ad\u0001\u0010&R0\u0010\u00af\u0001\u001a\u00020!2\u0007\u0010\u00af\u0001\u001a\u00020!8\u0006@FX\u0086\u000e\u00a2\u0006\u0016\n\u0006\u0008\u00b0\u0001\u0010\u00a6\u0001\u001a\u0005\u0008\u00b1\u0001\u0010#\"\u0005\u0008\u00b2\u0001\u0010&R0\u0010\u00b6\u0001\u001a\u00020!2\u0007\u0010\u00aa\u0001\u001a\u00020!8\u0006@FX\u0086\u000e\u00a2\u0006\u0016\n\u0006\u0008\u00b3\u0001\u0010\u00a6\u0001\u001a\u0005\u0008\u00b4\u0001\u0010#\"\u0005\u0008\u00b5\u0001\u0010&R*\u0010\u00ba\u0001\u001a\u00030\u0097\u00018\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0018\n\u0006\u0008\u00b7\u0001\u0010\u0099\u0001\u001a\u0006\u0008\u00b8\u0001\u0010\u009b\u0001\"\u0006\u0008\u00b9\u0001\u0010\u009d\u0001R\'\u0010\u00be\u0001\u001a\u00020!8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0016\n\u0006\u0008\u00bb\u0001\u0010\u00a6\u0001\u001a\u0005\u0008\u00bc\u0001\u0010#\"\u0005\u0008\u00bd\u0001\u0010&R5\u0010\u00c2\u0001\u001a\u00030\u0097\u00012\u0008\u0010\u0086\u0001\u001a\u00030\u0097\u00018F@FX\u0086\u008e\u0002\u00a2\u0006\u0018\n\u0006\u0008\u00bf\u0001\u0010\u0088\u0001\u001a\u0006\u0008\u00c0\u0001\u0010\u009b\u0001\"\u0006\u0008\u00c1\u0001\u0010\u009d\u0001R1\u0010\u00c6\u0001\u001a\u00020!2\u0007\u0010\u0086\u0001\u001a\u00020!8F@FX\u0086\u008e\u0002\u00a2\u0006\u0016\n\u0006\u0008\u00c3\u0001\u0010\u0088\u0001\u001a\u0005\u0008\u00c4\u0001\u0010#\"\u0005\u0008\u00c5\u0001\u0010&R2\u0010\u0010\u001a\u00020\u000f2\u0007\u0010\u0086\u0001\u001a\u00020\u000f8F@FX\u0086\u008e\u0002\u00a2\u0006\u0018\n\u0006\u0008\u00c7\u0001\u0010\u0088\u0001\u001a\u0006\u0008\u00c8\u0001\u0010\u00c9\u0001\"\u0006\u0008\u00ca\u0001\u0010\u00cb\u0001R4\u0010\u00d3\u0001\u001a\u00030\u00cc\u00012\u0008\u0010\u00aa\u0001\u001a\u00030\u00cc\u00018\u0006@FX\u0086\u000e\u00a2\u0006\u0018\n\u0006\u0008\u00cd\u0001\u0010\u00ce\u0001\u001a\u0006\u0008\u00cf\u0001\u0010\u00d0\u0001\"\u0006\u0008\u00d1\u0001\u0010\u00d2\u0001R4\u0010\u00db\u0001\u001a\u00030\u00d4\u00012\u0008\u0010\u00aa\u0001\u001a\u00030\u00d4\u00018\u0006@FX\u0086\u000e\u00a2\u0006\u0018\n\u0006\u0008\u00d5\u0001\u0010\u00d6\u0001\u001a\u0006\u0008\u00d7\u0001\u0010\u00d8\u0001\"\u0006\u0008\u00d9\u0001\u0010\u00da\u0001R)\u0010\u00dd\u0001\u001a\u00020!2\u0007\u0010\u00aa\u0001\u001a\u00020!8\u0006@BX\u0086\u000e\u00a2\u0006\u000f\n\u0006\u0008\u0099\u0001\u0010\u00a6\u0001\u001a\u0005\u0008\u00dc\u0001\u0010#R8\u0010\u00e5\u0001\u001a\u0005\u0018\u00010\u00de\u00012\n\u0010\u00aa\u0001\u001a\u0005\u0018\u00010\u00de\u00018\u0006@BX\u0086\u000e\u00a2\u0006\u0018\n\u0006\u0008\u00df\u0001\u0010\u00e0\u0001\u001a\u0006\u0008\u00e1\u0001\u0010\u00e2\u0001\"\u0006\u0008\u00e3\u0001\u0010\u00e4\u0001R3\u0010\u00ec\u0001\u001a\u00030\u00e6\u00012\u0008\u0010\u00aa\u0001\u001a\u00030\u00e6\u00018\u0006@FX\u0086\u000e\u00a2\u0006\u0017\n\u0005\u0008/\u0010\u00e7\u0001\u001a\u0006\u0008\u00e8\u0001\u0010\u00e9\u0001\"\u0006\u0008\u00ea\u0001\u0010\u00eb\u0001R4\u0010\u00f4\u0001\u001a\u00030\u00ed\u00012\u0008\u0010\u00aa\u0001\u001a\u00030\u00ed\u00018\u0006@FX\u0086\u000e\u00a2\u0006\u0018\n\u0006\u0008\u00ee\u0001\u0010\u00ef\u0001\u001a\u0006\u0008\u00f0\u0001\u0010\u00f1\u0001\"\u0006\u0008\u00f2\u0001\u0010\u00f3\u0001R9\u0010\u00f9\u0001\u001a\n\u0012\u0005\u0012\u00030\u00de\u00010\u00f5\u00012\u000f\u0010\u00aa\u0001\u001a\n\u0012\u0005\u0012\u00030\u00de\u00010\u00f5\u00018\u0006@BX\u0086\u000e\u00a2\u0006\u000f\n\u0005\u0008\u00f6\u0001\u0010J\u001a\u0006\u0008\u00f7\u0001\u0010\u00f8\u0001R1\u0010\u00fe\u0001\u001a\u00020!2\u0007\u0010\u0086\u0001\u001a\u00020!8F@FX\u0086\u008e\u0002\u00a2\u0006\u0016\n\u0006\u0008\u00fa\u0001\u0010\u00fb\u0001\u001a\u0005\u0008\u00fc\u0001\u0010#\"\u0005\u0008\u00fd\u0001\u0010&R\u0018\u0010\u0081\u0002\u001a\u00030\u00ff\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00a6\u0001\u0010\u0080\u0002R\u0018\u0010\u0085\u0002\u001a\u00030\u0082\u00028\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0083\u0002\u0010\u0084\u0002R6\u0010\u008b\u0002\u001a\u0004\u0018\u0001012\t\u0010\u0086\u0001\u001a\u0004\u0018\u0001018F@FX\u0086\u008e\u0002\u00a2\u0006\u0017\u001a\u0006\u0008\u0086\u0002\u0010\u0087\u0002\"\u0005\u0008\u0088\u0002\u00104*\u0006\u0008\u0089\u0002\u0010\u008a\u0002R\u0017\u0010\u008e\u0002\u001a\u0005\u0018\u00010\u0097\u00018F\u00a2\u0006\u0008\u001a\u0006\u0008\u008c\u0002\u0010\u008d\u0002R\u0017\u0010\u0092\u0002\u001a\u0005\u0018\u00010\u008f\u00028F\u00a2\u0006\u0008\u001a\u0006\u0008\u0090\u0002\u0010\u0091\u0002R\u0015\u0010\u0096\u0002\u001a\u00030\u0093\u00028F\u00a2\u0006\u0008\u001a\u0006\u0008\u0094\u0002\u0010\u0095\u0002\u00a8\u0006\u0097\u0002"
    }
    d2 = {
        "Lexpo/modules/video/player/VideoPlayer;",
        "Ljava/lang/AutoCloseable;",
        "Lkotlin/AutoCloseable;",
        "Lexpo/modules/kotlin/sharedobjects/SharedObject;",
        "LFd/p;",
        "Landroid/content/Context;",
        "context",
        "LUb/d;",
        "appContext",
        "Lexpo/modules/video/records/VideoSource;",
        "source",
        "Lexpo/modules/video/records/PlayerBuilderOptions;",
        "playerBuilderOptions",
        "<init>",
        "(Landroid/content/Context;LUb/d;Lexpo/modules/video/records/VideoSource;Lexpo/modules/video/records/PlayerBuilderOptions;)V",
        "Lq2/O;",
        "playbackParameters",
        "b2",
        "(Lq2/O;)Lq2/O;",
        "",
        "state",
        "Lexpo/modules/video/enums/PlayerStatus;",
        "R2",
        "(I)Lexpo/modules/video/enums/PlayerStatus;",
        "status",
        "Lq2/N;",
        "error",
        "LTd/L;",
        "p3",
        "(Lexpo/modules/video/enums/PlayerStatus;Lq2/N;)V",
        "U2",
        "()V",
        "X2",
        "",
        "u3",
        "()Z",
        "showNotification",
        "Z2",
        "(Z)V",
        "Lexpo/modules/video/player/a;",
        "event",
        "Y2",
        "(Lexpo/modules/video/player/a;)V",
        "LKd/b;",
        "e2",
        "()LKd/b;",
        "close",
        "H",
        "L2",
        "Lexpo/modules/video/VideoView;",
        "videoView",
        "c2",
        "(Lexpo/modules/video/VideoView;)V",
        "T2",
        "LHd/b;",
        "videoPlayerListener",
        "a2",
        "(LHd/b;)V",
        "V2",
        "a",
        "Landroid/media/MediaMetadataRetriever;",
        "v3",
        "()Landroid/media/MediaMetadataRetriever;",
        "c",
        "Landroid/content/Context;",
        "getContext",
        "()Landroid/content/Context;",
        "LA2/d;",
        "d",
        "LA2/d;",
        "renderersFactory",
        "",
        "Ljava/lang/ref/WeakReference;",
        "e",
        "Ljava/util/List;",
        "listeners",
        "LMd/e;",
        "f",
        "LMd/e;",
        "currentVideoViewRef",
        "LKd/o;",
        "g",
        "LKd/o;",
        "getLoadControl",
        "()LKd/o;",
        "loadControl",
        "LKd/p;",
        "h",
        "LKd/p;",
        "I2",
        "()LKd/p;",
        "subtitles",
        "LKd/l;",
        "i",
        "LKd/l;",
        "i2",
        "()LKd/l;",
        "audioTracks",
        "LP2/n;",
        "j",
        "LP2/n;",
        "getTrackSelector",
        "()LP2/n;",
        "trackSelector",
        "Landroidx/media3/exoplayer/ExoPlayer;",
        "k",
        "Landroidx/media3/exoplayer/ExoPlayer;",
        "y2",
        "()Landroidx/media3/exoplayer/ExoPlayer;",
        "player",
        "l",
        "LKd/b;",
        "s2",
        "firstFrameEventGenerator",
        "LJd/d;",
        "m",
        "LJd/d;",
        "E2",
        "()LJd/d;",
        "serviceConnection",
        "LE3/h3;",
        "n",
        "LE3/h3;",
        "v2",
        "()LE3/h3;",
        "g3",
        "(LE3/h3;)V",
        "mediaSession",
        "LFd/o;",
        "o",
        "LFd/o;",
        "t2",
        "()LFd/o;",
        "intervalUpdateClock",
        "<set-?>",
        "p",
        "LGd/b;",
        "z2",
        "j3",
        "playing",
        "q",
        "Lexpo/modules/video/records/VideoSource;",
        "getUncommittedSource",
        "()Lexpo/modules/video/records/VideoSource;",
        "r3",
        "(Lexpo/modules/video/records/VideoSource;)V",
        "uncommittedSource",
        "r",
        "m2",
        "c3",
        "commitedSource",
        "",
        "s",
        "F",
        "J2",
        "()F",
        "s3",
        "(F)V",
        "userVolume",
        "t",
        "Lexpo/modules/video/enums/PlayerStatus;",
        "G2",
        "()Lexpo/modules/video/enums/PlayerStatus;",
        "setStatus",
        "(Lexpo/modules/video/enums/PlayerStatus;)V",
        "u",
        "Z",
        "B2",
        "l3",
        "requiresLinearPlayback",
        "value",
        "v",
        "H2",
        "q3",
        "staysActiveInBackground",
        "preservesPitch",
        "w",
        "A2",
        "k3",
        "x",
        "F2",
        "o3",
        "showNowPlayingNotification",
        "y",
        "r2",
        "setDuration",
        "duration",
        "z",
        "M2",
        "setLive",
        "isLive",
        "A",
        "K2",
        "t3",
        "volume",
        "B",
        "w2",
        "h3",
        "muted",
        "C",
        "x2",
        "()Lq2/O;",
        "i3",
        "(Lq2/O;)V",
        "Lexpo/modules/video/records/BufferOptions;",
        "D",
        "Lexpo/modules/video/records/BufferOptions;",
        "k2",
        "()Lexpo/modules/video/records/BufferOptions;",
        "b3",
        "(Lexpo/modules/video/records/BufferOptions;)V",
        "bufferOptions",
        "Lexpo/modules/video/enums/AudioMixingMode;",
        "E",
        "Lexpo/modules/video/enums/AudioMixingMode;",
        "h2",
        "()Lexpo/modules/video/enums/AudioMixingMode;",
        "a3",
        "(Lexpo/modules/video/enums/AudioMixingMode;)V",
        "audioMixingMode",
        "N2",
        "isLoadingNewSource",
        "Lexpo/modules/video/records/VideoTrack;",
        "G",
        "Lexpo/modules/video/records/VideoTrack;",
        "p2",
        "()Lexpo/modules/video/records/VideoTrack;",
        "d3",
        "(Lexpo/modules/video/records/VideoTrack;)V",
        "currentVideoTrack",
        "Lexpo/modules/video/records/SeekTolerance;",
        "Lexpo/modules/video/records/SeekTolerance;",
        "D2",
        "()Lexpo/modules/video/records/SeekTolerance;",
        "n3",
        "(Lexpo/modules/video/records/SeekTolerance;)V",
        "seekTolerance",
        "Lexpo/modules/video/records/ScrubbingModeOptions;",
        "I",
        "Lexpo/modules/video/records/ScrubbingModeOptions;",
        "C2",
        "()Lexpo/modules/video/records/ScrubbingModeOptions;",
        "m3",
        "(Lexpo/modules/video/records/ScrubbingModeOptions;)V",
        "scrubbingModeOptions",
        "",
        "X",
        "j2",
        "()Ljava/util/List;",
        "availableVideoTracks",
        "Y",
        "LKd/m;",
        "u2",
        "f3",
        "keepScreenOnWhilePlaying",
        "expo/modules/video/player/VideoPlayer$g",
        "Lexpo/modules/video/player/VideoPlayer$g;",
        "playerListener",
        "expo/modules/video/player/VideoPlayer$b",
        "l0",
        "Lexpo/modules/video/player/VideoPlayer$b;",
        "analyticsListener",
        "q2",
        "()Lexpo/modules/video/VideoView;",
        "e3",
        "getCurrentVideoView$delegate",
        "(Lexpo/modules/video/player/VideoPlayer;)Ljava/lang/Object;",
        "currentVideoView",
        "o2",
        "()Ljava/lang/Float;",
        "currentOffsetFromLive",
        "",
        "n2",
        "()Ljava/lang/Long;",
        "currentLiveTimestamp",
        "",
        "l2",
        "()D",
        "bufferedPosition",
        "expo-video_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field static final synthetic m0:[Lpe/m;


# instance fields
.field private final A:LGd/b;

.field private final B:LGd/b;

.field private final C:LGd/b;

.field private D:Lexpo/modules/video/records/BufferOptions;

.field private E:Lexpo/modules/video/enums/AudioMixingMode;

.field private F:Z

.field private G:Lexpo/modules/video/records/VideoTrack;

.field private H:Lexpo/modules/video/records/SeekTolerance;

.field private I:Lexpo/modules/video/records/ScrubbingModeOptions;

.field private X:Ljava/util/List;

.field private final Y:LKd/m;

.field private final Z:Lexpo/modules/video/player/VideoPlayer$g;

.field private final c:Landroid/content/Context;

.field private d:LA2/d;

.field private final e:Ljava/util/List;

.field private final f:LMd/e;

.field private final g:LKd/o;

.field private final h:LKd/p;

.field private final i:LKd/l;

.field private final j:LP2/n;

.field private final k:Landroidx/media3/exoplayer/ExoPlayer;

.field private final l:LKd/b;

.field private final l0:Lexpo/modules/video/player/VideoPlayer$b;

.field private final m:LJd/d;

.field private n:LE3/h3;

.field private final o:LFd/o;

.field private final p:LGd/b;

.field private q:Lexpo/modules/video/records/VideoSource;

.field private final r:LGd/b;

.field private s:F

.field private t:Lexpo/modules/video/enums/PlayerStatus;

.field private u:Z

.field private v:Z

.field private w:Z

.field private x:Z

.field private y:F

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, Lkotlin/jvm/internal/z;

    .line 2
    .line 3
    const-class v1, Lexpo/modules/video/player/VideoPlayer;

    .line 4
    .line 5
    const-string v2, "currentVideoView"

    .line 6
    .line 7
    const-string v3, "getCurrentVideoView()Lexpo/modules/video/VideoView;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/z;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lkotlin/jvm/internal/O;->e(Lkotlin/jvm/internal/y;)Lpe/k;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v2, Lkotlin/jvm/internal/z;

    .line 18
    .line 19
    const-string v3, "playing"

    .line 20
    .line 21
    const-string v5, "getPlaying()Z"

    .line 22
    .line 23
    invoke-direct {v2, v1, v3, v5, v4}, Lkotlin/jvm/internal/z;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 24
    .line 25
    .line 26
    invoke-static {v2}, Lkotlin/jvm/internal/O;->e(Lkotlin/jvm/internal/y;)Lpe/k;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    new-instance v3, Lkotlin/jvm/internal/z;

    .line 31
    .line 32
    const-string v5, "commitedSource"

    .line 33
    .line 34
    const-string v6, "getCommitedSource()Lexpo/modules/video/records/VideoSource;"

    .line 35
    .line 36
    invoke-direct {v3, v1, v5, v6, v4}, Lkotlin/jvm/internal/z;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 37
    .line 38
    .line 39
    invoke-static {v3}, Lkotlin/jvm/internal/O;->e(Lkotlin/jvm/internal/y;)Lpe/k;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    new-instance v5, Lkotlin/jvm/internal/z;

    .line 44
    .line 45
    const-string v6, "volume"

    .line 46
    .line 47
    const-string v7, "getVolume()F"

    .line 48
    .line 49
    invoke-direct {v5, v1, v6, v7, v4}, Lkotlin/jvm/internal/z;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 50
    .line 51
    .line 52
    invoke-static {v5}, Lkotlin/jvm/internal/O;->e(Lkotlin/jvm/internal/y;)Lpe/k;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    new-instance v6, Lkotlin/jvm/internal/z;

    .line 57
    .line 58
    const-string v7, "muted"

    .line 59
    .line 60
    const-string v8, "getMuted()Z"

    .line 61
    .line 62
    invoke-direct {v6, v1, v7, v8, v4}, Lkotlin/jvm/internal/z;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 63
    .line 64
    .line 65
    invoke-static {v6}, Lkotlin/jvm/internal/O;->e(Lkotlin/jvm/internal/y;)Lpe/k;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    new-instance v7, Lkotlin/jvm/internal/z;

    .line 70
    .line 71
    const-string v8, "playbackParameters"

    .line 72
    .line 73
    const-string v9, "getPlaybackParameters()Landroidx/media3/common/PlaybackParameters;"

    .line 74
    .line 75
    invoke-direct {v7, v1, v8, v9, v4}, Lkotlin/jvm/internal/z;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 76
    .line 77
    .line 78
    invoke-static {v7}, Lkotlin/jvm/internal/O;->e(Lkotlin/jvm/internal/y;)Lpe/k;

    .line 79
    .line 80
    .line 81
    move-result-object v7

    .line 82
    new-instance v8, Lkotlin/jvm/internal/z;

    .line 83
    .line 84
    const-string v9, "keepScreenOnWhilePlaying"

    .line 85
    .line 86
    const-string v10, "getKeepScreenOnWhilePlaying()Z"

    .line 87
    .line 88
    invoke-direct {v8, v1, v9, v10, v4}, Lkotlin/jvm/internal/z;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 89
    .line 90
    .line 91
    invoke-static {v8}, Lkotlin/jvm/internal/O;->e(Lkotlin/jvm/internal/y;)Lpe/k;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    const/4 v8, 0x7

    .line 96
    new-array v8, v8, [Lpe/m;

    .line 97
    .line 98
    aput-object v0, v8, v4

    .line 99
    .line 100
    const/4 v0, 0x1

    .line 101
    aput-object v2, v8, v0

    .line 102
    .line 103
    const/4 v0, 0x2

    .line 104
    aput-object v3, v8, v0

    .line 105
    .line 106
    const/4 v0, 0x3

    .line 107
    aput-object v5, v8, v0

    .line 108
    .line 109
    const/4 v0, 0x4

    .line 110
    aput-object v6, v8, v0

    .line 111
    .line 112
    const/4 v0, 0x5

    .line 113
    aput-object v7, v8, v0

    .line 114
    .line 115
    const/4 v0, 0x6

    .line 116
    aput-object v1, v8, v0

    .line 117
    .line 118
    sput-object v8, Lexpo/modules/video/player/VideoPlayer;->m0:[Lpe/m;

    .line 119
    .line 120
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;LUb/d;Lexpo/modules/video/records/VideoSource;Lexpo/modules/video/records/PlayerBuilderOptions;)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const-string v3, "context"

    .line 8
    .line 9
    invoke-static {v0, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v3, "appContext"

    .line 13
    .line 14
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {v1, v2}, Lexpo/modules/kotlin/sharedobjects/SharedObject;-><init>(LUb/d;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, v1, Lexpo/modules/video/player/VideoPlayer;->c:Landroid/content/Context;

    .line 21
    .line 22
    new-instance v3, LA2/d;

    .line 23
    .line 24
    invoke-direct {v3, v0}, LA2/d;-><init>(Landroid/content/Context;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3}, LA2/d;->m()LA2/d;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    const/4 v4, 0x1

    .line 32
    invoke-virtual {v3, v4}, LA2/d;->p(Z)LA2/d;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    const-string v4, "setEnableDecoderFallback(...)"

    .line 37
    .line 38
    invoke-static {v3, v4}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    iput-object v3, v1, Lexpo/modules/video/player/VideoPlayer;->d:LA2/d;

    .line 42
    .line 43
    new-instance v3, Ljava/util/ArrayList;

    .line 44
    .line 45
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object v3, v1, Lexpo/modules/video/player/VideoPlayer;->e:Ljava/util/List;

    .line 49
    .line 50
    new-instance v3, LMd/e;

    .line 51
    .line 52
    new-instance v4, LKd/d;

    .line 53
    .line 54
    invoke-direct {v4, v1}, LKd/d;-><init>(Lexpo/modules/video/player/VideoPlayer;)V

    .line 55
    .line 56
    .line 57
    const/4 v6, 0x0

    .line 58
    invoke-direct {v3, v6, v4}, LMd/e;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 59
    .line 60
    .line 61
    iput-object v3, v1, Lexpo/modules/video/player/VideoPlayer;->f:LMd/e;

    .line 62
    .line 63
    new-instance v3, LKd/o;

    .line 64
    .line 65
    invoke-direct {v3}, LKd/o;-><init>()V

    .line 66
    .line 67
    .line 68
    iput-object v3, v1, Lexpo/modules/video/player/VideoPlayer;->g:LKd/o;

    .line 69
    .line 70
    new-instance v4, LKd/p;

    .line 71
    .line 72
    invoke-direct {v4, v1}, LKd/p;-><init>(Lexpo/modules/video/player/VideoPlayer;)V

    .line 73
    .line 74
    .line 75
    iput-object v4, v1, Lexpo/modules/video/player/VideoPlayer;->h:LKd/p;

    .line 76
    .line 77
    new-instance v4, LKd/l;

    .line 78
    .line 79
    invoke-direct {v4, v1}, LKd/l;-><init>(Lexpo/modules/video/player/VideoPlayer;)V

    .line 80
    .line 81
    .line 82
    iput-object v4, v1, Lexpo/modules/video/player/VideoPlayer;->i:LKd/l;

    .line 83
    .line 84
    new-instance v4, LP2/n;

    .line 85
    .line 86
    invoke-direct {v4, v0}, LP2/n;-><init>(Landroid/content/Context;)V

    .line 87
    .line 88
    .line 89
    iput-object v4, v1, Lexpo/modules/video/player/VideoPlayer;->j:LP2/n;

    .line 90
    .line 91
    new-instance v4, Landroidx/media3/exoplayer/ExoPlayer$b;

    .line 92
    .line 93
    iget-object v5, v1, Lexpo/modules/video/player/VideoPlayer;->d:LA2/d;

    .line 94
    .line 95
    invoke-direct {v4, v0, v5}, Landroidx/media3/exoplayer/ExoPlayer$b;-><init>(Landroid/content/Context;LA2/O;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    invoke-virtual {v4, v5}, Landroidx/media3/exoplayer/ExoPlayer$b;->k(Landroid/os/Looper;)Landroidx/media3/exoplayer/ExoPlayer$b;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v4, v3}, Landroidx/media3/exoplayer/ExoPlayer$b;->j(Landroidx/media3/exoplayer/p0;)Landroidx/media3/exoplayer/ExoPlayer$b;

    .line 106
    .line 107
    .line 108
    if-eqz p4, :cond_0

    .line 109
    .line 110
    invoke-virtual/range {p4 .. p4}, Lexpo/modules/video/records/PlayerBuilderOptions;->getSeekBackwardIncrement-FghU774()LEf/a;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    if-eqz v3, :cond_0

    .line 115
    .line 116
    invoke-virtual {v3}, LEf/a;->S()J

    .line 117
    .line 118
    .line 119
    move-result-wide v7

    .line 120
    sget-object v3, LEf/d;->d:LEf/d;

    .line 121
    .line 122
    invoke-static {v7, v8, v3}, LEf/a;->P(JLEf/d;)J

    .line 123
    .line 124
    .line 125
    move-result-wide v9

    .line 126
    const-wide/16 v11, 0x1

    .line 127
    .line 128
    const-wide/32 v13, 0xf3e58

    .line 129
    .line 130
    .line 131
    invoke-static/range {v9 .. v14}, Loe/j;->o(JJJ)J

    .line 132
    .line 133
    .line 134
    move-result-wide v7

    .line 135
    invoke-virtual {v4, v7, v8}, Landroidx/media3/exoplayer/ExoPlayer$b;->l(J)Landroidx/media3/exoplayer/ExoPlayer$b;

    .line 136
    .line 137
    .line 138
    :cond_0
    if-eqz p4, :cond_1

    .line 139
    .line 140
    invoke-virtual/range {p4 .. p4}, Lexpo/modules/video/records/PlayerBuilderOptions;->getSeekForwardIncrement-FghU774()LEf/a;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    if-eqz v3, :cond_1

    .line 145
    .line 146
    invoke-virtual {v3}, LEf/a;->S()J

    .line 147
    .line 148
    .line 149
    move-result-wide v7

    .line 150
    sget-object v3, LEf/d;->d:LEf/d;

    .line 151
    .line 152
    invoke-static {v7, v8, v3}, LEf/a;->P(JLEf/d;)J

    .line 153
    .line 154
    .line 155
    move-result-wide v9

    .line 156
    const-wide/16 v11, 0x1

    .line 157
    .line 158
    const-wide/32 v13, 0xf3e58

    .line 159
    .line 160
    .line 161
    invoke-static/range {v9 .. v14}, Loe/j;->o(JJJ)J

    .line 162
    .line 163
    .line 164
    move-result-wide v7

    .line 165
    invoke-virtual {v4, v7, v8}, Landroidx/media3/exoplayer/ExoPlayer$b;->m(J)Landroidx/media3/exoplayer/ExoPlayer$b;

    .line 166
    .line 167
    .line 168
    :cond_1
    invoke-virtual {v4}, Landroidx/media3/exoplayer/ExoPlayer$b;->i()Landroidx/media3/exoplayer/ExoPlayer;

    .line 169
    .line 170
    .line 171
    move-result-object v7

    .line 172
    const-string v3, "build(...)"

    .line 173
    .line 174
    invoke-static {v7, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    iput-object v7, v1, Lexpo/modules/video/player/VideoPlayer;->k:Landroidx/media3/exoplayer/ExoPlayer;

    .line 178
    .line 179
    new-instance v3, LJd/d;

    .line 180
    .line 181
    new-instance v4, Ljava/lang/ref/WeakReference;

    .line 182
    .line 183
    invoke-direct {v4, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    invoke-direct {v3, v4, v2}, LJd/d;-><init>(Ljava/lang/ref/WeakReference;LUb/d;)V

    .line 187
    .line 188
    .line 189
    iput-object v3, v1, Lexpo/modules/video/player/VideoPlayer;->m:LJd/d;

    .line 190
    .line 191
    invoke-static {v0, v7}, LMd/d;->a(Landroid/content/Context;Landroidx/media3/exoplayer/ExoPlayer;)LE3/h3;

    .line 192
    .line 193
    .line 194
    move-result-object v0

    .line 195
    iput-object v0, v1, Lexpo/modules/video/player/VideoPlayer;->n:LE3/h3;

    .line 196
    .line 197
    new-instance v0, LFd/o;

    .line 198
    .line 199
    invoke-direct {v0, v1}, LFd/o;-><init>(LFd/p;)V

    .line 200
    .line 201
    .line 202
    iput-object v0, v1, Lexpo/modules/video/player/VideoPlayer;->o:LFd/o;

    .line 203
    .line 204
    new-instance v8, LGd/b;

    .line 205
    .line 206
    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 207
    .line 208
    new-instance v11, LKd/e;

    .line 209
    .line 210
    invoke-direct {v11, v1}, LKd/e;-><init>(Lexpo/modules/video/player/VideoPlayer;)V

    .line 211
    .line 212
    .line 213
    const/4 v12, 0x2

    .line 214
    const/4 v13, 0x0

    .line 215
    const/4 v10, 0x0

    .line 216
    invoke-direct/range {v8 .. v13}, LGd/b;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 217
    .line 218
    .line 219
    iput-object v8, v1, Lexpo/modules/video/player/VideoPlayer;->p:LGd/b;

    .line 220
    .line 221
    move-object/from16 v0, p3

    .line 222
    .line 223
    iput-object v0, v1, Lexpo/modules/video/player/VideoPlayer;->q:Lexpo/modules/video/records/VideoSource;

    .line 224
    .line 225
    new-instance v10, LGd/b;

    .line 226
    .line 227
    new-instance v13, LKd/f;

    .line 228
    .line 229
    invoke-direct {v13, v1}, LKd/f;-><init>(Lexpo/modules/video/player/VideoPlayer;)V

    .line 230
    .line 231
    .line 232
    const/4 v14, 0x2

    .line 233
    const/4 v15, 0x0

    .line 234
    const/4 v11, 0x0

    .line 235
    const/4 v12, 0x0

    .line 236
    invoke-direct/range {v10 .. v15}, LGd/b;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 237
    .line 238
    .line 239
    iput-object v10, v1, Lexpo/modules/video/player/VideoPlayer;->r:LGd/b;

    .line 240
    .line 241
    const/high16 v0, 0x3f800000    # 1.0f

    .line 242
    .line 243
    iput v0, v1, Lexpo/modules/video/player/VideoPlayer;->s:F

    .line 244
    .line 245
    sget-object v3, Lexpo/modules/video/enums/PlayerStatus;->IDLE:Lexpo/modules/video/enums/PlayerStatus;

    .line 246
    .line 247
    iput-object v3, v1, Lexpo/modules/video/player/VideoPlayer;->t:Lexpo/modules/video/enums/PlayerStatus;

    .line 248
    .line 249
    new-instance v10, LGd/b;

    .line 250
    .line 251
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 252
    .line 253
    .line 254
    move-result-object v11

    .line 255
    new-instance v13, LKd/g;

    .line 256
    .line 257
    invoke-direct {v13, v2, v1}, LKd/g;-><init>(LUb/d;Lexpo/modules/video/player/VideoPlayer;)V

    .line 258
    .line 259
    .line 260
    invoke-direct/range {v10 .. v15}, LGd/b;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 261
    .line 262
    .line 263
    iput-object v10, v1, Lexpo/modules/video/player/VideoPlayer;->A:LGd/b;

    .line 264
    .line 265
    move-object v10, v9

    .line 266
    new-instance v9, LGd/b;

    .line 267
    .line 268
    new-instance v12, LKd/h;

    .line 269
    .line 270
    invoke-direct {v12, v2, v1}, LKd/h;-><init>(LUb/d;Lexpo/modules/video/player/VideoPlayer;)V

    .line 271
    .line 272
    .line 273
    const/4 v13, 0x2

    .line 274
    const/4 v14, 0x0

    .line 275
    const/4 v11, 0x0

    .line 276
    invoke-direct/range {v9 .. v14}, LGd/b;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 277
    .line 278
    .line 279
    iput-object v9, v1, Lexpo/modules/video/player/VideoPlayer;->B:LGd/b;

    .line 280
    .line 281
    new-instance v0, LGd/b;

    .line 282
    .line 283
    sget-object v3, Lq2/O;->d:Lq2/O;

    .line 284
    .line 285
    new-instance v4, LKd/i;

    .line 286
    .line 287
    invoke-direct {v4, v1}, LKd/i;-><init>(Lexpo/modules/video/player/VideoPlayer;)V

    .line 288
    .line 289
    .line 290
    new-instance v5, LKd/j;

    .line 291
    .line 292
    invoke-direct {v5, v2, v1}, LKd/j;-><init>(LUb/d;Lexpo/modules/video/player/VideoPlayer;)V

    .line 293
    .line 294
    .line 295
    invoke-direct {v0, v3, v4, v5}, LGd/b;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V

    .line 296
    .line 297
    .line 298
    iput-object v0, v1, Lexpo/modules/video/player/VideoPlayer;->C:LGd/b;

    .line 299
    .line 300
    new-instance v8, Lexpo/modules/video/records/BufferOptions;

    .line 301
    .line 302
    const/16 v15, 0xf

    .line 303
    .line 304
    const/16 v16, 0x0

    .line 305
    .line 306
    const/4 v9, 0x0

    .line 307
    const-wide/16 v10, 0x0

    .line 308
    .line 309
    const/4 v12, 0x0

    .line 310
    const-wide/16 v13, 0x0

    .line 311
    .line 312
    invoke-direct/range {v8 .. v16}, Lexpo/modules/video/records/BufferOptions;-><init>(Ljava/lang/Double;JZDILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 313
    .line 314
    .line 315
    iput-object v8, v1, Lexpo/modules/video/player/VideoPlayer;->D:Lexpo/modules/video/records/BufferOptions;

    .line 316
    .line 317
    sget-object v0, Lexpo/modules/video/enums/AudioMixingMode;->AUTO:Lexpo/modules/video/enums/AudioMixingMode;

    .line 318
    .line 319
    iput-object v0, v1, Lexpo/modules/video/player/VideoPlayer;->E:Lexpo/modules/video/enums/AudioMixingMode;

    .line 320
    .line 321
    new-instance v8, Lexpo/modules/video/records/SeekTolerance;

    .line 322
    .line 323
    const/4 v13, 0x3

    .line 324
    const/4 v14, 0x0

    .line 325
    const-wide/16 v9, 0x0

    .line 326
    .line 327
    const-wide/16 v11, 0x0

    .line 328
    .line 329
    invoke-direct/range {v8 .. v14}, Lexpo/modules/video/records/SeekTolerance;-><init>(DDILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 330
    .line 331
    .line 332
    iput-object v8, v1, Lexpo/modules/video/player/VideoPlayer;->H:Lexpo/modules/video/records/SeekTolerance;

    .line 333
    .line 334
    new-instance v9, Lexpo/modules/video/records/ScrubbingModeOptions;

    .line 335
    .line 336
    const/16 v15, 0x1f

    .line 337
    .line 338
    const/4 v10, 0x0

    .line 339
    const/4 v11, 0x0

    .line 340
    const/4 v12, 0x0

    .line 341
    const/4 v13, 0x0

    .line 342
    const/4 v14, 0x0

    .line 343
    invoke-direct/range {v9 .. v16}, Lexpo/modules/video/records/ScrubbingModeOptions;-><init>(ZZZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 344
    .line 345
    .line 346
    iput-object v9, v1, Lexpo/modules/video/player/VideoPlayer;->I:Lexpo/modules/video/records/ScrubbingModeOptions;

    .line 347
    .line 348
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    iput-object v0, v1, Lexpo/modules/video/player/VideoPlayer;->X:Ljava/util/List;

    .line 353
    .line 354
    new-instance v0, LKd/m;

    .line 355
    .line 356
    const/4 v4, 0x4

    .line 357
    const/4 v5, 0x0

    .line 358
    const/4 v3, 0x0

    .line 359
    invoke-direct/range {v0 .. v5}, LKd/m;-><init>(Lexpo/modules/video/player/VideoPlayer;LUb/d;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 360
    .line 361
    .line 362
    iput-object v0, v1, Lexpo/modules/video/player/VideoPlayer;->Y:LKd/m;

    .line 363
    .line 364
    new-instance v0, Lexpo/modules/video/player/VideoPlayer$g;

    .line 365
    .line 366
    invoke-direct {v0, v1}, Lexpo/modules/video/player/VideoPlayer$g;-><init>(Lexpo/modules/video/player/VideoPlayer;)V

    .line 367
    .line 368
    .line 369
    iput-object v0, v1, Lexpo/modules/video/player/VideoPlayer;->Z:Lexpo/modules/video/player/VideoPlayer$g;

    .line 370
    .line 371
    new-instance v2, Lexpo/modules/video/player/VideoPlayer$b;

    .line 372
    .line 373
    invoke-direct {v2, v1}, Lexpo/modules/video/player/VideoPlayer$b;-><init>(Lexpo/modules/video/player/VideoPlayer;)V

    .line 374
    .line 375
    .line 376
    iput-object v2, v1, Lexpo/modules/video/player/VideoPlayer;->l0:Lexpo/modules/video/player/VideoPlayer$b;

    .line 377
    .line 378
    invoke-interface {v7, v0}, Lq2/P;->a0(Lq2/P$d;)V

    .line 379
    .line 380
    .line 381
    invoke-interface {v7, v2}, Landroidx/media3/exoplayer/ExoPlayer;->A(LB2/b;)V

    .line 382
    .line 383
    .line 384
    sget-object v0, LId/m;->a:LId/m;

    .line 385
    .line 386
    invoke-virtual {v0, v1}, LId/m;->p(Lexpo/modules/video/player/VideoPlayer;)V

    .line 387
    .line 388
    .line 389
    invoke-direct {v1}, Lexpo/modules/video/player/VideoPlayer;->e2()LKd/b;

    .line 390
    .line 391
    .line 392
    move-result-object v0

    .line 393
    iput-object v0, v1, Lexpo/modules/video/player/VideoPlayer;->l:LKd/b;

    .line 394
    .line 395
    invoke-virtual/range {p2 .. p2}, LUb/d;->x()LGf/O;

    .line 396
    .line 397
    .line 398
    move-result-object v7

    .line 399
    new-instance v10, Lexpo/modules/video/player/VideoPlayer$a;

    .line 400
    .line 401
    invoke-direct {v10, v1, v6}, Lexpo/modules/video/player/VideoPlayer$a;-><init>(Lexpo/modules/video/player/VideoPlayer;LZd/e;)V

    .line 402
    .line 403
    .line 404
    const/4 v11, 0x3

    .line 405
    const/4 v12, 0x0

    .line 406
    const/4 v8, 0x0

    .line 407
    const/4 v9, 0x0

    .line 408
    invoke-static/range {v7 .. v12}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 409
    .line 410
    .line 411
    return-void
.end method

.method public static final synthetic A1(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/player/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lexpo/modules/video/player/VideoPlayer;->Y2(Lexpo/modules/video/player/a;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic B0(Lexpo/modules/video/player/VideoPlayer;ZZ)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lexpo/modules/video/player/VideoPlayer;->S2(Lexpo/modules/video/player/VideoPlayer;ZZ)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic D1(Lexpo/modules/video/player/VideoPlayer;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lexpo/modules/video/player/VideoPlayer;->Z2(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic F0(Lexpo/modules/video/player/VideoPlayer;Lq2/O;)Lq2/O;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lexpo/modules/video/player/VideoPlayer;->P2(Lexpo/modules/video/player/VideoPlayer;Lq2/O;)Lq2/O;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic G0(Lexpo/modules/video/player/VideoPlayer;Lq2/O;)Lq2/O;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lexpo/modules/video/player/VideoPlayer;->b2(Lq2/O;)Lq2/O;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic J(Lexpo/modules/video/player/VideoPlayer;)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0}, Lexpo/modules/video/player/VideoPlayer;->f2(Lexpo/modules/video/player/VideoPlayer;)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic M0(Lexpo/modules/video/player/VideoPlayer;)Lexpo/modules/video/player/VideoPlayer$b;
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/video/player/VideoPlayer;->l0:Lexpo/modules/video/player/VideoPlayer$b;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic O(LUb/d;Lexpo/modules/video/player/VideoPlayer;FF)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lexpo/modules/video/player/VideoPlayer;->w3(LUb/d;Lexpo/modules/video/player/VideoPlayer;FF)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic O1(Lexpo/modules/video/player/VideoPlayer;Ljava/util/List;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/video/player/VideoPlayer;->X:Ljava/util/List;

    .line 2
    .line 3
    return-void
.end method

.method private static final O2(LUb/d;Lexpo/modules/video/player/VideoPlayer;ZZ)LTd/L;
    .locals 6

    .line 1
    invoke-virtual {p0}, LUb/d;->x()LGf/O;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lexpo/modules/video/player/VideoPlayer$e;

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    invoke-direct {v3, p1, p2, p0}, Lexpo/modules/video/player/VideoPlayer$e;-><init>(Lexpo/modules/video/player/VideoPlayer;ZLZd/e;)V

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-static/range {v0 .. v5}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 16
    .line 17
    .line 18
    new-instance p0, Lexpo/modules/video/player/a$f;

    .line 19
    .line 20
    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 21
    .line 22
    .line 23
    move-result-object p3

    .line 24
    invoke-direct {p0, p2, p3}, Lexpo/modules/video/player/a$f;-><init>(ZLjava/lang/Boolean;)V

    .line 25
    .line 26
    .line 27
    invoke-direct {p1, p0}, Lexpo/modules/video/player/VideoPlayer;->Y2(Lexpo/modules/video/player/a;)V

    .line 28
    .line 29
    .line 30
    sget-object p0, LTd/L;->a:LTd/L;

    .line 31
    .line 32
    return-object p0
.end method

.method private static final P2(Lexpo/modules/video/player/VideoPlayer;Lq2/O;)Lq2/O;
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lexpo/modules/video/player/VideoPlayer;->b2(Lq2/O;)Lq2/O;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method private static final Q2(LUb/d;Lexpo/modules/video/player/VideoPlayer;Lq2/O;Lq2/O;)LTd/L;
    .locals 7

    .line 1
    const-string v0, "new"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "old"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, LUb/d;->x()LGf/O;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    new-instance v4, Lexpo/modules/video/player/VideoPlayer$f;

    .line 16
    .line 17
    const/4 p0, 0x0

    .line 18
    invoke-direct {v4, p1, p2, p0}, Lexpo/modules/video/player/VideoPlayer$f;-><init>(Lexpo/modules/video/player/VideoPlayer;Lq2/O;LZd/e;)V

    .line 19
    .line 20
    .line 21
    const/4 v5, 0x3

    .line 22
    const/4 v6, 0x0

    .line 23
    const/4 v2, 0x0

    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-static/range {v1 .. v6}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 26
    .line 27
    .line 28
    iget p0, p3, Lq2/O;->a:F

    .line 29
    .line 30
    iget p2, p2, Lq2/O;->a:F

    .line 31
    .line 32
    cmpg-float p3, p0, p2

    .line 33
    .line 34
    if-nez p3, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    new-instance p3, Lexpo/modules/video/player/a$g;

    .line 38
    .line 39
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-direct {p3, p2, p0}, Lexpo/modules/video/player/a$g;-><init>(FLjava/lang/Float;)V

    .line 44
    .line 45
    .line 46
    invoke-direct {p1, p3}, Lexpo/modules/video/player/VideoPlayer;->Y2(Lexpo/modules/video/player/a;)V

    .line 47
    .line 48
    .line 49
    :goto_0
    sget-object p0, LTd/L;->a:LTd/L;

    .line 50
    .line 51
    return-object p0
.end method

.method private final R2(I)Lexpo/modules/video/enums/PlayerStatus;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p1, v0, :cond_4

    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    if-eq p1, v0, :cond_3

    .line 6
    .line 7
    const/4 v0, 0x3

    .line 8
    if-eq p1, v0, :cond_2

    .line 9
    .line 10
    const/4 v0, 0x4

    .line 11
    if-eq p1, v0, :cond_0

    .line 12
    .line 13
    sget-object p1, Lexpo/modules/video/enums/PlayerStatus;->IDLE:Lexpo/modules/video/enums/PlayerStatus;

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    iget-object p1, p0, Lexpo/modules/video/player/VideoPlayer;->k:Landroidx/media3/exoplayer/ExoPlayer;

    .line 17
    .line 18
    invoke-interface {p1}, Landroidx/media3/exoplayer/ExoPlayer;->y()Landroidx/media3/exoplayer/s;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    sget-object p1, Lexpo/modules/video/enums/PlayerStatus;->ERROR:Lexpo/modules/video/enums/PlayerStatus;

    .line 25
    .line 26
    return-object p1

    .line 27
    :cond_1
    sget-object p1, Lexpo/modules/video/enums/PlayerStatus;->IDLE:Lexpo/modules/video/enums/PlayerStatus;

    .line 28
    .line 29
    return-object p1

    .line 30
    :cond_2
    sget-object p1, Lexpo/modules/video/enums/PlayerStatus;->READY_TO_PLAY:Lexpo/modules/video/enums/PlayerStatus;

    .line 31
    .line 32
    return-object p1

    .line 33
    :cond_3
    sget-object p1, Lexpo/modules/video/enums/PlayerStatus;->LOADING:Lexpo/modules/video/enums/PlayerStatus;

    .line 34
    .line 35
    return-object p1

    .line 36
    :cond_4
    sget-object p1, Lexpo/modules/video/enums/PlayerStatus;->IDLE:Lexpo/modules/video/enums/PlayerStatus;

    .line 37
    .line 38
    return-object p1
.end method

.method public static synthetic S(LHd/b;Ljava/lang/ref/WeakReference;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lexpo/modules/video/player/VideoPlayer;->W2(LHd/b;Ljava/lang/ref/WeakReference;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static final synthetic S1(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/records/VideoTrack;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lexpo/modules/video/player/VideoPlayer;->d3(Lexpo/modules/video/records/VideoTrack;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private static final S2(Lexpo/modules/video/player/VideoPlayer;ZZ)LTd/L;
    .locals 1

    .line 1
    new-instance v0, Lexpo/modules/video/player/a$e;

    .line 2
    .line 3
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-direct {v0, p1, p2}, Lexpo/modules/video/player/a$e;-><init>(ZLjava/lang/Boolean;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, v0}, Lexpo/modules/video/player/VideoPlayer;->Y2(Lexpo/modules/video/player/a;)V

    .line 11
    .line 12
    .line 13
    sget-object p0, LTd/L;->a:LTd/L;

    .line 14
    .line 15
    return-object p0
.end method

.method private final U2()V
    .locals 2

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer;->k:Landroidx/media3/exoplayer/ExoPlayer;

    .line 2
    .line 3
    invoke-interface {v0}, Lq2/P;->getDuration()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    long-to-float v0, v0

    .line 8
    const/high16 v1, 0x447a0000    # 1000.0f

    .line 9
    .line 10
    div-float/2addr v0, v1

    .line 11
    iput v0, p0, Lexpo/modules/video/player/VideoPlayer;->y:F

    .line 12
    .line 13
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer;->k:Landroidx/media3/exoplayer/ExoPlayer;

    .line 14
    .line 15
    invoke-interface {v0}, Lq2/P;->Y0()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iput-boolean v0, p0, Lexpo/modules/video/player/VideoPlayer;->z:Z

    .line 20
    .line 21
    return-void
.end method

.method private static final W2(LHd/b;Ljava/lang/ref/WeakReference;)Z
    .locals 1

    .line 1
    const-string v0, "it"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-static {p1, p0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0
.end method

.method private final X2()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lexpo/modules/video/player/VideoPlayer;->y:F

    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lexpo/modules/video/player/VideoPlayer;->z:Z

    .line 6
    .line 7
    return-void
.end method

.method public static synthetic Y(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/records/VideoSource;Lexpo/modules/video/records/VideoSource;)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lexpo/modules/video/player/VideoPlayer;->d2(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/records/VideoSource;Lexpo/modules/video/records/VideoSource;)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic Y1(Lexpo/modules/video/player/VideoPlayer;Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lexpo/modules/video/player/VideoPlayer;->F:Z

    .line 2
    .line 3
    return-void
.end method

.method private final Y2(Lexpo/modules/video/player/a;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer;->e:Ljava/util/List;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    iget-object v1, p0, Lexpo/modules/video/player/VideoPlayer;->e:Ljava/util/List;

    .line 5
    .line 6
    new-instance v2, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    check-cast v3, Ljava/lang/ref/WeakReference;

    .line 26
    .line 27
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, LHd/b;

    .line 32
    .line 33
    if-eqz v3, :cond_0

    .line 34
    .line 35
    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catchall_0
    move-exception p1

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    monitor-exit v0

    .line 42
    invoke-virtual {p1, p0, v2}, Lexpo/modules/video/player/a;->a(Lexpo/modules/video/player/VideoPlayer;Ljava/util/List;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Lexpo/modules/video/player/a;->b()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    invoke-virtual {p1}, Lexpo/modules/video/player/a;->d()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {p1}, Lexpo/modules/video/player/a;->c()Lexpo/modules/video/records/VideoEventPayload;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {p0, v0, p1}, Lexpo/modules/kotlin/sharedobjects/SharedObject;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    :cond_2
    return-void

    .line 67
    :goto_1
    monitor-exit v0

    .line 68
    throw p1
.end method

.method public static final synthetic Z1(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/enums/PlayerStatus;Lq2/N;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lexpo/modules/video/player/VideoPlayer;->p3(Lexpo/modules/video/enums/PlayerStatus;Lq2/N;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final Z2(Z)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-direct {p0}, Lexpo/modules/video/player/VideoPlayer;->u3()Z

    .line 4
    .line 5
    .line 6
    :cond_0
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer;->m:LJd/d;

    .line 7
    .line 8
    invoke-virtual {v0}, LJd/d;->b()LJd/c;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0}, LJd/c;->a()Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    iget-object v1, p0, Lexpo/modules/video/player/VideoPlayer;->k:Landroidx/media3/exoplayer/ExoPlayer;

    .line 21
    .line 22
    invoke-virtual {v0, p1, v1}, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;->M(ZLandroidx/media3/exoplayer/ExoPlayer;)V

    .line 23
    .line 24
    .line 25
    :cond_1
    return-void
.end method

.method public static final synthetic a1(Lexpo/modules/video/player/VideoPlayer;)Lexpo/modules/video/records/VideoSource;
    .locals 0

    .line 1
    invoke-direct {p0}, Lexpo/modules/video/player/VideoPlayer;->m2()Lexpo/modules/video/records/VideoSource;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final b2(Lq2/O;)Lq2/O;
    .locals 2

    .line 1
    iget p1, p1, Lq2/O;->a:F

    .line 2
    .line 3
    iget-boolean v0, p0, Lexpo/modules/video/player/VideoPlayer;->w:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/high16 v0, 0x3f800000    # 1.0f

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move v0, p1

    .line 11
    :goto_0
    new-instance v1, Lq2/O;

    .line 12
    .line 13
    invoke-direct {v1, p1, v0}, Lq2/O;-><init>(FF)V

    .line 14
    .line 15
    .line 16
    return-object v1
.end method

.method private final c3(Lexpo/modules/video/records/VideoSource;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer;->r:LGd/b;

    .line 2
    .line 3
    sget-object v1, Lexpo/modules/video/player/VideoPlayer;->m0:[Lpe/m;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-virtual {v0, p0, v1, p1}, LGd/b;->d(Ljava/lang/Object;Lpe/m;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method private static final d2(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/records/VideoSource;Lexpo/modules/video/records/VideoSource;)LTd/L;
    .locals 1

    .line 1
    new-instance v0, Lexpo/modules/video/player/a$j;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lexpo/modules/video/player/a$j;-><init>(Lexpo/modules/video/records/VideoSource;Lexpo/modules/video/records/VideoSource;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v0}, Lexpo/modules/video/player/VideoPlayer;->Y2(Lexpo/modules/video/player/a;)V

    .line 7
    .line 8
    .line 9
    sget-object p0, LTd/L;->a:LTd/L;

    .line 10
    .line 11
    return-object p0
.end method

.method private final d3(Lexpo/modules/video/records/VideoTrack;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer;->G:Lexpo/modules/video/records/VideoTrack;

    .line 2
    .line 3
    iput-object p1, p0, Lexpo/modules/video/player/VideoPlayer;->G:Lexpo/modules/video/records/VideoTrack;

    .line 4
    .line 5
    new-instance v1, Lexpo/modules/video/player/a$r;

    .line 6
    .line 7
    invoke-direct {v1, p1, v0}, Lexpo/modules/video/player/a$r;-><init>(Lexpo/modules/video/records/VideoTrack;Lexpo/modules/video/records/VideoTrack;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, v1}, Lexpo/modules/video/player/VideoPlayer;->Y2(Lexpo/modules/video/player/a;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private final e2()LKd/b;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lexpo/modules/kotlin/sharedobjects/SharedObject;->l()LUb/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    new-instance v1, LKd/b;

    .line 8
    .line 9
    iget-object v2, p0, Lexpo/modules/video/player/VideoPlayer;->f:LMd/e;

    .line 10
    .line 11
    new-instance v3, LKd/k;

    .line 12
    .line 13
    invoke-direct {v3, p0}, LKd/k;-><init>(Lexpo/modules/video/player/VideoPlayer;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {v1, v0, p0, v2, v3}, LKd/b;-><init>(LUb/d;Lexpo/modules/video/player/VideoPlayer;LMd/e;Lie/a;)V

    .line 17
    .line 18
    .line 19
    return-object v1

    .line 20
    :cond_0
    new-instance v0, Lcc/e;

    .line 21
    .line 22
    invoke-direct {v0}, Lcc/e;-><init>()V

    .line 23
    .line 24
    .line 25
    throw v0
.end method

.method private static final f2(Lexpo/modules/video/player/VideoPlayer;)LTd/L;
    .locals 1

    .line 1
    new-instance v0, Lexpo/modules/video/player/a$i;

    .line 2
    .line 3
    invoke-direct {v0}, Lexpo/modules/video/player/a$i;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v0}, Lexpo/modules/video/player/VideoPlayer;->Y2(Lexpo/modules/video/player/a;)V

    .line 7
    .line 8
    .line 9
    sget-object p0, LTd/L;->a:LTd/L;

    .line 10
    .line 11
    return-object p0
.end method

.method private static final g2(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/VideoView;Lexpo/modules/video/VideoView;)LTd/L;
    .locals 1

    .line 1
    new-instance v0, Lexpo/modules/video/player/a$m;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Lexpo/modules/video/player/a$m;-><init>(Lexpo/modules/video/VideoView;Lexpo/modules/video/VideoView;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v0}, Lexpo/modules/video/player/VideoPlayer;->Y2(Lexpo/modules/video/player/a;)V

    .line 7
    .line 8
    .line 9
    sget-object p0, LTd/L;->a:LTd/L;

    .line 10
    .line 11
    return-object p0
.end method

.method public static synthetic h0(LUb/d;Lexpo/modules/video/player/VideoPlayer;ZZ)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lexpo/modules/video/player/VideoPlayer;->O2(LUb/d;Lexpo/modules/video/player/VideoPlayer;ZZ)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic k0(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/VideoView;Lexpo/modules/video/VideoView;)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lexpo/modules/video/player/VideoPlayer;->g2(Lexpo/modules/video/player/VideoPlayer;Lexpo/modules/video/VideoView;Lexpo/modules/video/VideoView;)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final m2()Lexpo/modules/video/records/VideoSource;
    .locals 3

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer;->r:LGd/b;

    .line 2
    .line 3
    sget-object v1, Lexpo/modules/video/player/VideoPlayer;->m0:[Lpe/m;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-virtual {v0, p0, v1}, LGd/b;->c(Ljava/lang/Object;Lpe/m;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lexpo/modules/video/records/VideoSource;

    .line 13
    .line 14
    return-object v0
.end method

.method public static synthetic p0(LUb/d;Lexpo/modules/video/player/VideoPlayer;Lq2/O;Lq2/O;)LTd/L;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, Lexpo/modules/video/player/VideoPlayer;->Q2(LUb/d;Lexpo/modules/video/player/VideoPlayer;Lq2/O;Lq2/O;)LTd/L;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final p3(Lexpo/modules/video/enums/PlayerStatus;Lq2/N;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer;->t:Lexpo/modules/video/enums/PlayerStatus;

    .line 2
    .line 3
    iput-object p1, p0, Lexpo/modules/video/player/VideoPlayer;->t:Lexpo/modules/video/enums/PlayerStatus;

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    new-instance v1, Lexpo/modules/video/records/PlaybackError;

    .line 8
    .line 9
    invoke-direct {v1, p2}, Lexpo/modules/video/records/PlaybackError;-><init>(Lq2/N;)V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v1, 0x0

    .line 14
    :goto_0
    if-nez v1, :cond_1

    .line 15
    .line 16
    iget-object p2, p0, Lexpo/modules/video/player/VideoPlayer;->k:Landroidx/media3/exoplayer/ExoPlayer;

    .line 17
    .line 18
    invoke-interface {p2}, Lq2/P;->p()I

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    const/4 v2, 0x4

    .line 23
    if-ne p2, v2, :cond_1

    .line 24
    .line 25
    new-instance p2, Lexpo/modules/video/player/a$h;

    .line 26
    .line 27
    invoke-direct {p2}, Lexpo/modules/video/player/a$h;-><init>()V

    .line 28
    .line 29
    .line 30
    invoke-direct {p0, p2}, Lexpo/modules/video/player/VideoPlayer;->Y2(Lexpo/modules/video/player/a;)V

    .line 31
    .line 32
    .line 33
    :cond_1
    iget-object p2, p0, Lexpo/modules/video/player/VideoPlayer;->t:Lexpo/modules/video/enums/PlayerStatus;

    .line 34
    .line 35
    if-eq p2, v0, :cond_2

    .line 36
    .line 37
    new-instance p2, Lexpo/modules/video/player/a$k;

    .line 38
    .line 39
    invoke-direct {p2, p1, v0, v1}, Lexpo/modules/video/player/a$k;-><init>(Lexpo/modules/video/enums/PlayerStatus;Lexpo/modules/video/enums/PlayerStatus;Lexpo/modules/video/records/PlaybackError;)V

    .line 40
    .line 41
    .line 42
    invoke-direct {p0, p2}, Lexpo/modules/video/player/VideoPlayer;->Y2(Lexpo/modules/video/player/a;)V

    .line 43
    .line 44
    .line 45
    :cond_2
    return-void
.end method

.method public static final synthetic q1(Lexpo/modules/video/player/VideoPlayer;)Lexpo/modules/video/player/VideoPlayer$g;
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/video/player/VideoPlayer;->Z:Lexpo/modules/video/player/VideoPlayer$g;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic t1(Lexpo/modules/video/player/VideoPlayer;I)Lexpo/modules/video/enums/PlayerStatus;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lexpo/modules/video/player/VideoPlayer;->R2(I)Lexpo/modules/video/enums/PlayerStatus;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic u1(Lexpo/modules/video/player/VideoPlayer;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lexpo/modules/video/player/VideoPlayer;->U2()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final u3()Z
    .locals 5

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer;->m:LJd/d;

    .line 2
    .line 3
    invoke-virtual {v0}, LJd/d;->b()LJd/c;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0}, LJd/c;->a()Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v0, v1

    .line 16
    :goto_0
    if-eqz v0, :cond_1

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    return v0

    .line 20
    :cond_1
    invoke-virtual {p0}, Lexpo/modules/kotlin/sharedobjects/SharedObject;->l()LUb/d;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-eqz v0, :cond_3

    .line 25
    .line 26
    sget-object v2, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;->q:Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$a;

    .line 27
    .line 28
    iget-object v3, p0, Lexpo/modules/video/player/VideoPlayer;->c:Landroid/content/Context;

    .line 29
    .line 30
    iget-object v4, p0, Lexpo/modules/video/player/VideoPlayer;->m:LJd/d;

    .line 31
    .line 32
    invoke-virtual {v2, v0, v3, v4}, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService$a;->a(LUb/d;Landroid/content/Context;LJd/d;)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-nez v2, :cond_2

    .line 37
    .line 38
    invoke-virtual {v0}, LUb/d;->u()Lub/d;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    const-string v3, "Expo-video has failed to bind with the playback service binder"

    .line 45
    .line 46
    const/4 v4, 0x2

    .line 47
    invoke-static {v3, v1, v4, v1}, LFd/G;->b(Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    invoke-static {v0, v3, v1, v4, v1}, Lub/d;->c(Lub/d;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    :cond_2
    return v2

    .line 55
    :cond_3
    new-instance v0, Lcc/e;

    .line 56
    .line 57
    invoke-direct {v0}, Lcc/e;-><init>()V

    .line 58
    .line 59
    .line 60
    throw v0
.end method

.method private static final w3(LUb/d;Lexpo/modules/video/player/VideoPlayer;FF)LTd/L;
    .locals 6

    .line 1
    invoke-virtual {p0}, LUb/d;->x()LGf/O;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v3, Lexpo/modules/video/player/VideoPlayer$l;

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    invoke-direct {v3, p1, p2, p0}, Lexpo/modules/video/player/VideoPlayer$l;-><init>(Lexpo/modules/video/player/VideoPlayer;FLZd/e;)V

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-static/range {v0 .. v5}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Lexpo/modules/video/player/VideoPlayer;->K2()F

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    iput p0, p1, Lexpo/modules/video/player/VideoPlayer;->s:F

    .line 23
    .line 24
    new-instance p0, Lexpo/modules/video/player/a$s;

    .line 25
    .line 26
    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 27
    .line 28
    .line 29
    move-result-object p3

    .line 30
    invoke-direct {p0, p2, p3}, Lexpo/modules/video/player/a$s;-><init>(FLjava/lang/Float;)V

    .line 31
    .line 32
    .line 33
    invoke-direct {p1, p0}, Lexpo/modules/video/player/VideoPlayer;->Y2(Lexpo/modules/video/player/a;)V

    .line 34
    .line 35
    .line 36
    sget-object p0, LTd/L;->a:LTd/L;

    .line 37
    .line 38
    return-object p0
.end method

.method public static final synthetic y1(Lexpo/modules/video/player/VideoPlayer;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lexpo/modules/video/player/VideoPlayer;->X2()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final A2()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lexpo/modules/video/player/VideoPlayer;->w:Z

    .line 2
    .line 3
    return v0
.end method

.method public final B2()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lexpo/modules/video/player/VideoPlayer;->u:Z

    .line 2
    .line 3
    return v0
.end method

.method public final C2()Lexpo/modules/video/records/ScrubbingModeOptions;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer;->I:Lexpo/modules/video/records/ScrubbingModeOptions;

    .line 2
    .line 3
    return-object v0
.end method

.method public final D2()Lexpo/modules/video/records/SeekTolerance;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer;->H:Lexpo/modules/video/records/SeekTolerance;

    .line 2
    .line 3
    return-object v0
.end method

.method public final E2()LJd/d;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer;->m:LJd/d;

    .line 2
    .line 3
    return-object v0
.end method

.method public final F2()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lexpo/modules/video/player/VideoPlayer;->x:Z

    .line 2
    .line 3
    return v0
.end method

.method public final G2()Lexpo/modules/video/enums/PlayerStatus;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer;->t:Lexpo/modules/video/enums/PlayerStatus;

    .line 2
    .line 3
    return-object v0
.end method

.method public H()V
    .locals 0

    .line 1
    invoke-super {p0}, Lexpo/modules/kotlin/sharedobjects/SharedObject;->H()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lexpo/modules/video/player/VideoPlayer;->close()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final H2()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lexpo/modules/video/player/VideoPlayer;->v:Z

    .line 2
    .line 3
    return v0
.end method

.method public final I2()LKd/p;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer;->h:LKd/p;

    .line 2
    .line 3
    return-object v0
.end method

.method public final J2()F
    .locals 1

    .line 1
    iget v0, p0, Lexpo/modules/video/player/VideoPlayer;->s:F

    .line 2
    .line 3
    return v0
.end method

.method public final K2()F
    .locals 3

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer;->A:LGd/b;

    .line 2
    .line 3
    sget-object v1, Lexpo/modules/video/player/VideoPlayer;->m0:[Lpe/m;

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-virtual {v0, p0, v1}, LGd/b;->c(Ljava/lang/Object;Lpe/m;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Number;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0
.end method

.method public final L2()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lexpo/modules/video/player/VideoPlayer;->q2()Lexpo/modules/video/VideoView;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Lexpo/modules/video/VideoView;->getPlayerView()Landroidx/media3/ui/PlayerView;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Landroidx/media3/ui/PlayerView;->getPlayer()Lq2/P;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v0, v1

    .line 20
    :goto_0
    iget-object v2, p0, Lexpo/modules/video/player/VideoPlayer;->k:Landroidx/media3/exoplayer/ExoPlayer;

    .line 21
    .line 22
    invoke-static {v0, v2}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {p0, v1}, Lexpo/modules/video/player/VideoPlayer;->e3(Lexpo/modules/video/VideoView;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 33
    .line 34
    const-string v1, "The player has been notified of disconnection from the player view, even though it\'s still connected."

    .line 35
    .line 36
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw v0
.end method

.method public final M2()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lexpo/modules/video/player/VideoPlayer;->z:Z

    .line 2
    .line 3
    return v0
.end method

.method public final N2()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lexpo/modules/video/player/VideoPlayer;->F:Z

    .line 2
    .line 3
    return v0
.end method

.method public final T2()V
    .locals 4

    .line 1
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iput-object v0, p0, Lexpo/modules/video/player/VideoPlayer;->X:Ljava/util/List;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-direct {p0, v0}, Lexpo/modules/video/player/VideoPlayer;->d3(Lexpo/modules/video/records/VideoTrack;)V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lexpo/modules/video/player/VideoPlayer;->q:Lexpo/modules/video/records/VideoSource;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget-object v2, p0, Lexpo/modules/video/player/VideoPlayer;->c:Landroid/content/Context;

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Lexpo/modules/video/records/VideoSource;->toMediaSource(Landroid/content/Context;)LM2/D;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object v2, v0

    .line 23
    :goto_0
    if-eqz v2, :cond_1

    .line 24
    .line 25
    iget-object v3, p0, Lexpo/modules/video/player/VideoPlayer;->k:Landroidx/media3/exoplayer/ExoPlayer;

    .line 26
    .line 27
    invoke-interface {v3, v2}, Landroidx/media3/exoplayer/ExoPlayer;->S(LM2/D;)V

    .line 28
    .line 29
    .line 30
    iget-object v2, p0, Lexpo/modules/video/player/VideoPlayer;->k:Landroidx/media3/exoplayer/ExoPlayer;

    .line 31
    .line 32
    invoke-interface {v2}, Lq2/P;->s()V

    .line 33
    .line 34
    .line 35
    invoke-direct {p0, v1}, Lexpo/modules/video/player/VideoPlayer;->c3(Lexpo/modules/video/records/VideoSource;)V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, Lexpo/modules/video/player/VideoPlayer;->q:Lexpo/modules/video/records/VideoSource;

    .line 39
    .line 40
    const/4 v0, 0x1

    .line 41
    iput-boolean v0, p0, Lexpo/modules/video/player/VideoPlayer;->F:Z

    .line 42
    .line 43
    return-void

    .line 44
    :cond_1
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer;->k:Landroidx/media3/exoplayer/ExoPlayer;

    .line 45
    .line 46
    invoke-interface {v0}, Lq2/P;->G()V

    .line 47
    .line 48
    .line 49
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer;->k:Landroidx/media3/exoplayer/ExoPlayer;

    .line 50
    .line 51
    invoke-interface {v0}, Lq2/P;->s()V

    .line 52
    .line 53
    .line 54
    const/4 v0, 0x0

    .line 55
    iput-boolean v0, p0, Lexpo/modules/video/player/VideoPlayer;->F:Z

    .line 56
    .line 57
    return-void
.end method

.method public final V2(LHd/b;)V
    .locals 3

    .line 1
    const-string v0, "videoPlayerListener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer;->e:Ljava/util/List;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    iget-object v1, p0, Lexpo/modules/video/player/VideoPlayer;->e:Ljava/util/List;

    .line 10
    .line 11
    new-instance v2, LKd/c;

    .line 12
    .line 13
    invoke-direct {v2, p1}, LKd/c;-><init>(LHd/b;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v1, v2}, LUd/u;->K(Ljava/util/List;Lkotlin/jvm/functions/Function1;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    monitor-exit v0

    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception p1

    .line 22
    monitor-exit v0

    .line 23
    throw p1
.end method

.method public a()V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lexpo/modules/kotlin/sharedobjects/SharedObject;->l()LUb/d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, LUb/d;->x()LGf/O;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    new-instance v4, Lexpo/modules/video/player/VideoPlayer$d;

    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    invoke-direct {v4, p0, v0}, Lexpo/modules/video/player/VideoPlayer$d;-><init>(Lexpo/modules/video/player/VideoPlayer;LZd/e;)V

    .line 17
    .line 18
    .line 19
    const/4 v5, 0x3

    .line 20
    const/4 v6, 0x0

    .line 21
    const/4 v2, 0x0

    .line 22
    const/4 v3, 0x0

    .line 23
    invoke-static/range {v1 .. v6}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 24
    .line 25
    .line 26
    :cond_0
    return-void
.end method

.method public final a2(LHd/b;)V
    .locals 3

    .line 1
    const-string v0, "videoPlayerListener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer;->e:Ljava/util/List;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    :try_start_0
    iget-object v1, p0, Lexpo/modules/video/player/VideoPlayer;->e:Ljava/util/List;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception p1

    .line 21
    goto :goto_2

    .line 22
    :cond_0
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-eqz v2, :cond_2

    .line 31
    .line 32
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-static {v2, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    :goto_0
    iget-object v1, p0, Lexpo/modules/video/player/VideoPlayer;->e:Ljava/util/List;

    .line 50
    .line 51
    new-instance v2, Ljava/lang/ref/WeakReference;

    .line 52
    .line 53
    invoke-direct {v2, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    :goto_1
    sget-object p1, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 60
    .line 61
    monitor-exit v0

    .line 62
    return-void

    .line 63
    :goto_2
    monitor-exit v0

    .line 64
    throw p1
.end method

.method public final a3(Lexpo/modules/video/enums/AudioMixingMode;)V
    .locals 2

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer;->E:Lexpo/modules/video/enums/AudioMixingMode;

    .line 7
    .line 8
    iput-object p1, p0, Lexpo/modules/video/player/VideoPlayer;->E:Lexpo/modules/video/enums/AudioMixingMode;

    .line 9
    .line 10
    new-instance v1, Lexpo/modules/video/player/a$a;

    .line 11
    .line 12
    invoke-direct {v1, p1, v0}, Lexpo/modules/video/player/a$a;-><init>(Lexpo/modules/video/enums/AudioMixingMode;Lexpo/modules/video/enums/AudioMixingMode;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, v1}, Lexpo/modules/video/player/VideoPlayer;->Y2(Lexpo/modules/video/player/a;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final b3(Lexpo/modules/video/records/BufferOptions;)V
    .locals 1

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lexpo/modules/video/player/VideoPlayer;->D:Lexpo/modules/video/records/BufferOptions;

    .line 7
    .line 8
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer;->g:LKd/o;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, LKd/o;->r(Lexpo/modules/video/records/BufferOptions;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final c2(Lexpo/modules/video/VideoView;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer;->k:Landroidx/media3/exoplayer/ExoPlayer;

    .line 2
    .line 3
    invoke-virtual {p0}, Lexpo/modules/video/player/VideoPlayer;->q2()Lexpo/modules/video/VideoView;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v1}, Lexpo/modules/video/VideoView;->getPlayerView()Landroidx/media3/ui/PlayerView;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v1, v2

    .line 16
    :goto_0
    if-eqz p1, :cond_1

    .line 17
    .line 18
    invoke-virtual {p1}, Lexpo/modules/video/VideoView;->getPlayerView()Landroidx/media3/ui/PlayerView;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    :cond_1
    invoke-static {v0, v1, v2}, Landroidx/media3/ui/PlayerView;->U(Lq2/P;Landroidx/media3/ui/PlayerView;Landroidx/media3/ui/PlayerView;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, p1}, Lexpo/modules/video/player/VideoPlayer;->e3(Lexpo/modules/video/VideoView;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public close()V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Lexpo/modules/video/player/VideoPlayer;->f3(Z)V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer;->o:LFd/o;

    .line 6
    .line 7
    const-wide/16 v1, 0x0

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, LFd/o;->i(J)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Lexpo/modules/video/player/VideoPlayer;->e:Ljava/util/List;

    .line 13
    .line 14
    monitor-enter v1

    .line 15
    :try_start_0
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer;->e:Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 18
    .line 19
    .line 20
    sget-object v0, LTd/L;->a:LTd/L;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    monitor-exit v1

    .line 23
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer;->m:LJd/d;

    .line 24
    .line 25
    invoke-virtual {v0}, LJd/d;->c()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    invoke-virtual {p0}, Lexpo/modules/kotlin/sharedobjects/SharedObject;->l()LUb/d;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    invoke-virtual {v0}, LUb/d;->B()Landroid/content/Context;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    iget-object v1, p0, Lexpo/modules/video/player/VideoPlayer;->m:LJd/d;

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 46
    .line 47
    .line 48
    :cond_0
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer;->m:LJd/d;

    .line 49
    .line 50
    invoke-virtual {v0}, LJd/d;->b()LJd/c;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    if-eqz v0, :cond_1

    .line 55
    .line 56
    invoke-virtual {v0}, LJd/c;->a()Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    if-eqz v0, :cond_1

    .line 61
    .line 62
    iget-object v1, p0, Lexpo/modules/video/player/VideoPlayer;->k:Landroidx/media3/exoplayer/ExoPlayer;

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Lexpo/modules/video/playbackService/ExpoVideoPlaybackService;->N(Landroidx/media3/exoplayer/ExoPlayer;)V

    .line 65
    .line 66
    .line 67
    :cond_1
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer;->n:LE3/h3;

    .line 68
    .line 69
    invoke-virtual {v0}, LE3/h3;->q()V

    .line 70
    .line 71
    .line 72
    sget-object v0, LId/m;->a:LId/m;

    .line 73
    .line 74
    invoke-virtual {v0, p0}, LId/m;->z(Lexpo/modules/video/player/VideoPlayer;)V

    .line 75
    .line 76
    .line 77
    sget-object v1, LGf/v0;->a:LGf/v0;

    .line 78
    .line 79
    invoke-static {}, LGf/f0;->c()LGf/M0;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    new-instance v4, Lexpo/modules/video/player/VideoPlayer$c;

    .line 84
    .line 85
    const/4 v0, 0x0

    .line 86
    invoke-direct {v4, p0, v0}, Lexpo/modules/video/player/VideoPlayer$c;-><init>(Lexpo/modules/video/player/VideoPlayer;LZd/e;)V

    .line 87
    .line 88
    .line 89
    const/4 v5, 0x2

    .line 90
    const/4 v6, 0x0

    .line 91
    const/4 v3, 0x0

    .line 92
    invoke-static/range {v1 .. v6}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 93
    .line 94
    .line 95
    iput-object v0, p0, Lexpo/modules/video/player/VideoPlayer;->q:Lexpo/modules/video/records/VideoSource;

    .line 96
    .line 97
    invoke-direct {p0, v0}, Lexpo/modules/video/player/VideoPlayer;->c3(Lexpo/modules/video/records/VideoSource;)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :catchall_0
    move-exception v0

    .line 102
    monitor-exit v1

    .line 103
    throw v0
.end method

.method public final e3(Lexpo/modules/video/VideoView;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer;->f:LMd/e;

    .line 2
    .line 3
    sget-object v1, Lexpo/modules/video/player/VideoPlayer;->m0:[Lpe/m;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-virtual {v0, p0, v1, p1}, LMd/e;->d(Ljava/lang/Object;Lpe/m;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final f3(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer;->Y:LKd/m;

    .line 2
    .line 3
    sget-object v1, Lexpo/modules/video/player/VideoPlayer;->m0:[Lpe/m;

    .line 4
    .line 5
    const/4 v2, 0x6

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-virtual {v0, p0, v1, p1}, LKd/m;->l(Ljava/lang/Object;Lpe/m;Z)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final g3(LE3/h3;)V
    .locals 1

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lexpo/modules/video/player/VideoPlayer;->n:LE3/h3;

    .line 7
    .line 8
    return-void
.end method

.method public final h2()Lexpo/modules/video/enums/AudioMixingMode;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer;->E:Lexpo/modules/video/enums/AudioMixingMode;

    .line 2
    .line 3
    return-object v0
.end method

.method public final h3(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer;->B:LGd/b;

    .line 2
    .line 3
    sget-object v1, Lexpo/modules/video/player/VideoPlayer;->m0:[Lpe/m;

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {v0, p0, v1, p1}, LGd/b;->d(Ljava/lang/Object;Lpe/m;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final i2()LKd/l;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer;->i:LKd/l;

    .line 2
    .line 3
    return-object v0
.end method

.method public final i3(Lq2/O;)V
    .locals 3

    .line 1
    const-string v0, "<set-?>"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer;->C:LGd/b;

    .line 7
    .line 8
    sget-object v1, Lexpo/modules/video/player/VideoPlayer;->m0:[Lpe/m;

    .line 9
    .line 10
    const/4 v2, 0x5

    .line 11
    aget-object v1, v1, v2

    .line 12
    .line 13
    invoke-virtual {v0, p0, v1, p1}, LGd/b;->d(Ljava/lang/Object;Lpe/m;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final j2()Ljava/util/List;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer;->X:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final j3(Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer;->p:LGd/b;

    .line 2
    .line 3
    sget-object v1, Lexpo/modules/video/player/VideoPlayer;->m0:[Lpe/m;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {v0, p0, v1, p1}, LGd/b;->d(Ljava/lang/Object;Lpe/m;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final k2()Lexpo/modules/video/records/BufferOptions;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer;->D:Lexpo/modules/video/records/BufferOptions;

    .line 2
    .line 3
    return-object v0
.end method

.method public final k3(Z)V
    .locals 6

    .line 1
    iput-boolean p1, p0, Lexpo/modules/video/player/VideoPlayer;->w:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Lexpo/modules/kotlin/sharedobjects/SharedObject;->l()LUb/d;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, LUb/d;->x()LGf/O;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    new-instance v3, Lexpo/modules/video/player/VideoPlayer$h;

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    invoke-direct {v3, p0, p1}, Lexpo/modules/video/player/VideoPlayer$h;-><init>(Lexpo/modules/video/player/VideoPlayer;LZd/e;)V

    .line 19
    .line 20
    .line 21
    const/4 v4, 0x3

    .line 22
    const/4 v5, 0x0

    .line 23
    const/4 v1, 0x0

    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-static/range {v0 .. v5}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public final l2()D
    .locals 4

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer;->k:Landroidx/media3/exoplayer/ExoPlayer;

    .line 2
    .line 3
    invoke-interface {v0}, Lq2/P;->b()Lq2/C;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    .line 10
    .line 11
    return-wide v0

    .line 12
    :cond_0
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer;->k:Landroidx/media3/exoplayer/ExoPlayer;

    .line 13
    .line 14
    invoke-interface {v0}, Lq2/P;->p()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x2

    .line 19
    if-ne v0, v1, :cond_1

    .line 20
    .line 21
    const-wide/16 v0, 0x0

    .line 22
    .line 23
    return-wide v0

    .line 24
    :cond_1
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer;->k:Landroidx/media3/exoplayer/ExoPlayer;

    .line 25
    .line 26
    invoke-interface {v0}, Lq2/P;->I0()J

    .line 27
    .line 28
    .line 29
    move-result-wide v0

    .line 30
    long-to-double v0, v0

    .line 31
    const-wide v2, 0x408f400000000000L    # 1000.0

    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    div-double/2addr v0, v2

    .line 37
    return-wide v0
.end method

.method public final l3(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lexpo/modules/video/player/VideoPlayer;->u:Z

    .line 2
    .line 3
    return-void
.end method

.method public final m3(Lexpo/modules/video/records/ScrubbingModeOptions;)V
    .locals 6

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lexpo/modules/video/player/VideoPlayer;->I:Lexpo/modules/video/records/ScrubbingModeOptions;

    .line 7
    .line 8
    invoke-virtual {p0}, Lexpo/modules/kotlin/sharedobjects/SharedObject;->l()LUb/d;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1}, LUb/d;->x()LGf/O;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    new-instance v3, Lexpo/modules/video/player/VideoPlayer$i;

    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    invoke-direct {v3, p0, p1}, Lexpo/modules/video/player/VideoPlayer$i;-><init>(Lexpo/modules/video/player/VideoPlayer;LZd/e;)V

    .line 24
    .line 25
    .line 26
    const/4 v4, 0x3

    .line 27
    const/4 v5, 0x0

    .line 28
    const/4 v1, 0x0

    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-static/range {v0 .. v5}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void
.end method

.method public final n2()Ljava/lang/Long;
    .locals 4

    .line 1
    new-instance v0, Lq2/Y$d;

    .line 2
    .line 3
    invoke-direct {v0}, Lq2/Y$d;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lexpo/modules/video/player/VideoPlayer;->k:Landroidx/media3/exoplayer/ExoPlayer;

    .line 7
    .line 8
    invoke-interface {v1}, Lq2/P;->h0()Lq2/Y;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Lq2/Y;->u()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    iget-object v1, p0, Lexpo/modules/video/player/VideoPlayer;->k:Landroidx/media3/exoplayer/ExoPlayer;

    .line 19
    .line 20
    invoke-interface {v1}, Lq2/P;->h0()Lq2/Y;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iget-object v2, p0, Lexpo/modules/video/player/VideoPlayer;->k:Landroidx/media3/exoplayer/ExoPlayer;

    .line 25
    .line 26
    invoke-interface {v2}, Lq2/P;->K0()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    invoke-virtual {v1, v2, v0}, Lq2/Y;->r(ILq2/Y$d;)Lq2/Y$d;

    .line 31
    .line 32
    .line 33
    :cond_0
    iget-wide v0, v0, Lq2/Y$d;->f:J

    .line 34
    .line 35
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    cmp-long v2, v0, v2

    .line 41
    .line 42
    if-nez v2, :cond_1

    .line 43
    .line 44
    const/4 v0, 0x0

    .line 45
    return-object v0

    .line 46
    :cond_1
    iget-object v2, p0, Lexpo/modules/video/player/VideoPlayer;->k:Landroidx/media3/exoplayer/ExoPlayer;

    .line 47
    .line 48
    invoke-interface {v2}, Lq2/P;->getCurrentPosition()J

    .line 49
    .line 50
    .line 51
    move-result-wide v2

    .line 52
    add-long/2addr v0, v2

    .line 53
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    return-object v0
.end method

.method public final n3(Lexpo/modules/video/records/SeekTolerance;)V
    .locals 6

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lexpo/modules/video/player/VideoPlayer;->H:Lexpo/modules/video/records/SeekTolerance;

    .line 7
    .line 8
    invoke-virtual {p0}, Lexpo/modules/kotlin/sharedobjects/SharedObject;->l()LUb/d;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    invoke-virtual {p1}, LUb/d;->x()LGf/O;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    new-instance v3, Lexpo/modules/video/player/VideoPlayer$j;

    .line 21
    .line 22
    const/4 p1, 0x0

    .line 23
    invoke-direct {v3, p0, p1}, Lexpo/modules/video/player/VideoPlayer$j;-><init>(Lexpo/modules/video/player/VideoPlayer;LZd/e;)V

    .line 24
    .line 25
    .line 26
    const/4 v4, 0x3

    .line 27
    const/4 v5, 0x0

    .line 28
    const/4 v1, 0x0

    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-static/range {v0 .. v5}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void
.end method

.method public final o2()Ljava/lang/Float;
    .locals 4

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer;->k:Landroidx/media3/exoplayer/ExoPlayer;

    .line 2
    .line 3
    invoke-interface {v0}, Lq2/P;->n0()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    cmp-long v0, v0, v2

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    return-object v0

    .line 18
    :cond_0
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer;->k:Landroidx/media3/exoplayer/ExoPlayer;

    .line 19
    .line 20
    invoke-interface {v0}, Lq2/P;->n0()J

    .line 21
    .line 22
    .line 23
    move-result-wide v0

    .line 24
    long-to-float v0, v0

    .line 25
    const/high16 v1, 0x447a0000    # 1000.0f

    .line 26
    .line 27
    div-float/2addr v0, v1

    .line 28
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    return-object v0
.end method

.method public final o3(Z)V
    .locals 7

    .line 1
    iput-boolean p1, p0, Lexpo/modules/video/player/VideoPlayer;->x:Z

    .line 2
    .line 3
    invoke-virtual {p0}, Lexpo/modules/kotlin/sharedobjects/SharedObject;->l()LUb/d;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, LUb/d;->x()LGf/O;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    new-instance v4, Lexpo/modules/video/player/VideoPlayer$k;

    .line 16
    .line 17
    const/4 v0, 0x0

    .line 18
    invoke-direct {v4, p0, p1, v0}, Lexpo/modules/video/player/VideoPlayer$k;-><init>(Lexpo/modules/video/player/VideoPlayer;ZLZd/e;)V

    .line 19
    .line 20
    .line 21
    const/4 v5, 0x3

    .line 22
    const/4 v6, 0x0

    .line 23
    const/4 v2, 0x0

    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-static/range {v1 .. v6}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 26
    .line 27
    .line 28
    :cond_0
    return-void
.end method

.method public final p2()Lexpo/modules/video/records/VideoTrack;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer;->G:Lexpo/modules/video/records/VideoTrack;

    .line 2
    .line 3
    return-object v0
.end method

.method public final q2()Lexpo/modules/video/VideoView;
    .locals 3

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer;->f:LMd/e;

    .line 2
    .line 3
    sget-object v1, Lexpo/modules/video/player/VideoPlayer;->m0:[Lpe/m;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-virtual {v0, p0, v1}, LMd/e;->b(Ljava/lang/Object;Lpe/m;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lexpo/modules/video/VideoView;

    .line 13
    .line 14
    return-object v0
.end method

.method public final q3(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lexpo/modules/video/player/VideoPlayer;->v:Z

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lexpo/modules/video/player/VideoPlayer;->u3()Z

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final r2()F
    .locals 1

    .line 1
    iget v0, p0, Lexpo/modules/video/player/VideoPlayer;->y:F

    .line 2
    .line 3
    return v0
.end method

.method public final r3(Lexpo/modules/video/records/VideoSource;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/video/player/VideoPlayer;->q:Lexpo/modules/video/records/VideoSource;

    .line 2
    .line 3
    return-void
.end method

.method public final s2()LKd/b;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer;->l:LKd/b;

    .line 2
    .line 3
    return-object v0
.end method

.method public final s3(F)V
    .locals 0

    .line 1
    iput p1, p0, Lexpo/modules/video/player/VideoPlayer;->s:F

    .line 2
    .line 3
    return-void
.end method

.method public final t2()LFd/o;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer;->o:LFd/o;

    .line 2
    .line 3
    return-object v0
.end method

.method public final t3(F)V
    .locals 3

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer;->A:LGd/b;

    .line 2
    .line 3
    sget-object v1, Lexpo/modules/video/player/VideoPlayer;->m0:[Lpe/m;

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    invoke-virtual {v0, p0, v1, p1}, LGd/b;->d(Ljava/lang/Object;Lpe/m;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final u2()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer;->Y:LKd/m;

    .line 2
    .line 3
    sget-object v1, Lexpo/modules/video/player/VideoPlayer;->m0:[Lpe/m;

    .line 4
    .line 5
    const/4 v2, 0x6

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-virtual {v0, p0, v1}, LKd/m;->j(Ljava/lang/Object;Lpe/m;)Ljava/lang/Boolean;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    return v0
.end method

.method public final v2()LE3/h3;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer;->n:LE3/h3;

    .line 2
    .line 3
    return-object v0
.end method

.method public final v3()Landroid/media/MediaMetadataRetriever;
    .locals 9

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer;->q:Lexpo/modules/video/records/VideoSource;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-direct {p0}, Lexpo/modules/video/player/VideoPlayer;->m2()Lexpo/modules/video/records/VideoSource;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    if-eqz v0, :cond_5

    .line 10
    .line 11
    invoke-virtual {v0}, Lexpo/modules/video/records/VideoSource;->getUri()Landroid/net/Uri;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz v1, :cond_5

    .line 16
    .line 17
    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    const-string v3, "toString(...)"

    .line 22
    .line 23
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    new-instance v8, Landroid/media/MediaMetadataRetriever;

    .line 27
    .line 28
    invoke-direct {v8}, Landroid/media/MediaMetadataRetriever;-><init>()V

    .line 29
    .line 30
    .line 31
    invoke-static {v2}, Landroid/webkit/URLUtil;->isFileUrl(Ljava/lang/String;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    const/4 v6, 0x4

    .line 38
    const/4 v7, 0x0

    .line 39
    const-string v3, "file://"

    .line 40
    .line 41
    const-string v4, ""

    .line 42
    .line 43
    const/4 v5, 0x0

    .line 44
    invoke-static/range {v2 .. v7}, LDf/r;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v8, v0}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    return-object v8

    .line 52
    :cond_1
    invoke-static {v2}, Landroid/webkit/URLUtil;->isContentUrl(Ljava/lang/String;)Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-eqz v3, :cond_3

    .line 57
    .line 58
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer;->c:Landroid/content/Context;

    .line 59
    .line 60
    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    const-string v2, "r"

    .line 65
    .line 66
    invoke-virtual {v0, v1, v2}, Landroid/content/ContentResolver;->openFileDescriptor(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    if-eqz v1, :cond_2

    .line 71
    .line 72
    :try_start_0
    new-instance v2, Ljava/io/FileInputStream;

    .line 73
    .line 74
    invoke-virtual {v1}, Landroid/os/ParcelFileDescriptor;->getFileDescriptor()Ljava/io/FileDescriptor;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-direct {v2, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/FileDescriptor;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    .line 80
    .line 81
    :try_start_1
    invoke-virtual {v2}, Ljava/io/FileInputStream;->getFD()Ljava/io/FileDescriptor;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {v8, v0}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/io/FileDescriptor;)V

    .line 86
    .line 87
    .line 88
    sget-object v0, LTd/L;->a:LTd/L;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 89
    .line 90
    const/4 v0, 0x0

    .line 91
    :try_start_2
    invoke-static {v2, v0}, Lfe/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 92
    .line 93
    .line 94
    invoke-static {v1, v0}, Lfe/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 95
    .line 96
    .line 97
    return-object v8

    .line 98
    :catchall_0
    move-exception v0

    .line 99
    move-object v2, v0

    .line 100
    goto :goto_0

    .line 101
    :catchall_1
    move-exception v0

    .line 102
    move-object v3, v0

    .line 103
    :try_start_3
    throw v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 104
    :catchall_2
    move-exception v0

    .line 105
    :try_start_4
    invoke-static {v2, v3}, Lfe/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 106
    .line 107
    .line 108
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 109
    :goto_0
    :try_start_5
    throw v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 110
    :catchall_3
    move-exception v0

    .line 111
    invoke-static {v1, v2}, Lfe/c;->a(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 112
    .line 113
    .line 114
    throw v0

    .line 115
    :cond_2
    return-object v8

    .line 116
    :cond_3
    invoke-virtual {v0}, Lexpo/modules/video/records/VideoSource;->getHeaders()Ljava/util/Map;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    if-nez v0, :cond_4

    .line 121
    .line 122
    invoke-static {}, LUd/S;->i()Ljava/util/Map;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    :cond_4
    invoke-virtual {v8, v2, v0}, Landroid/media/MediaMetadataRetriever;->setDataSource(Ljava/lang/String;Ljava/util/Map;)V

    .line 127
    .line 128
    .line 129
    return-object v8

    .line 130
    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 131
    .line 132
    const-string v1, "Video source is not set"

    .line 133
    .line 134
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    throw v0
.end method

.method public final w2()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer;->B:LGd/b;

    .line 2
    .line 3
    sget-object v1, Lexpo/modules/video/player/VideoPlayer;->m0:[Lpe/m;

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-virtual {v0, p0, v1}, LGd/b;->c(Ljava/lang/Object;Lpe/m;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0
.end method

.method public final x2()Lq2/O;
    .locals 3

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer;->C:LGd/b;

    .line 2
    .line 3
    sget-object v1, Lexpo/modules/video/player/VideoPlayer;->m0:[Lpe/m;

    .line 4
    .line 5
    const/4 v2, 0x5

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-virtual {v0, p0, v1}, LGd/b;->c(Ljava/lang/Object;Lpe/m;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lq2/O;

    .line 13
    .line 14
    return-object v0
.end method

.method public final y2()Landroidx/media3/exoplayer/ExoPlayer;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer;->k:Landroidx/media3/exoplayer/ExoPlayer;

    .line 2
    .line 3
    return-object v0
.end method

.method public final z2()Z
    .locals 3

    .line 1
    iget-object v0, p0, Lexpo/modules/video/player/VideoPlayer;->p:LGd/b;

    .line 2
    .line 3
    sget-object v1, Lexpo/modules/video/player/VideoPlayer;->m0:[Lpe/m;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    aget-object v1, v1, v2

    .line 7
    .line 8
    invoke-virtual {v0, p0, v1}, LGd/b;->c(Ljava/lang/Object;Lpe/m;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Ljava/lang/Boolean;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    return v0
.end method
