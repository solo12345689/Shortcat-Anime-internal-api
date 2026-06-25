.class public final Lcom/revenuecat/purchases/Purchases;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/revenuecat/purchases/LifecycleDelegate;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/revenuecat/purchases/Purchases$Companion;,
        Lcom/revenuecat/purchases/Purchases$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00e8\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0006\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0008>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u0000 \u0090\u00022\u00020\u0001:\u0002\u0090\u0002B\u0011\u0008\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0017\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\t\u001a\u00020\u0006H\u0017\u00a2\u0006\u0004\u0008\t\u0010\u0008J\u0015\u0010\u000c\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u000eH\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001b\u0010\u0013\u001a\u00020\u00062\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J;\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00152\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u00152\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0007\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ;\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00152\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u00152\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0007\u00a2\u0006\u0004\u0008\u001e\u0010\u001dJA\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00152\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u00152\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010 \u001a\u00020\u001f\u00a2\u0006\u0004\u0008\u001e\u0010!J\u0015\u0010#\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\"\u00a2\u0006\u0004\u0008#\u0010$J\u0015\u0010&\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020%\u00a2\u0006\u0004\u0008&\u0010\'J#\u0010+\u001a\u00020\u00062\u000c\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u00150(2\u0006\u0010\u000b\u001a\u00020*\u00a2\u0006\u0004\u0008+\u0010,J/\u0010+\u001a\u00020\u00062\u000c\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u00150(2\n\u0008\u0002\u0010.\u001a\u0004\u0018\u00010-2\u0006\u0010\u000b\u001a\u00020*\u00a2\u0006\u0004\u0008+\u0010/J\u001d\u00103\u001a\u00020\u00062\u0006\u00101\u001a\u0002002\u0006\u0010\u000b\u001a\u000202\u00a2\u0006\u0004\u00083\u00104J\'\u00109\u001a\u00020\u00062\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u0002072\u0006\u0010\u000b\u001a\u000202H\u0007\u00a2\u0006\u0004\u00089\u0010:J\'\u0010=\u001a\u00020\u00062\u0006\u00106\u001a\u0002052\u0006\u0010<\u001a\u00020;2\u0006\u0010\u0012\u001a\u000202H\u0007\u00a2\u0006\u0004\u0008=\u0010>J\u0015\u0010@\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020?\u00a2\u0006\u0004\u0008@\u0010AJ#\u0010D\u001a\u00020\u00062\u0006\u0010B\u001a\u00020\u00152\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010CH\u0007\u00a2\u0006\u0004\u0008D\u0010EJ\u001b\u0010F\u001a\u00020\u00062\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010?H\u0007\u00a2\u0006\u0004\u0008F\u0010AJ\r\u0010G\u001a\u00020\u0006\u00a2\u0006\u0004\u0008G\u0010\u0008J\u0015\u0010H\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020?\u00a2\u0006\u0004\u0008H\u0010AJ\u001d\u0010H\u001a\u00020\u00062\u0006\u0010J\u001a\u00020I2\u0006\u0010\u000b\u001a\u00020?\u00a2\u0006\u0004\u0008H\u0010KJ\u0015\u0010M\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020L\u00a2\u0006\u0004\u0008M\u0010NJ\r\u0010O\u001a\u00020\u0006\u00a2\u0006\u0004\u0008O\u0010\u0008J\r\u0010P\u001a\u00020\u0006\u00a2\u0006\u0004\u0008P\u0010\u0008J\'\u0010S\u001a\u00020\u00062\u0006\u00106\u001a\u0002052\u000e\u0008\u0002\u0010R\u001a\u0008\u0012\u0004\u0012\u00020Q0(H\u0007\u00a2\u0006\u0004\u0008S\u0010TJ\r\u0010U\u001a\u00020\u0006\u00a2\u0006\u0004\u0008U\u0010\u0008J\u0017\u0010X\u001a\u00020\u00062\u0006\u0010W\u001a\u00020VH\u0007\u00a2\u0006\u0004\u0008X\u0010YJ\u0019\u0010\\\u001a\u00020\u00062\u0008\u0008\u0002\u0010[\u001a\u00020ZH\u0007\u00a2\u0006\u0004\u0008\\\u0010]J\u0017\u0010a\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020^H\u0000\u00a2\u0006\u0004\u0008_\u0010`JG\u0010i\u001a\u00020\u00062\u0006\u0010b\u001a\u00020\u00152\u0006\u0010c\u001a\u00020\u00152\u0012\u0010f\u001a\u000e\u0012\u0004\u0012\u00020e\u0012\u0004\u0012\u00020\u00060d2\u0012\u0010h\u001a\u000e\u0012\u0004\u0012\u00020g\u0012\u0004\u0012\u00020\u00060dH\u0007\u00a2\u0006\u0004\u0008i\u0010jJ#\u0010m\u001a\u00020\u00062\u0014\u0010l\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00150k\u00a2\u0006\u0004\u0008m\u0010nJ\u0017\u0010o\u001a\u00020\u00062\u0008\u0010b\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0004\u0008o\u0010pJ\u0017\u0010r\u001a\u00020\u00062\u0008\u0010q\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0004\u0008r\u0010pJ\u0017\u0010t\u001a\u00020\u00062\u0008\u0010s\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0004\u0008t\u0010pJ\u0017\u0010v\u001a\u00020\u00062\u0008\u0010u\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0004\u0008v\u0010pJ\u0017\u0010x\u001a\u00020\u00062\u0008\u0010w\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0004\u0008x\u0010pJ\u0017\u0010z\u001a\u00020\u00062\u0008\u0010y\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0004\u0008z\u0010pJ\u0017\u0010|\u001a\u00020\u00062\u0008\u0010{\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0004\u0008|\u0010pJ\u0017\u0010~\u001a\u00020\u00062\u0008\u0010}\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0004\u0008~\u0010pJ\u0019\u0010\u0080\u0001\u001a\u00020\u00062\u0008\u0010\u007f\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0005\u0008\u0080\u0001\u0010pJ\u001a\u0010\u0082\u0001\u001a\u00020\u00062\t\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0005\u0008\u0082\u0001\u0010pJ\u001a\u0010\u0084\u0001\u001a\u00020\u00062\t\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0005\u0008\u0084\u0001\u0010pJ\u000f\u0010\u0085\u0001\u001a\u00020\u0006\u00a2\u0006\u0005\u0008\u0085\u0001\u0010\u0008J\u001a\u0010\u0087\u0001\u001a\u00020\u00062\t\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0005\u0008\u0087\u0001\u0010pJ\u001a\u0010\u0089\u0001\u001a\u00020\u00062\t\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0005\u0008\u0089\u0001\u0010pJ\u001a\u0010\u008b\u0001\u001a\u00020\u00062\t\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0005\u0008\u008b\u0001\u0010pJ\u001a\u0010\u008d\u0001\u001a\u00020\u00062\t\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0005\u0008\u008d\u0001\u0010pJ\u001a\u0010\u008f\u0001\u001a\u00020\u00062\t\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0005\u0008\u008f\u0001\u0010pJ\u001a\u0010\u0091\u0001\u001a\u00020\u00062\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0005\u0008\u0091\u0001\u0010pJ\u001a\u0010\u0093\u0001\u001a\u00020\u00062\t\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0005\u0008\u0093\u0001\u0010pJ\u001a\u0010\u0095\u0001\u001a\u00020\u00062\t\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0005\u0008\u0095\u0001\u0010pJ\u001a\u0010\u0097\u0001\u001a\u00020\u00062\t\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0005\u0008\u0097\u0001\u0010pJ\u001a\u0010\u0099\u0001\u001a\u00020\u00062\t\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0005\u0008\u0099\u0001\u0010pJ\"\u0010\u009b\u0001\u001a\u00020\u00062\u0011\u0010\u009a\u0001\u001a\u000c\u0012\u0002\u0008\u0003\u0012\u0002\u0008\u0003\u0018\u00010k\u00a2\u0006\u0005\u0008\u009b\u0001\u0010nJ-\u0010\u009c\u0001\u001a\u00020\u00062\u0013\u0010\u009a\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150k2\u0006\u0010\u000b\u001a\u00020\"\u00a2\u0006\u0006\u0008\u009c\u0001\u0010\u009d\u0001J\u001a\u0010\u009f\u0001\u001a\u00020\u00062\t\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0005\u0008\u009f\u0001\u0010pJ\u001a\u0010\u00a1\u0001\u001a\u00020\u00062\t\u0010\u00a0\u0001\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0005\u0008\u00a1\u0001\u0010pJ\u001a\u0010\u00a3\u0001\u001a\u00020\u00062\t\u0010\u00a2\u0001\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0005\u0008\u00a3\u0001\u0010pJ\u001a\u0010\u00a5\u0001\u001a\u00020\u00062\t\u0010\u00a4\u0001\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0005\u0008\u00a5\u0001\u0010pJ\u001a\u0010\u00a7\u0001\u001a\u00020\u00062\t\u0010\u00a6\u0001\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0005\u0008\u00a7\u0001\u0010pJ\u001a\u0010\u00a9\u0001\u001a\u00020\u00062\t\u0010\u00a8\u0001\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0005\u0008\u00a9\u0001\u0010pJ\u001f\u0010\u00ad\u0001\u001a\u0005\u0018\u00010\u00ac\u00012\u0008\u0010\u00ab\u0001\u001a\u00030\u00aa\u0001H\u0007\u00a2\u0006\u0006\u0008\u00ad\u0001\u0010\u00ae\u0001J\u001b\u0010\u00b0\u0001\u001a\u00020e2\t\u0010\u00af\u0001\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0006\u0008\u00b0\u0001\u0010\u00b1\u0001J\'\u0010\u00b2\u0001\u001a\u00020\u00062\u000c\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u00150(2\u0006\u0010\u000b\u001a\u00020*H\u0007\u00a2\u0006\u0005\u0008\u00b2\u0001\u0010,J\'\u0010\u00b3\u0001\u001a\u00020\u00062\u000c\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u00150(2\u0006\u0010\u000b\u001a\u00020*H\u0007\u00a2\u0006\u0005\u0008\u00b3\u0001\u0010,J\u0019\u0010\u00b5\u0001\u001a\u00020\u00062\u0007\u0010\u000b\u001a\u00030\u00b4\u0001\u00a2\u0006\u0006\u0008\u00b5\u0001\u0010\u00b6\u0001J#\u0010\u00ba\u0001\u001a\u00020\u00062\u0008\u0010\u00b8\u0001\u001a\u00030\u00b7\u00012\u0007\u0010\u0012\u001a\u00030\u00b9\u0001\u00a2\u0006\u0006\u0008\u00ba\u0001\u0010\u00bb\u0001R\u001d\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004\u00a2\u0006\u000f\n\u0005\u0008\u0003\u0010\u00bc\u0001\u001a\u0006\u0008\u00bd\u0001\u0010\u00be\u0001R1\u0010\u00c5\u0001\u001a\u00020e2\u0007\u0010\u00bf\u0001\u001a\u00020e8F@FX\u0087\u000e\u00a2\u0006\u0017\u0012\u0005\u0008\u00c4\u0001\u0010\u0008\u001a\u0006\u0008\u00c0\u0001\u0010\u00c1\u0001\"\u0006\u0008\u00c2\u0001\u0010\u00c3\u0001R \u0010\u00c9\u0001\u001a\u0005\u0018\u00010\u00c6\u00018FX\u0087\u0004\u00a2\u0006\u000e\u0012\u0005\u0008\u00c8\u0001\u0010\u0008\u001a\u0005\u0008\u000f\u0010\u00c7\u0001R@\u0010\u00d3\u0001\u001a\u0005\u0018\u00010\u00ca\u00012\n\u0010\u00cb\u0001\u001a\u0005\u0018\u00010\u00ca\u00018F@FX\u0087\u008e\u0002\u00a2\u0006\u001f\u0012\u0005\u0008\u00d0\u0001\u0010\u0008\u001a\u0006\u0008\u00cc\u0001\u0010\u00cd\u0001\"\u0006\u0008\u00ce\u0001\u0010\u00cf\u0001*\u0006\u0008\u00d1\u0001\u0010\u00d2\u0001R@\u0010\u00db\u0001\u001a\u0005\u0018\u00010\u00d4\u00012\n\u0010\u00cb\u0001\u001a\u0005\u0018\u00010\u00d4\u00018F@FX\u0087\u008e\u0002\u00a2\u0006\u001f\u0012\u0005\u0008\u00d9\u0001\u0010\u0008\u001a\u0006\u0008\u00d5\u0001\u0010\u00d6\u0001\"\u0006\u0008\u00d7\u0001\u0010\u00d8\u0001*\u0006\u0008\u00da\u0001\u0010\u00d2\u0001R\u001f\u0010\u00e0\u0001\u001a\u00030\u00dc\u00018FX\u0087\u0004\u00a2\u0006\u000f\u0012\u0005\u0008\u00df\u0001\u0010\u0008\u001a\u0006\u0008\u00dd\u0001\u0010\u00de\u0001R\u001f\u0010\u00e5\u0001\u001a\u00030\u00e1\u00018FX\u0087\u0004\u00a2\u0006\u000f\u0012\u0005\u0008\u00e4\u0001\u0010\u0008\u001a\u0006\u0008\u00e2\u0001\u0010\u00e3\u0001R1\u0010\u00e9\u0001\u001a\u00020e2\u0007\u0010\u00bf\u0001\u001a\u00020e8F@FX\u0087\u000e\u00a2\u0006\u0017\u0012\u0005\u0008\u00e8\u0001\u0010\u0008\u001a\u0006\u0008\u00e6\u0001\u0010\u00c1\u0001\"\u0006\u0008\u00e7\u0001\u0010\u00c3\u0001R\u0015\u0010\u00ed\u0001\u001a\u00030\u00ea\u00018F\u00a2\u0006\u0008\u001a\u0006\u0008\u00eb\u0001\u0010\u00ec\u0001R,\u0010\u00f3\u0001\u001a\u00030\u00ee\u00012\u0008\u0010\u00bf\u0001\u001a\u00030\u00ee\u00018F@FX\u0086\u000e\u00a2\u0006\u0010\u001a\u0006\u0008\u00ef\u0001\u0010\u00f0\u0001\"\u0006\u0008\u00f1\u0001\u0010\u00f2\u0001R\u0014\u0010\u00f6\u0001\u001a\u00020\u00158F\u00a2\u0006\u0008\u001a\u0006\u0008\u00f4\u0001\u0010\u00f5\u0001R\u0015\u0010\u00f7\u0001\u001a\u0004\u0018\u00010\u00158F\u00a2\u0006\u0007\u001a\u0005\u0008\u000c\u0010\u00f5\u0001R0\u0010\u00fd\u0001\u001a\u0005\u0018\u00010\u00f8\u00012\n\u0010\u00bf\u0001\u001a\u0005\u0018\u00010\u00f8\u00018F@FX\u0086\u000e\u00a2\u0006\u0010\u001a\u0006\u0008\u00f9\u0001\u0010\u00fa\u0001\"\u0006\u0008\u00fb\u0001\u0010\u00fc\u0001R9\u0010\u0084\u0002\u001a\u0005\u0018\u00010\u00fe\u00012\n\u0010\u00cb\u0001\u001a\u0005\u0018\u00010\u00fe\u00018F@FX\u0086\u008e\u0002\u00a2\u0006\u0018\u001a\u0006\u0008\u00ff\u0001\u0010\u0080\u0002\"\u0006\u0008\u0081\u0002\u0010\u0082\u0002*\u0006\u0008\u0083\u0002\u0010\u00d2\u0001R\u0014\u0010\u0085\u0002\u001a\u00020e8F\u00a2\u0006\u0008\u001a\u0006\u0008\u0085\u0002\u0010\u00c1\u0001R\u0015\u0010\u0089\u0002\u001a\u00030\u0086\u00028F\u00a2\u0006\u0008\u001a\u0006\u0008\u0087\u0002\u0010\u0088\u0002R\u0017\u0010\u008d\u0002\u001a\u0005\u0018\u00010\u008a\u00028F\u00a2\u0006\u0008\u001a\u0006\u0008\u008b\u0002\u0010\u008c\u0002R\u0016\u0010\u008f\u0002\u001a\u0004\u0018\u00010\u00158F\u00a2\u0006\u0008\u001a\u0006\u0008\u008e\u0002\u0010\u00f5\u0001\u00a8\u0006\u0091\u0002"
    }
    d2 = {
        "Lcom/revenuecat/purchases/Purchases;",
        "Lcom/revenuecat/purchases/LifecycleDelegate;",
        "Lcom/revenuecat/purchases/PurchasesOrchestrator;",
        "purchasesOrchestrator",
        "<init>",
        "(Lcom/revenuecat/purchases/PurchasesOrchestrator;)V",
        "LTd/L;",
        "onAppBackgrounded",
        "()V",
        "onAppForegrounded",
        "Lcom/revenuecat/purchases/interfaces/GetStorefrontCallback;",
        "callback",
        "getStorefrontCountryCode",
        "(Lcom/revenuecat/purchases/interfaces/GetStorefrontCallback;)V",
        "Lcom/revenuecat/purchases/interfaces/GetStorefrontLocaleCallback;",
        "getStorefrontLocale",
        "(Lcom/revenuecat/purchases/interfaces/GetStorefrontLocaleCallback;)V",
        "Lcom/revenuecat/purchases/interfaces/SyncPurchasesCallback;",
        "listener",
        "syncPurchases",
        "(Lcom/revenuecat/purchases/interfaces/SyncPurchasesCallback;)V",
        "",
        "productID",
        "receiptID",
        "amazonUserID",
        "isoCurrencyCode",
        "",
        "price",
        "syncObserverModeAmazonPurchase",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V",
        "syncAmazonPurchase",
        "",
        "purchaseTime",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;J)V",
        "Lcom/revenuecat/purchases/interfaces/SyncAttributesAndOfferingsCallback;",
        "syncAttributesAndOfferingsIfNeeded",
        "(Lcom/revenuecat/purchases/interfaces/SyncAttributesAndOfferingsCallback;)V",
        "Lcom/revenuecat/purchases/interfaces/ReceiveOfferingsCallback;",
        "getOfferings",
        "(Lcom/revenuecat/purchases/interfaces/ReceiveOfferingsCallback;)V",
        "",
        "productIds",
        "Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;",
        "getProducts",
        "(Ljava/util/List;Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;)V",
        "Lcom/revenuecat/purchases/ProductType;",
        "type",
        "(Ljava/util/List;Lcom/revenuecat/purchases/ProductType;Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;)V",
        "Lcom/revenuecat/purchases/PurchaseParams;",
        "purchaseParams",
        "Lcom/revenuecat/purchases/interfaces/PurchaseCallback;",
        "purchase",
        "(Lcom/revenuecat/purchases/PurchaseParams;Lcom/revenuecat/purchases/interfaces/PurchaseCallback;)V",
        "Landroid/app/Activity;",
        "activity",
        "Lcom/revenuecat/purchases/models/StoreProduct;",
        "storeProduct",
        "purchaseProduct",
        "(Landroid/app/Activity;Lcom/revenuecat/purchases/models/StoreProduct;Lcom/revenuecat/purchases/interfaces/PurchaseCallback;)V",
        "Lcom/revenuecat/purchases/Package;",
        "packageToPurchase",
        "purchasePackage",
        "(Landroid/app/Activity;Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/interfaces/PurchaseCallback;)V",
        "Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;",
        "restorePurchases",
        "(Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;)V",
        "newAppUserID",
        "Lcom/revenuecat/purchases/interfaces/LogInCallback;",
        "logIn",
        "(Ljava/lang/String;Lcom/revenuecat/purchases/interfaces/LogInCallback;)V",
        "logOut",
        "close",
        "getCustomerInfo",
        "Lcom/revenuecat/purchases/CacheFetchPolicy;",
        "fetchPolicy",
        "(Lcom/revenuecat/purchases/CacheFetchPolicy;Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;)V",
        "Lcom/revenuecat/purchases/interfaces/GetVirtualCurrenciesCallback;",
        "getVirtualCurrencies",
        "(Lcom/revenuecat/purchases/interfaces/GetVirtualCurrenciesCallback;)V",
        "invalidateVirtualCurrenciesCache",
        "removeUpdatedCustomerInfoListener",
        "Lcom/revenuecat/purchases/models/InAppMessageType;",
        "inAppMessageTypes",
        "showInAppMessagesIfNeeded",
        "(Landroid/app/Activity;Ljava/util/List;)V",
        "invalidateCustomerInfoCache",
        "Lcom/revenuecat/purchases/common/events/FeatureEvent;",
        "event",
        "track",
        "(Lcom/revenuecat/purchases/common/events/FeatureEvent;)V",
        "Lcom/revenuecat/purchases/paywalls/events/CustomPaywallImpressionParams;",
        "params",
        "trackCustomPaywallImpression",
        "(Lcom/revenuecat/purchases/paywalls/events/CustomPaywallImpressionParams;)V",
        "Lcom/revenuecat/purchases/interfaces/GetCustomerCenterConfigCallback;",
        "getCustomerCenterConfigData$purchases_defaultsBc8Release",
        "(Lcom/revenuecat/purchases/interfaces/GetCustomerCenterConfigCallback;)V",
        "getCustomerCenterConfigData",
        "email",
        "description",
        "Lkotlin/Function1;",
        "",
        "onSuccess",
        "Lcom/revenuecat/purchases/PurchasesError;",
        "onError",
        "createSupportTicket",
        "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V",
        "",
        "attributes",
        "setAttributes",
        "(Ljava/util/Map;)V",
        "setEmail",
        "(Ljava/lang/String;)V",
        "phoneNumber",
        "setPhoneNumber",
        "displayName",
        "setDisplayName",
        "fcmToken",
        "setPushToken",
        "mixpanelDistinctID",
        "setMixpanelDistinctID",
        "onesignalID",
        "setOnesignalID",
        "onesignalUserID",
        "setOnesignalUserID",
        "airshipChannelID",
        "setAirshipChannelID",
        "firebaseAppInstanceID",
        "setFirebaseAppInstanceID",
        "tenjinAnalyticsInstallationID",
        "setTenjinAnalyticsInstallationID",
        "postHogUserId",
        "setPostHogUserId",
        "collectDeviceIdentifiers",
        "adjustID",
        "setAdjustID",
        "appsflyerID",
        "setAppsflyerID",
        "fbAnonymousID",
        "setFBAnonymousID",
        "mparticleID",
        "setMparticleID",
        "cleverTapID",
        "setCleverTapID",
        "kochavaDeviceID",
        "setKochavaDeviceID",
        "airbridgeDeviceID",
        "setAirbridgeDeviceID",
        "solarEngineDistinctId",
        "setSolarEngineDistinctId",
        "solarEngineAccountId",
        "setSolarEngineAccountId",
        "solarEngineVisitorId",
        "setSolarEngineVisitorId",
        "data",
        "setAppsFlyerConversionData",
        "setAppstackAttributionParams",
        "(Ljava/util/Map;Lcom/revenuecat/purchases/interfaces/SyncAttributesAndOfferingsCallback;)V",
        "mediaSource",
        "setMediaSource",
        "campaign",
        "setCampaign",
        "adGroup",
        "setAdGroup",
        "ad",
        "setAd",
        "keyword",
        "setKeyword",
        "creative",
        "setCreative",
        "Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$Name;",
        "fontInfo",
        "Lcom/revenuecat/purchases/paywalls/DownloadedFontFamily;",
        "getCachedFontFamilyOrStartDownload",
        "(Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$Name;)Lcom/revenuecat/purchases/paywalls/DownloadedFontFamily;",
        "localeString",
        "overridePreferredUILocale",
        "(Ljava/lang/String;)Z",
        "getSubscriptionSkus",
        "getNonSubscriptionSkus",
        "Lcom/revenuecat/purchases/interfaces/GetAmazonLWAConsentStatusCallback;",
        "getAmazonLWAConsentStatus",
        "(Lcom/revenuecat/purchases/interfaces/GetAmazonLWAConsentStatusCallback;)V",
        "Lcom/revenuecat/purchases/WebPurchaseRedemption;",
        "webPurchaseRedemption",
        "Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener;",
        "redeemWebPurchase",
        "(Lcom/revenuecat/purchases/WebPurchaseRedemption;Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener;)V",
        "Lcom/revenuecat/purchases/PurchasesOrchestrator;",
        "getPurchasesOrchestrator$purchases_defaultsBc8Release",
        "()Lcom/revenuecat/purchases/PurchasesOrchestrator;",
        "value",
        "getFinishTransactions",
        "()Z",
        "setFinishTransactions",
        "(Z)V",
        "getFinishTransactions$annotations",
        "finishTransactions",
        "Ljava/util/Locale;",
        "()Ljava/util/Locale;",
        "getStorefrontLocale$annotations",
        "storefrontLocale",
        "Lcom/revenuecat/purchases/TrackedEventListener;",
        "<set-?>",
        "getTrackedEventListener",
        "()Lcom/revenuecat/purchases/TrackedEventListener;",
        "setTrackedEventListener",
        "(Lcom/revenuecat/purchases/TrackedEventListener;)V",
        "getTrackedEventListener$annotations",
        "getTrackedEventListener$delegate",
        "(Lcom/revenuecat/purchases/Purchases;)Ljava/lang/Object;",
        "trackedEventListener",
        "Lcom/revenuecat/purchases/DebugEventListener;",
        "getDebugEventListener",
        "()Lcom/revenuecat/purchases/DebugEventListener;",
        "setDebugEventListener",
        "(Lcom/revenuecat/purchases/DebugEventListener;)V",
        "getDebugEventListener$annotations",
        "getDebugEventListener$delegate",
        "debugEventListener",
        "Lcom/revenuecat/purchases/storage/FileRepository;",
        "getFileRepository",
        "()Lcom/revenuecat/purchases/storage/FileRepository;",
        "getFileRepository$annotations",
        "fileRepository",
        "Lcom/revenuecat/purchases/ads/events/AdTracker;",
        "getAdTracker",
        "()Lcom/revenuecat/purchases/ads/events/AdTracker;",
        "getAdTracker$annotations",
        "adTracker",
        "getAllowSharingPlayStoreAccount",
        "setAllowSharingPlayStoreAccount",
        "getAllowSharingPlayStoreAccount$annotations",
        "allowSharingPlayStoreAccount",
        "Lcom/revenuecat/purchases/PurchasesConfiguration;",
        "getCurrentConfiguration",
        "()Lcom/revenuecat/purchases/PurchasesConfiguration;",
        "currentConfiguration",
        "Lcom/revenuecat/purchases/PurchasesAreCompletedBy;",
        "getPurchasesAreCompletedBy",
        "()Lcom/revenuecat/purchases/PurchasesAreCompletedBy;",
        "setPurchasesAreCompletedBy",
        "(Lcom/revenuecat/purchases/PurchasesAreCompletedBy;)V",
        "purchasesAreCompletedBy",
        "getAppUserID",
        "()Ljava/lang/String;",
        "appUserID",
        "storefrontCountryCode",
        "Lcom/revenuecat/purchases/interfaces/UpdatedCustomerInfoListener;",
        "getUpdatedCustomerInfoListener",
        "()Lcom/revenuecat/purchases/interfaces/UpdatedCustomerInfoListener;",
        "setUpdatedCustomerInfoListener",
        "(Lcom/revenuecat/purchases/interfaces/UpdatedCustomerInfoListener;)V",
        "updatedCustomerInfoListener",
        "Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;",
        "getCustomerCenterListener",
        "()Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;",
        "setCustomerCenterListener",
        "(Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;)V",
        "getCustomerCenterListener$delegate",
        "customerCenterListener",
        "isAnonymous",
        "Lcom/revenuecat/purchases/Store;",
        "getStore",
        "()Lcom/revenuecat/purchases/Store;",
        "store",
        "Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;",
        "getCachedVirtualCurrencies",
        "()Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;",
        "cachedVirtualCurrencies",
        "getPreferredUILocaleOverride",
        "preferredUILocaleOverride",
        "Companion",
        "purchases_defaultsBc8Release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/revenuecat/purchases/Purchases$Companion;

.field private static synthetic backingFieldSharedInstance:Lcom/revenuecat/purchases/Purchases;

.field private static final frameworkVersion:Ljava/lang/String;


# instance fields
.field private final purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/Purchases$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/revenuecat/purchases/Purchases$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/revenuecat/purchases/Purchases;->Companion:Lcom/revenuecat/purchases/Purchases$Companion;

    .line 8
    .line 9
    const-string v0, "9.29.0"

    .line 10
    .line 11
    sput-object v0, Lcom/revenuecat/purchases/Purchases;->frameworkVersion:Ljava/lang/String;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Lcom/revenuecat/purchases/PurchasesOrchestrator;)V
    .locals 1

    .line 1
    const-string v0, "purchasesOrchestrator"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 10
    .line 11
    return-void
.end method

.method public static final synthetic access$getBackingFieldSharedInstance$cp()Lcom/revenuecat/purchases/Purchases;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/Purchases;->backingFieldSharedInstance:Lcom/revenuecat/purchases/Purchases;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$getFrameworkVersion$cp()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/Purchases;->frameworkVersion:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic access$setBackingFieldSharedInstance$cp(Lcom/revenuecat/purchases/Purchases;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/revenuecat/purchases/Purchases;->backingFieldSharedInstance:Lcom/revenuecat/purchases/Purchases;

    .line 2
    .line 3
    return-void
.end method

.method public static final canMakePayments(Landroid/content/Context;Lcom/revenuecat/purchases/interfaces/Callback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/revenuecat/purchases/interfaces/Callback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/Purchases;->Companion:Lcom/revenuecat/purchases/Purchases$Companion;

    invoke-virtual {v0, p0, p1}, Lcom/revenuecat/purchases/Purchases$Companion;->canMakePayments(Landroid/content/Context;Lcom/revenuecat/purchases/interfaces/Callback;)V

    return-void
.end method

.method public static final canMakePayments(Landroid/content/Context;Ljava/util/List;Lcom/revenuecat/purchases/interfaces/Callback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List<",
            "+",
            "Lcom/revenuecat/purchases/models/BillingFeature;",
            ">;",
            "Lcom/revenuecat/purchases/interfaces/Callback<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 2
    sget-object v0, Lcom/revenuecat/purchases/Purchases;->Companion:Lcom/revenuecat/purchases/Purchases$Companion;

    invoke-virtual {v0, p0, p1, p2}, Lcom/revenuecat/purchases/Purchases$Companion;->canMakePayments(Landroid/content/Context;Ljava/util/List;Lcom/revenuecat/purchases/interfaces/Callback;)V

    return-void
.end method

.method public static final configure(Lcom/revenuecat/purchases/PurchasesConfiguration;)Lcom/revenuecat/purchases/Purchases;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/Purchases;->Companion:Lcom/revenuecat/purchases/Purchases$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lcom/revenuecat/purchases/Purchases$Companion;->configure(Lcom/revenuecat/purchases/PurchasesConfiguration;)Lcom/revenuecat/purchases/Purchases;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static synthetic getAdTracker$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method public static synthetic getAllowSharingPlayStoreAccount$annotations()V
    .locals 0
    .annotation runtime LTd/e;
    .end annotation

    .line 1
    return-void
.end method

.method private static getCustomerCenterListener$delegate(Lcom/revenuecat/purchases/Purchases;)Ljava/lang/Object;
    .locals 6

    .line 1
    new-instance v0, Lkotlin/jvm/internal/x;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 4
    .line 5
    const-string v4, "getCustomerCenterListener()Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;"

    .line 6
    .line 7
    const/4 v5, 0x0

    .line 8
    const-class v2, Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 9
    .line 10
    const-string v3, "customerCenterListener"

    .line 11
    .line 12
    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/x;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lkotlin/jvm/internal/O;->d(Lkotlin/jvm/internal/w;)Lpe/j;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public static synthetic getDebugEventListener$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method private static getDebugEventListener$delegate(Lcom/revenuecat/purchases/Purchases;)Ljava/lang/Object;
    .locals 6

    .line 1
    new-instance v0, Lkotlin/jvm/internal/x;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 4
    .line 5
    const-string v4, "getDebugEventListener()Lcom/revenuecat/purchases/DebugEventListener;"

    .line 6
    .line 7
    const/4 v5, 0x0

    .line 8
    const-class v2, Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 9
    .line 10
    const-string v3, "debugEventListener"

    .line 11
    .line 12
    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/x;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lkotlin/jvm/internal/O;->d(Lkotlin/jvm/internal/w;)Lpe/j;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public static final getDebugLogsEnabled()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/Purchases;->Companion:Lcom/revenuecat/purchases/Purchases$Companion;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/revenuecat/purchases/Purchases$Companion;->getDebugLogsEnabled()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static synthetic getFileRepository$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method public static synthetic getFinishTransactions$annotations()V
    .locals 0
    .annotation runtime LTd/e;
    .end annotation

    .line 1
    return-void
.end method

.method public static final getFrameworkVersion()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/Purchases;->Companion:Lcom/revenuecat/purchases/Purchases$Companion;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/revenuecat/purchases/Purchases$Companion;->getFrameworkVersion()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static final declared-synchronized getLogHandler()Lcom/revenuecat/purchases/LogHandler;
    .locals 2

    .line 1
    const-class v0, Lcom/revenuecat/purchases/Purchases;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/revenuecat/purchases/Purchases;->Companion:Lcom/revenuecat/purchases/Purchases$Companion;

    .line 5
    .line 6
    invoke-virtual {v1}, Lcom/revenuecat/purchases/Purchases$Companion;->getLogHandler()Lcom/revenuecat/purchases/LogHandler;

    .line 7
    .line 8
    .line 9
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    monitor-exit v0

    .line 11
    return-object v1

    .line 12
    :catchall_0
    move-exception v1

    .line 13
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 14
    throw v1
.end method

.method public static final getLogLevel()Lcom/revenuecat/purchases/LogLevel;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/Purchases;->Companion:Lcom/revenuecat/purchases/Purchases$Companion;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/revenuecat/purchases/Purchases$Companion;->getLogLevel()Lcom/revenuecat/purchases/LogLevel;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static final getPlatformInfo()Lcom/revenuecat/purchases/common/PlatformInfo;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/Purchases;->Companion:Lcom/revenuecat/purchases/Purchases$Companion;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/revenuecat/purchases/Purchases$Companion;->getPlatformInfo()Lcom/revenuecat/purchases/common/PlatformInfo;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static synthetic getProducts$default(Lcom/revenuecat/purchases/Purchases;Ljava/util/List;Lcom/revenuecat/purchases/ProductType;Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x2

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lcom/revenuecat/purchases/Purchases;->getProducts(Ljava/util/List;Lcom/revenuecat/purchases/ProductType;Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static final getProxyURL()Ljava/net/URL;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/Purchases;->Companion:Lcom/revenuecat/purchases/Purchases$Companion;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/revenuecat/purchases/Purchases$Companion;->getProxyURL()Ljava/net/URL;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static final getSharedInstance()Lcom/revenuecat/purchases/Purchases;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/Purchases;->Companion:Lcom/revenuecat/purchases/Purchases$Companion;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/revenuecat/purchases/Purchases$Companion;->getSharedInstance()Lcom/revenuecat/purchases/Purchases;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public static synthetic getStorefrontLocale$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method public static synthetic getTrackedEventListener$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method private static getTrackedEventListener$delegate(Lcom/revenuecat/purchases/Purchases;)Ljava/lang/Object;
    .locals 6

    .line 1
    new-instance v0, Lkotlin/jvm/internal/x;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 4
    .line 5
    const-string v4, "getTrackedEventListener()Lcom/revenuecat/purchases/TrackedEventListener;"

    .line 6
    .line 7
    const/4 v5, 0x0

    .line 8
    const-class v2, Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 9
    .line 10
    const-string v3, "trackedEventListener"

    .line 11
    .line 12
    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/x;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lkotlin/jvm/internal/O;->d(Lkotlin/jvm/internal/w;)Lpe/j;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public static final isConfigured()Z
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/Purchases;->Companion:Lcom/revenuecat/purchases/Purchases$Companion;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/revenuecat/purchases/Purchases$Companion;->isConfigured()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public static synthetic logIn$default(Lcom/revenuecat/purchases/Purchases;Ljava/lang/String;Lcom/revenuecat/purchases/interfaces/LogInCallback;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/Purchases;->logIn(Ljava/lang/String;Lcom/revenuecat/purchases/interfaces/LogInCallback;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static synthetic logOut$default(Lcom/revenuecat/purchases/Purchases;Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1}, Lcom/revenuecat/purchases/Purchases;->logOut(Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static final parseAsWebPurchaseRedemption(Landroid/content/Intent;)Lcom/revenuecat/purchases/WebPurchaseRedemption;
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/Purchases;->Companion:Lcom/revenuecat/purchases/Purchases$Companion;

    invoke-virtual {v0, p0}, Lcom/revenuecat/purchases/Purchases$Companion;->parseAsWebPurchaseRedemption(Landroid/content/Intent;)Lcom/revenuecat/purchases/WebPurchaseRedemption;

    move-result-object p0

    return-object p0
.end method

.method public static final parseAsWebPurchaseRedemption(Ljava/lang/String;)Lcom/revenuecat/purchases/WebPurchaseRedemption;
    .locals 1

    .line 2
    sget-object v0, Lcom/revenuecat/purchases/Purchases;->Companion:Lcom/revenuecat/purchases/Purchases$Companion;

    invoke-virtual {v0, p0}, Lcom/revenuecat/purchases/Purchases$Companion;->parseAsWebPurchaseRedemption(Ljava/lang/String;)Lcom/revenuecat/purchases/WebPurchaseRedemption;

    move-result-object p0

    return-object p0
.end method

.method public static final setDebugLogsEnabled(Z)V
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/Purchases;->Companion:Lcom/revenuecat/purchases/Purchases$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lcom/revenuecat/purchases/Purchases$Companion;->setDebugLogsEnabled(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static final declared-synchronized setLogHandler(Lcom/revenuecat/purchases/LogHandler;)V
    .locals 2

    .line 1
    const-class v0, Lcom/revenuecat/purchases/Purchases;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-object v1, Lcom/revenuecat/purchases/Purchases;->Companion:Lcom/revenuecat/purchases/Purchases$Companion;

    .line 5
    .line 6
    invoke-virtual {v1, p0}, Lcom/revenuecat/purchases/Purchases$Companion;->setLogHandler(Lcom/revenuecat/purchases/LogHandler;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    .line 8
    .line 9
    monitor-exit v0

    .line 10
    return-void

    .line 11
    :catchall_0
    move-exception p0

    .line 12
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 13
    throw p0
.end method

.method public static final setLogLevel(Lcom/revenuecat/purchases/LogLevel;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/Purchases;->Companion:Lcom/revenuecat/purchases/Purchases$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lcom/revenuecat/purchases/Purchases$Companion;->setLogLevel(Lcom/revenuecat/purchases/LogLevel;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static final setPlatformInfo(Lcom/revenuecat/purchases/common/PlatformInfo;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/Purchases;->Companion:Lcom/revenuecat/purchases/Purchases$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lcom/revenuecat/purchases/Purchases$Companion;->setPlatformInfo(Lcom/revenuecat/purchases/common/PlatformInfo;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static final setProxyURL(Ljava/net/URL;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/Purchases;->Companion:Lcom/revenuecat/purchases/Purchases$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lcom/revenuecat/purchases/Purchases$Companion;->setProxyURL(Ljava/net/URL;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static final setSharedInstance$purchases_defaultsBc8Release(Lcom/revenuecat/purchases/Purchases;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/Purchases;->Companion:Lcom/revenuecat/purchases/Purchases$Companion;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Lcom/revenuecat/purchases/Purchases$Companion;->setSharedInstance$purchases_defaultsBc8Release(Lcom/revenuecat/purchases/Purchases;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public static synthetic showInAppMessagesIfNeeded$default(Lcom/revenuecat/purchases/Purchases;Landroid/app/Activity;Ljava/util/List;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    sget-object p2, Lcom/revenuecat/purchases/models/InAppMessageType;->BILLING_ISSUES:Lcom/revenuecat/purchases/models/InAppMessageType;

    .line 6
    .line 7
    invoke-static {p2}, LUd/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/revenuecat/purchases/Purchases;->showInAppMessagesIfNeeded(Landroid/app/Activity;Ljava/util/List;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public static synthetic syncPurchases$default(Lcom/revenuecat/purchases/Purchases;Lcom/revenuecat/purchases/interfaces/SyncPurchasesCallback;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    :cond_0
    invoke-virtual {p0, p1}, Lcom/revenuecat/purchases/Purchases;->syncPurchases(Lcom/revenuecat/purchases/interfaces/SyncPurchasesCallback;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static synthetic trackCustomPaywallImpression$default(Lcom/revenuecat/purchases/Purchases;Lcom/revenuecat/purchases/paywalls/events/CustomPaywallImpressionParams;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    new-instance p1, Lcom/revenuecat/purchases/paywalls/events/CustomPaywallImpressionParams;

    .line 6
    .line 7
    const/4 p2, 0x3

    .line 8
    const/4 p3, 0x0

    .line 9
    invoke-direct {p1, p3, p3, p2, p3}, Lcom/revenuecat/purchases/paywalls/events/CustomPaywallImpressionParams;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {p0, p1}, Lcom/revenuecat/purchases/Purchases;->trackCustomPaywallImpression(Lcom/revenuecat/purchases/paywalls/events/CustomPaywallImpressionParams;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->close()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    sput-object v0, Lcom/revenuecat/purchases/Purchases;->backingFieldSharedInstance:Lcom/revenuecat/purchases/Purchases;

    .line 8
    .line 9
    return-void
.end method

.method public final collectDeviceIdentifiers()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->collectDeviceIdentifiers()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final createSupportTicket(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "email"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "description"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "onSuccess"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const-string v0, "onError"

    .line 17
    .line 18
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 22
    .line 23
    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->createSupportTicket(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final synthetic getAdTracker()Lcom/revenuecat/purchases/ads/events/AdTracker;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->getAdTracker()Lcom/revenuecat/purchases/ads/events/AdTracker;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final declared-synchronized getAllowSharingPlayStoreAccount()Z
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 3
    .line 4
    invoke-virtual {v0}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->getAllowSharingPlayStoreAccount()Z

    .line 5
    .line 6
    .line 7
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    monitor-exit p0

    .line 9
    return v0

    .line 10
    :catchall_0
    move-exception v0

    .line 11
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    throw v0
.end method

.method public final getAmazonLWAConsentStatus(Lcom/revenuecat/purchases/interfaces/GetAmazonLWAConsentStatusCallback;)V
    .locals 1

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->getAmazonLWAConsentStatus(Lcom/revenuecat/purchases/interfaces/GetAmazonLWAConsentStatusCallback;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final declared-synchronized getAppUserID()Ljava/lang/String;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 3
    .line 4
    invoke-virtual {v0}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->getAppUserID()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    monitor-exit p0

    .line 9
    return-object v0

    .line 10
    :catchall_0
    move-exception v0

    .line 11
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    throw v0
.end method

.method public final getCachedFontFamilyOrStartDownload(Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$Name;)Lcom/revenuecat/purchases/paywalls/DownloadedFontFamily;
    .locals 1

    .line 1
    const-string v0, "fontInfo"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->getCachedFontFamilyOrStartDownload(Lcom/revenuecat/purchases/UiConfig$AppConfig$FontsConfig$FontInfo$Name;)Lcom/revenuecat/purchases/paywalls/DownloadedFontFamily;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1
.end method

.method public final getCachedVirtualCurrencies()Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->getCachedVirtualCurrencies()Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final getCurrentConfiguration()Lcom/revenuecat/purchases/PurchasesConfiguration;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->getCurrentConfiguration()Lcom/revenuecat/purchases/PurchasesConfiguration;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final getCustomerCenterConfigData$purchases_defaultsBc8Release(Lcom/revenuecat/purchases/interfaces/GetCustomerCenterConfigCallback;)V
    .locals 1

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->getCustomerCenterConfig(Lcom/revenuecat/purchases/interfaces/GetCustomerCenterConfigCallback;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final getCustomerCenterListener()Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->getCustomerCenterListener()Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final getCustomerInfo(Lcom/revenuecat/purchases/CacheFetchPolicy;Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;)V
    .locals 2

    const-string v0, "fetchPolicy"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1, p2}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->getCustomerInfo(Lcom/revenuecat/purchases/CacheFetchPolicy;ZLcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;)V

    return-void
.end method

.method public final getCustomerInfo(Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;)V
    .locals 3

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    sget-object v1, Lcom/revenuecat/purchases/CacheFetchPolicy;->Companion:Lcom/revenuecat/purchases/CacheFetchPolicy$Companion;

    invoke-virtual {v1}, Lcom/revenuecat/purchases/CacheFetchPolicy$Companion;->default()Lcom/revenuecat/purchases/CacheFetchPolicy;

    move-result-object v1

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2, p1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->getCustomerInfo(Lcom/revenuecat/purchases/CacheFetchPolicy;ZLcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;)V

    return-void
.end method

.method public final synthetic getDebugEventListener()Lcom/revenuecat/purchases/DebugEventListener;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->getDebugEventListener()Lcom/revenuecat/purchases/DebugEventListener;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final synthetic getFileRepository()Lcom/revenuecat/purchases/storage/FileRepository;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->getFileRepository()Lcom/revenuecat/purchases/storage/FileRepository;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final declared-synchronized getFinishTransactions()Z
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 3
    .line 4
    invoke-virtual {v0}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->getFinishTransactions()Z

    .line 5
    .line 6
    .line 7
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    monitor-exit p0

    .line 9
    return v0

    .line 10
    :catchall_0
    move-exception v0

    .line 11
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    throw v0
.end method

.method public final getNonSubscriptionSkus(Ljava/util/List;Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;)V
    .locals 2
    .annotation runtime LTd/e;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "productIds"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 12
    .line 13
    invoke-static {p1}, LUd/u;->f1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    sget-object v1, Lcom/revenuecat/purchases/ProductType;->INAPP:Lcom/revenuecat/purchases/ProductType;

    .line 18
    .line 19
    invoke-static {v1}, LUd/a0;->c(Ljava/lang/Object;)Ljava/util/Set;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v0, p1, v1, p2}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->getProductsOfTypes(Ljava/util/Set;Ljava/util/Set;Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final getOfferings(Lcom/revenuecat/purchases/interfaces/ReceiveOfferingsCallback;)V
    .locals 4

    .line 1
    const-string v0, "listener"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-static {v0, p1, v3, v1, v2}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->getOfferings$default(Lcom/revenuecat/purchases/PurchasesOrchestrator;Lcom/revenuecat/purchases/interfaces/ReceiveOfferingsCallback;ZILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final declared-synchronized getPreferredUILocaleOverride()Ljava/lang/String;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 3
    .line 4
    invoke-virtual {v0}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->getPreferredUILocaleOverride()Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    monitor-exit p0

    .line 9
    return-object v0

    .line 10
    :catchall_0
    move-exception v0

    .line 11
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    throw v0
.end method

.method public final getProducts(Ljava/util/List;Lcom/revenuecat/purchases/ProductType;Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/revenuecat/purchases/ProductType;",
            "Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;",
            ")V"
        }
    .end annotation

    const-string v0, "productIds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    invoke-virtual {v0, p1, p2, p3}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->getProducts(Ljava/util/List;Lcom/revenuecat/purchases/ProductType;Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;)V

    return-void
.end method

.method public final getProducts(Ljava/util/List;Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;",
            ")V"
        }
    .end annotation

    const-string v0, "productIds"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "callback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0, p2}, Lcom/revenuecat/purchases/Purchases;->getProducts(Ljava/util/List;Lcom/revenuecat/purchases/ProductType;Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;)V

    return-void
.end method

.method public final declared-synchronized getPurchasesAreCompletedBy()Lcom/revenuecat/purchases/PurchasesAreCompletedBy;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 3
    .line 4
    invoke-virtual {v0}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->getFinishTransactions()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    sget-object v0, Lcom/revenuecat/purchases/PurchasesAreCompletedBy;->REVENUECAT:Lcom/revenuecat/purchases/PurchasesAreCompletedBy;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    goto :goto_1

    .line 15
    :cond_0
    sget-object v0, Lcom/revenuecat/purchases/PurchasesAreCompletedBy;->MY_APP:Lcom/revenuecat/purchases/PurchasesAreCompletedBy;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    :goto_0
    monitor-exit p0

    .line 18
    return-object v0

    .line 19
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 20
    throw v0
.end method

.method public final synthetic getPurchasesOrchestrator$purchases_defaultsBc8Release()Lcom/revenuecat/purchases/PurchasesOrchestrator;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getStore()Lcom/revenuecat/purchases/Store;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->getStore()Lcom/revenuecat/purchases/Store;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final declared-synchronized getStorefrontCountryCode()Ljava/lang/String;
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    invoke-virtual {v0}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->getStorefrontCountryCode()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public final getStorefrontCountryCode(Lcom/revenuecat/purchases/interfaces/GetStorefrontCallback;)V
    .locals 1

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->getStorefrontCountryCode(Lcom/revenuecat/purchases/interfaces/GetStorefrontCallback;)V

    return-void
.end method

.method public final getStorefrontLocale()Ljava/util/Locale;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    invoke-virtual {v0}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->getStorefrontLocale()Ljava/util/Locale;

    move-result-object v0

    return-object v0
.end method

.method public final getStorefrontLocale(Lcom/revenuecat/purchases/interfaces/GetStorefrontLocaleCallback;)V
    .locals 1

    const-string v0, "callback"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->getStorefrontLocale(Lcom/revenuecat/purchases/interfaces/GetStorefrontLocaleCallback;)V

    return-void
.end method

.method public final getSubscriptionSkus(Ljava/util/List;Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;)V
    .locals 2
    .annotation runtime LTd/e;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "productIds"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 12
    .line 13
    invoke-static {p1}, LUd/u;->f1(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    sget-object v1, Lcom/revenuecat/purchases/ProductType;->SUBS:Lcom/revenuecat/purchases/ProductType;

    .line 18
    .line 19
    invoke-static {v1}, LUd/a0;->c(Ljava/lang/Object;)Ljava/util/Set;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v0, p1, v1, p2}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->getProductsOfTypes(Ljava/util/Set;Ljava/util/Set;Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final synthetic getTrackedEventListener()Lcom/revenuecat/purchases/TrackedEventListener;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->getTrackedEventListener()Lcom/revenuecat/purchases/TrackedEventListener;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final declared-synchronized getUpdatedCustomerInfoListener()Lcom/revenuecat/purchases/interfaces/UpdatedCustomerInfoListener;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 3
    .line 4
    invoke-virtual {v0}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->getUpdatedCustomerInfoListener()Lcom/revenuecat/purchases/interfaces/UpdatedCustomerInfoListener;

    .line 5
    .line 6
    .line 7
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    monitor-exit p0

    .line 9
    return-object v0

    .line 10
    :catchall_0
    move-exception v0

    .line 11
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 12
    throw v0
.end method

.method public final getVirtualCurrencies(Lcom/revenuecat/purchases/interfaces/GetVirtualCurrenciesCallback;)V
    .locals 1

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->getVirtualCurrencies(Lcom/revenuecat/purchases/interfaces/GetVirtualCurrenciesCallback;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final invalidateCustomerInfoCache()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->invalidateCustomerInfoCache()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final invalidateVirtualCurrenciesCache()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->invalidateVirtualCurrenciesCache()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final isAnonymous()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->isAnonymous()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final logIn(Ljava/lang/String;)V
    .locals 2

    .line 1
    const-string v0, "newAppUserID"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lcom/revenuecat/purchases/Purchases;->logIn$default(Lcom/revenuecat/purchases/Purchases;Ljava/lang/String;Lcom/revenuecat/purchases/interfaces/LogInCallback;ILjava/lang/Object;)V

    return-void
.end method

.method public final logIn(Ljava/lang/String;Lcom/revenuecat/purchases/interfaces/LogInCallback;)V
    .locals 1

    const-string v0, "newAppUserID"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    invoke-virtual {v0, p1, p2}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->logIn(Ljava/lang/String;Lcom/revenuecat/purchases/interfaces/LogInCallback;)V

    return-void
.end method

.method public final logOut()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, Lcom/revenuecat/purchases/Purchases;->logOut$default(Lcom/revenuecat/purchases/Purchases;Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;ILjava/lang/Object;)V

    return-void
.end method

.method public final logOut(Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->logOut(Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;)V

    return-void
.end method

.method public onAppBackgrounded()V
    .locals 1
    .annotation runtime LTd/e;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->onAppBackgrounded()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onAppForegrounded()V
    .locals 1
    .annotation runtime LTd/e;
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->onAppForegrounded()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final overridePreferredUILocale(Ljava/lang/String;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->overridePreferredUILocale(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    return p1
.end method

.method public final purchase(Lcom/revenuecat/purchases/PurchaseParams;Lcom/revenuecat/purchases/interfaces/PurchaseCallback;)V
    .locals 1

    .line 1
    const-string v0, "purchaseParams"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->purchase(Lcom/revenuecat/purchases/PurchaseParams;Lcom/revenuecat/purchases/interfaces/PurchaseCallback;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final purchasePackage(Landroid/app/Activity;Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/interfaces/PurchaseCallback;)V
    .locals 1
    .annotation runtime LTd/e;
    .end annotation

    .line 1
    const-string v0, "activity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "packageToPurchase"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "listener"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Lcom/revenuecat/purchases/PurchaseParams$Builder;

    .line 17
    .line 18
    invoke-direct {v0, p1, p2}, Lcom/revenuecat/purchases/PurchaseParams$Builder;-><init>(Landroid/app/Activity;Lcom/revenuecat/purchases/Package;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/revenuecat/purchases/PurchaseParams$Builder;->build()Lcom/revenuecat/purchases/PurchaseParams;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p0, p1, p3}, Lcom/revenuecat/purchases/Purchases;->purchase(Lcom/revenuecat/purchases/PurchaseParams;Lcom/revenuecat/purchases/interfaces/PurchaseCallback;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final purchaseProduct(Landroid/app/Activity;Lcom/revenuecat/purchases/models/StoreProduct;Lcom/revenuecat/purchases/interfaces/PurchaseCallback;)V
    .locals 1
    .annotation runtime LTd/e;
    .end annotation

    .line 1
    const-string v0, "activity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "storeProduct"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "callback"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    new-instance v0, Lcom/revenuecat/purchases/PurchaseParams$Builder;

    .line 17
    .line 18
    invoke-direct {v0, p1, p2}, Lcom/revenuecat/purchases/PurchaseParams$Builder;-><init>(Landroid/app/Activity;Lcom/revenuecat/purchases/models/StoreProduct;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/revenuecat/purchases/PurchaseParams$Builder;->build()Lcom/revenuecat/purchases/PurchaseParams;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p0, p1, p3}, Lcom/revenuecat/purchases/Purchases;->purchase(Lcom/revenuecat/purchases/PurchaseParams;Lcom/revenuecat/purchases/interfaces/PurchaseCallback;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final redeemWebPurchase(Lcom/revenuecat/purchases/WebPurchaseRedemption;Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener;)V
    .locals 1

    .line 1
    const-string v0, "webPurchaseRedemption"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "listener"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->redeemWebPurchase(Lcom/revenuecat/purchases/WebPurchaseRedemption;Lcom/revenuecat/purchases/interfaces/RedeemWebPurchaseListener;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final removeUpdatedCustomerInfoListener()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->removeUpdatedCustomerInfoListener()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final restorePurchases(Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;)V
    .locals 1

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->restorePurchases(Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final setAd(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->setAd(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setAdGroup(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->setAdGroup(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setAdjustID(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->setAdjustID(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setAirbridgeDeviceID(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->setAirbridgeDeviceID(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setAirshipChannelID(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->setAirshipChannelID(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final declared-synchronized setAllowSharingPlayStoreAccount(Z)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 3
    .line 4
    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->setAllowSharingPlayStoreAccount(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    .line 7
    monitor-exit p0

    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception p1

    .line 10
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 11
    throw p1
.end method

.method public final setAppsFlyerConversionData(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "**>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->setAppsFlyerConversionData(Ljava/util/Map;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setAppsflyerID(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->setAppsflyerID(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setAppstackAttributionParams(Ljava/util/Map;Lcom/revenuecat/purchases/interfaces/SyncAttributesAndOfferingsCallback;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/revenuecat/purchases/interfaces/SyncAttributesAndOfferingsCallback;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "data"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->setAppstackAttributionParams(Ljava/util/Map;Lcom/revenuecat/purchases/interfaces/SyncAttributesAndOfferingsCallback;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final setAttributes(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    const-string v0, "attributes"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->setAttributes(Ljava/util/Map;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final setCampaign(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->setCampaign(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setCleverTapID(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->setCleverTapID(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setCreative(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->setCreative(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setCustomerCenterListener(Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->setCustomerCenterListener(Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final synthetic setDebugEventListener(Lcom/revenuecat/purchases/DebugEventListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->setDebugEventListener(Lcom/revenuecat/purchases/DebugEventListener;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setDisplayName(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->setDisplayName(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setEmail(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->setEmail(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setFBAnonymousID(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->setFBAnonymousID(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final declared-synchronized setFinishTransactions(Z)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 3
    .line 4
    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->setFinishTransactions(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    .line 7
    monitor-exit p0

    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception p1

    .line 10
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 11
    throw p1
.end method

.method public final setFirebaseAppInstanceID(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->setFirebaseAppInstanceID(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setKeyword(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->setKeyword(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setKochavaDeviceID(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->setKochavaDeviceID(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setMediaSource(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->setMediaSource(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setMixpanelDistinctID(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->setMixpanelDistinctID(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setMparticleID(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->setMparticleID(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setOnesignalID(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->setOnesignalID(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setOnesignalUserID(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->setOnesignalUserID(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setPhoneNumber(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->setPhoneNumber(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setPostHogUserId(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->setPostHogUserId(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final declared-synchronized setPurchasesAreCompletedBy(Lcom/revenuecat/purchases/PurchasesAreCompletedBy;)V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "value"

    .line 3
    .line 4
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 8
    .line 9
    sget-object v1, Lcom/revenuecat/purchases/Purchases$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    aget p1, v1, p1

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    if-eq p1, v1, :cond_1

    .line 19
    .line 20
    const/4 v1, 0x2

    .line 21
    if-ne p1, v1, :cond_0

    .line 22
    .line 23
    const/4 v1, 0x0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance p1, LTd/r;

    .line 26
    .line 27
    invoke-direct {p1}, LTd/r;-><init>()V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :catchall_0
    move-exception p1

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    :goto_0
    invoke-virtual {v0, v1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->setFinishTransactions(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    .line 35
    .line 36
    monitor-exit p0

    .line 37
    return-void

    .line 38
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 39
    throw p1
.end method

.method public final setPushToken(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->setPushToken(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setSolarEngineAccountId(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->setSolarEngineAccountId(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setSolarEngineDistinctId(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->setSolarEngineDistinctId(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setSolarEngineVisitorId(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->setSolarEngineVisitorId(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setTenjinAnalyticsInstallationID(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->setTenjinAnalyticsInstallationID(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final synthetic setTrackedEventListener(Lcom/revenuecat/purchases/TrackedEventListener;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->setTrackedEventListener(Lcom/revenuecat/purchases/TrackedEventListener;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final declared-synchronized setUpdatedCustomerInfoListener(Lcom/revenuecat/purchases/interfaces/UpdatedCustomerInfoListener;)V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 3
    .line 4
    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->setUpdatedCustomerInfoListener(Lcom/revenuecat/purchases/interfaces/UpdatedCustomerInfoListener;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    .line 7
    monitor-exit p0

    .line 8
    return-void

    .line 9
    :catchall_0
    move-exception p1

    .line 10
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 11
    throw p1
.end method

.method public final showInAppMessagesIfNeeded(Landroid/app/Activity;)V
    .locals 2

    .line 1
    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x2

    invoke-static {p0, p1, v0, v1, v0}, Lcom/revenuecat/purchases/Purchases;->showInAppMessagesIfNeeded$default(Lcom/revenuecat/purchases/Purchases;Landroid/app/Activity;Ljava/util/List;ILjava/lang/Object;)V

    return-void
.end method

.method public final showInAppMessagesIfNeeded(Landroid/app/Activity;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/app/Activity;",
            "Ljava/util/List<",
            "+",
            "Lcom/revenuecat/purchases/models/InAppMessageType;",
            ">;)V"
        }
    .end annotation

    const-string v0, "activity"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inAppMessageTypes"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    invoke-virtual {v0, p1, p2}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->showInAppMessagesIfNeeded(Landroid/app/Activity;Ljava/util/List;)V

    return-void
.end method

.method public final syncAmazonPurchase(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V
    .locals 8
    .annotation runtime LTd/e;
    .end annotation

    const-string v0, "productID"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "receiptID"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "amazonUserID"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object v1, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    const/4 v7, 0x0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-virtual/range {v1 .. v7}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->syncAmazonPurchase(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Long;)V

    return-void
.end method

.method public final syncAmazonPurchase(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;J)V
    .locals 2

    const-string v0, "productID"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "receiptID"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "amazonUserID"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-wide v0, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    .line 2
    iget-object p1, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p7

    .line 4
    invoke-virtual/range {p1 .. p7}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->syncAmazonPurchase(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Long;)V

    return-void
.end method

.method public final syncAttributesAndOfferingsIfNeeded(Lcom/revenuecat/purchases/interfaces/SyncAttributesAndOfferingsCallback;)V
    .locals 1

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->syncAttributesAndOfferingsIfNeeded(Lcom/revenuecat/purchases/interfaces/SyncAttributesAndOfferingsCallback;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final syncObserverModeAmazonPurchase(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V
    .locals 1
    .annotation runtime LTd/e;
    .end annotation

    .line 1
    const-string v0, "productID"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "receiptID"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "amazonUserID"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual/range {p0 .. p5}, Lcom/revenuecat/purchases/Purchases;->syncAmazonPurchase(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final syncPurchases()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, Lcom/revenuecat/purchases/Purchases;->syncPurchases$default(Lcom/revenuecat/purchases/Purchases;Lcom/revenuecat/purchases/interfaces/SyncPurchasesCallback;ILjava/lang/Object;)V

    return-void
.end method

.method public final syncPurchases(Lcom/revenuecat/purchases/interfaces/SyncPurchasesCallback;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->syncPurchases(Lcom/revenuecat/purchases/interfaces/SyncPurchasesCallback;)V

    return-void
.end method

.method public final synthetic track(Lcom/revenuecat/purchases/common/events/FeatureEvent;)V
    .locals 1

    .line 1
    const-string v0, "event"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->track(Lcom/revenuecat/purchases/common/events/FeatureEvent;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final trackCustomPaywallImpression()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, Lcom/revenuecat/purchases/Purchases;->trackCustomPaywallImpression$default(Lcom/revenuecat/purchases/Purchases;Lcom/revenuecat/purchases/paywalls/events/CustomPaywallImpressionParams;ILjava/lang/Object;)V

    return-void
.end method

.method public final trackCustomPaywallImpression(Lcom/revenuecat/purchases/paywalls/events/CustomPaywallImpressionParams;)V
    .locals 4

    const-string v0, "params"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    .line 3
    new-instance v1, Lcom/revenuecat/purchases/paywalls/events/CustomPaywallEvent$Impression;

    .line 4
    new-instance v2, Lcom/revenuecat/purchases/paywalls/events/CustomPaywallEvent$Impression$Data;

    .line 5
    invoke-virtual {p1}, Lcom/revenuecat/purchases/paywalls/events/CustomPaywallImpressionParams;->getPaywallId()Ljava/lang/String;

    move-result-object v3

    .line 6
    invoke-virtual {p1}, Lcom/revenuecat/purchases/paywalls/events/CustomPaywallImpressionParams;->getOfferingId()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/revenuecat/purchases/Purchases;->purchasesOrchestrator:Lcom/revenuecat/purchases/PurchasesOrchestrator;

    invoke-virtual {p1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->getCachedCurrentOfferingIdentifier()Ljava/lang/String;

    move-result-object p1

    .line 7
    :cond_0
    invoke-direct {v2, v3, p1}, Lcom/revenuecat/purchases/paywalls/events/CustomPaywallEvent$Impression$Data;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p1, 0x1

    const/4 v3, 0x0

    .line 8
    invoke-direct {v1, v3, v2, p1, v3}, Lcom/revenuecat/purchases/paywalls/events/CustomPaywallEvent$Impression;-><init>(Lcom/revenuecat/purchases/paywalls/events/CustomPaywallEvent$Impression$CreationData;Lcom/revenuecat/purchases/paywalls/events/CustomPaywallEvent$Impression$Data;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 9
    invoke-virtual {v0, v1}, Lcom/revenuecat/purchases/PurchasesOrchestrator;->track(Lcom/revenuecat/purchases/common/events/FeatureEvent;)V

    return-void
.end method
