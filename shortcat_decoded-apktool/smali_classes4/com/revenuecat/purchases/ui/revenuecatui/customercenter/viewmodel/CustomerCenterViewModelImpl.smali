.class public final Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;
.super Landroidx/lifecycle/U;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$Companion;,
        Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00c6\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u001b\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u0000 \u00e6\u00012\u00020\u00012\u00020\u0002:\u0002\u00e6\u0001B?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J;\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00142\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0014H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J#\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001a2\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020 H\u0002\u00a2\u0006\u0004\u0008\"\u0010#J\u001f\u0010&\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020$H\u0002\u00a2\u0006\u0004\u0008&\u0010\'J\u001f\u0010(\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020$H\u0002\u00a2\u0006\u0004\u0008(\u0010\'J+\u0010+\u001a\u00020\u00152\u0006\u0010*\u001a\u00020)2\u0006\u0010\u001b\u001a\u00020\u001a2\n\u0008\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002\u00a2\u0006\u0004\u0008+\u0010,J\"\u0010.\u001a\u00020\u000b2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010-\u001a\u00020\u0011H\u0082@\u00a2\u0006\u0004\u0008.\u0010/J/\u00106\u001a\u0008\u0012\u0004\u0012\u00020)052\u0008\u00100\u001a\u0004\u0018\u00010\u001c2\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0002\u00a2\u0006\u0004\u00086\u00107J1\u00108\u001a\u0008\u0012\u0004\u0012\u00020)05*\u0008\u0012\u0004\u0012\u00020)052\u0008\u00100\u001a\u0004\u0018\u00010\u001c2\u0006\u00104\u001a\u000203H\u0002\u00a2\u0006\u0004\u00088\u00109J!\u0010:\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020)2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002\u00a2\u0006\u0004\u0008:\u0010;J!\u0010<\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020)2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002\u00a2\u0006\u0004\u0008<\u0010;J\u001d\u0010?\u001a\u0008\u0012\u0004\u0012\u00020)052\u0006\u0010>\u001a\u00020=H\u0002\u00a2\u0006\u0004\u0008?\u0010@J.\u0010A\u001a\u0008\u0012\u0004\u0012\u00020\u001c052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u00104\u001a\u000203H\u0082@\u00a2\u0006\u0004\u0008A\u0010BJ\u001d\u0010F\u001a\u0008\u0012\u0004\u0012\u00020E052\u0006\u0010D\u001a\u00020CH\u0002\u00a2\u0006\u0004\u0008F\u0010GJ\u0019\u0010I\u001a\u0004\u0018\u00010H2\u0006\u0010D\u001a\u00020CH\u0002\u00a2\u0006\u0004\u0008I\u0010JJ:\u0010N\u001a\u00020\u001c2\u0006\u0010K\u001a\u00020E2\u0008\u0010M\u001a\u0004\u0018\u00010L2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u00104\u001a\u000203H\u0082@\u00a2\u0006\u0004\u0008N\u0010OJ\u0018\u0010Q\u001a\u00020\u00152\u0006\u0010P\u001a\u00020\u000bH\u0082@\u00a2\u0006\u0004\u0008Q\u0010RJ#\u0010U\u001a\u00020=*\u00020=2\u0006\u0010P\u001a\u00020\u000b2\u0006\u0010T\u001a\u00020SH\u0002\u00a2\u0006\u0004\u0008U\u0010VJ\u000f\u0010W\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008W\u0010XJ)\u0010\\\u001a\u00020\u00152\u0006\u0010*\u001a\u00020Y2\u0008\u0010Z\u001a\u0004\u0018\u00010\u00112\u0006\u0010[\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\\\u0010]J\u000f\u0010_\u001a\u00020^H\u0002\u00a2\u0006\u0004\u0008_\u0010`J-\u0010f\u001a\u00020\u00152\u0006\u0010b\u001a\u00020a2\u0014\u0010e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010d\u0012\u0004\u0012\u00020\u00150cH\u0002\u00a2\u0006\u0004\u0008f\u0010gJ\"\u0010k\u001a\u0004\u0018\u00010j2\u0006\u0010i\u001a\u00020h2\u0006\u0010!\u001a\u00020 H\u0082@\u00a2\u0006\u0004\u0008k\u0010lJ\"\u0010o\u001a\u0004\u0018\u00010 2\u0006\u0010m\u001a\u00020\u00112\u0006\u0010n\u001a\u00020\u0011H\u0082@\u00a2\u0006\u0004\u0008o\u0010pJ!\u0010s\u001a\u0004\u0018\u00010j2\u0006\u0010q\u001a\u00020\u00112\u0006\u0010r\u001a\u00020 H\u0002\u00a2\u0006\u0004\u0008s\u0010tJ>\u0010u\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0008\u0010!\u001a\u0004\u0018\u00010 2\u0008\u0010i\u001a\u0004\u0018\u00010h2\u0006\u0010*\u001a\u00020)2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0082@\u00a2\u0006\u0004\u0008u\u0010vJ\u000f\u0010w\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008w\u0010XJ\u0013\u0010x\u001a\u00020=*\u00020=H\u0002\u00a2\u0006\u0004\u0008x\u0010yJ\u001f\u0010{\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010z\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008{\u0010|J\u000f\u0010}\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008}\u0010XJ\u0017\u0010~\u001a\u00020\u00152\u0006\u0010D\u001a\u00020CH\u0002\u00a2\u0006\u0004\u0008~\u0010\u007fJ\u001c\u0010\u0082\u0001\u001a\u00020\u00152\u0008\u0010\u0081\u0001\u001a\u00030\u0080\u0001H\u0002\u00a2\u0006\u0006\u0008\u0082\u0001\u0010\u0083\u0001J\u0011\u0010\u0084\u0001\u001a\u00020\u0015H\u0002\u00a2\u0006\u0005\u0008\u0084\u0001\u0010XJ\u001b\u0010\u0086\u0001\u001a\u00020\u00152\u0007\u0010\u0085\u0001\u001a\u00020\u0011H\u0002\u00a2\u0006\u0006\u0008\u0086\u0001\u0010\u0087\u0001J$\u0010\u0088\u0001\u001a\u00020\u00152\u0006\u0010*\u001a\u00020)2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002\u00a2\u0006\u0006\u0008\u0088\u0001\u0010\u0089\u0001J\u001c\u0010\u008c\u0001\u001a\u00020\u00152\u0008\u0010\u008b\u0001\u001a\u00030\u008a\u0001H\u0002\u00a2\u0006\u0006\u0008\u008c\u0001\u0010\u008d\u0001J#\u0010\u008f\u0001\u001a\u00020\u00152\u0006\u0010D\u001a\u00020C2\u0007\u0010K\u001a\u00030\u008e\u0001H\u0002\u00a2\u0006\u0006\u0008\u008f\u0001\u0010\u0090\u0001J\u001a\u0010\u0091\u0001\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001aH\u0002\u00a2\u0006\u0006\u0008\u0091\u0001\u0010\u0092\u0001J$\u0010\u0095\u0001\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001a2\u0008\u0010\u0094\u0001\u001a\u00030\u0093\u0001H\u0002\u00a2\u0006\u0006\u0008\u0095\u0001\u0010\u0096\u0001J%\u0010\u009a\u0001\u001a\u00020\u00152\u0007\u0010\u0097\u0001\u001a\u00020\u00112\u0008\u0010\u0099\u0001\u001a\u00030\u0098\u0001H\u0002\u00a2\u0006\u0006\u0008\u009a\u0001\u0010\u009b\u0001J\u0017\u0010\u009d\u0001\u001a\u00020H*\u00030\u009c\u0001H\u0002\u00a2\u0006\u0006\u0008\u009d\u0001\u0010\u009e\u0001J,\u0010\u009f\u0001\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020)2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016\u00a2\u0006\u0006\u0008\u009f\u0001\u0010\u00a0\u0001J\u001b\u0010\u00a2\u0001\u001a\u00020\u00152\u0007\u0010\u00a1\u0001\u001a\u00020\u001cH\u0016\u00a2\u0006\u0006\u0008\u00a2\u0001\u0010\u00a3\u0001J\u001c\u0010\u00a4\u0001\u001a\u00020\u00152\u0008\u0010\u008b\u0001\u001a\u00030\u008a\u0001H\u0016\u00a2\u0006\u0006\u0008\u00a4\u0001\u0010\u008d\u0001J\u0011\u0010\u00a5\u0001\u001a\u00020\u0015H\u0016\u00a2\u0006\u0005\u0008\u00a5\u0001\u0010XJ\u0011\u0010\u00a6\u0001\u001a\u00020\u0015H\u0016\u00a2\u0006\u0005\u0008\u00a6\u0001\u0010XJ\u0011\u0010\u00a7\u0001\u001a\u00020\u0015H\u0016\u00a2\u0006\u0005\u0008\u00a7\u0001\u0010XJ\u0013\u0010\u00a8\u0001\u001a\u00020\u0015H\u0096@\u00a2\u0006\u0006\u0008\u00a8\u0001\u0010\u00a9\u0001J\u0013\u0010\u00aa\u0001\u001a\u00020\u0015H\u0096@\u00a2\u0006\u0006\u0008\u00aa\u0001\u0010\u00a9\u0001J\"\u0010\u00ac\u0001\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001a2\u0007\u0010\u00ab\u0001\u001a\u00020\u0011H\u0016\u00a2\u0006\u0005\u0008\u00ac\u0001\u0010|J,\u0010\u00af\u0001\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010Z\u001a\u00020\u00112\u0008\u0010\u00ae\u0001\u001a\u00030\u00ad\u0001H\u0016\u00a2\u0006\u0006\u0008\u00af\u0001\u0010\u00b0\u0001J\u0011\u0010\u00b1\u0001\u001a\u00020\u0015H\u0016\u00a2\u0006\u0005\u0008\u00b1\u0001\u0010XJ=\u0010\u00b3\u0001\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020 2\u0006\u0010i\u001a\u00020h2\u0007\u0010\u00b2\u0001\u001a\u00020)2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096@\u00a2\u0006\u0005\u0008\u00b3\u0001\u0010vJ(\u0010\u00b7\u0001\u001a\u00020\u00152\u0007\u0010\u00b4\u0001\u001a\u00020j2\n\u0010\u00b6\u0001\u001a\u0005\u0018\u00010\u00b5\u0001H\u0096@\u00a2\u0006\u0006\u0008\u00b7\u0001\u0010\u00b8\u0001J#\u0010\u00b9\u0001\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001a2\u0007\u0010\u00b2\u0001\u001a\u00020)H\u0016\u00a2\u0006\u0006\u0008\u00b9\u0001\u0010\u00ba\u0001J)\u0010\u00bc\u0001\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001a2\r\u0010\u00bb\u0001\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0014H\u0016\u00a2\u0006\u0006\u0008\u00bc\u0001\u0010\u00bd\u0001J\u0011\u0010Q\u001a\u00020\u0015H\u0097@\u00a2\u0006\u0005\u0008Q\u0010\u00a9\u0001J\u0013\u0010\u00be\u0001\u001a\u00020\u0015H\u0096@\u00a2\u0006\u0006\u0008\u00be\u0001\u0010\u00a9\u0001J\u001b\u0010\u00c0\u0001\u001a\u00020\u00152\u0007\u0010\u00bf\u0001\u001a\u00020\u000bH\u0016\u00a2\u0006\u0006\u0008\u00c0\u0001\u0010\u00c1\u0001J\u0011\u0010\u00c2\u0001\u001a\u00020\u0015H\u0016\u00a2\u0006\u0005\u0008\u00c2\u0001\u0010XJ\u0011\u0010\u00c3\u0001\u001a\u00020\u0015H\u0016\u00a2\u0006\u0005\u0008\u00c3\u0001\u0010XJ\u0011\u0010\u00c4\u0001\u001a\u00020\u0015H\u0016\u00a2\u0006\u0005\u0008\u00c4\u0001\u0010XJ$\u0010\u00c7\u0001\u001a\u00020\u00152\u0007\u0010\u00c5\u0001\u001a\u00020\t2\u0007\u0010\u00c6\u0001\u001a\u00020\u000bH\u0016\u00a2\u0006\u0006\u0008\u00c7\u0001\u0010\u00c8\u0001J\u0011\u0010\u00c9\u0001\u001a\u00020\u0015H\u0016\u00a2\u0006\u0005\u0008\u00c9\u0001\u0010XJ\u001a\u0010\u00ca\u0001\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001aH\u0016\u00a2\u0006\u0006\u0008\u00ca\u0001\u0010\u0092\u0001R\u0015\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0004\u0010\u00cb\u0001R\u0015\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0006\u0010\u00cc\u0001R\u0015\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0008\u0010\u00cd\u0001R\u0015\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\n\u0010\u00ce\u0001R\u0017\u0010\u000c\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u000c\u0010\u00cf\u0001R\u0017\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u000e\u0010\u00d0\u0001R\u001c\u0010\u00d2\u0001\u001a\u0005\u0018\u00010\u00d1\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00d2\u0001\u0010\u00d3\u0001R\u0019\u0010\u00d4\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00d4\u0001\u0010\u00cf\u0001R\u0019\u0010\u00d5\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00d5\u0001\u0010\u00cf\u0001R\u001e\u0010\u00d7\u0001\u001a\t\u0012\u0004\u0012\u00020^0\u00d6\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00d7\u0001\u0010\u00d8\u0001R\u001e\u0010\u00d9\u0001\u001a\t\u0012\u0004\u0012\u00020\t0\u00d6\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00d9\u0001\u0010\u00d8\u0001R\u001e\u0010\u00da\u0001\u001a\t\u0012\u0004\u0012\u00020S0\u00d6\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00da\u0001\u0010\u00d8\u0001R$\u0010>\u001a\t\u0012\u0004\u0012\u00020S0\u00db\u00018\u0016X\u0096\u0004\u00a2\u0006\u000f\n\u0005\u0008>\u0010\u00dc\u0001\u001a\u0006\u0008\u00dd\u0001\u0010\u00de\u0001R!\u0010\u00e0\u0001\u001a\u000c\u0012\u0007\u0012\u0005\u0018\u00010\u0080\u00010\u00df\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00e0\u0001\u0010\u00e1\u0001R!\u0010\u00e5\u0001\u001a\u000c\u0012\u0007\u0012\u0005\u0018\u00010\u0080\u00010\u00e2\u00018VX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00e3\u0001\u0010\u00e4\u0001\u00a8\u0006\u00e7\u0001"
    }
    d2 = {
        "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;",
        "Landroidx/lifecycle/U;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModel;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;",
        "purchases",
        "Lcom/revenuecat/purchases/ui/revenuecatui/utils/DateFormatter;",
        "dateFormatter",
        "Ljava/util/Locale;",
        "locale",
        "LU/l;",
        "colorScheme",
        "",
        "isDarkMode",
        "Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;",
        "listener",
        "<init>",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;Lcom/revenuecat/purchases/ui/revenuecatui/utils/DateFormatter;Ljava/util/Locale;LU/l;ZLcom/revenuecat/purchases/customercenter/CustomerCenterListener;)V",
        "",
        "email",
        "description",
        "Lkotlin/Function0;",
        "LTd/L;",
        "onSuccess",
        "onError",
        "handleSupportTicketSubmit",
        "(Ljava/lang/String;Ljava/lang/String;Lie/a;Lie/a;)V",
        "Landroid/content/Context;",
        "context",
        "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;",
        "purchaseInformation",
        "handleCancelPath",
        "(Landroid/content/Context;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;)V",
        "Lcom/revenuecat/purchases/models/StoreProduct;",
        "product",
        "startGoogleProductCancellation",
        "(Landroid/content/Context;Lcom/revenuecat/purchases/models/StoreProduct;)V",
        "Landroid/net/Uri;",
        "managementURL",
        "startAmazonCancellation",
        "(Landroid/content/Context;Landroid/net/Uri;)V",
        "startManagementUrlCancellation",
        "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;",
        "path",
        "mainPathAction",
        "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;Landroid/content/Context;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;)V",
        "listenerName",
        "shouldResumeRestorePurchases",
        "(Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;Ljava/lang/String;LZd/e;)Ljava/lang/Object;",
        "selectedPurchaseInformation",
        "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen;",
        "screen",
        "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;",
        "localization",
        "",
        "supportedPaths",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;)Ljava/util/List;",
        "transformPathsOnSubscriptionState",
        "(Ljava/util/List;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;)Ljava/util/List;",
        "isPathAllowedForSubscriptionState",
        "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;)Z",
        "isPathAllowedForStore",
        "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;",
        "state",
        "computeMainScreenPaths",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;)Ljava/util/List;",
        "loadPurchases",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/utils/DateFormatter;Ljava/util/Locale;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;LZd/e;)Ljava/lang/Object;",
        "Lcom/revenuecat/purchases/CustomerInfo;",
        "customerInfo",
        "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails;",
        "findActiveTransactions",
        "(Lcom/revenuecat/purchases/CustomerInfo;)Ljava/util/List;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails$Subscription;",
        "findLatestExpiredSubscription",
        "(Lcom/revenuecat/purchases/CustomerInfo;)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails$Subscription;",
        "transaction",
        "Lcom/revenuecat/purchases/EntitlementInfo;",
        "entitlement",
        "createPurchaseInformation",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails;Lcom/revenuecat/purchases/EntitlementInfo;Lcom/revenuecat/purchases/ui/revenuecatui/utils/DateFormatter;Ljava/util/Locale;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;LZd/e;)Ljava/lang/Object;",
        "isRefresh",
        "loadCustomerCenter",
        "(ZLZd/e;)Ljava/lang/Object;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState;",
        "previousState",
        "preservingUIStateIfRefresh",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;ZLcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState;)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;",
        "launchRefreshIfPossible",
        "()V",
        "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;",
        "url",
        "surveyOptionID",
        "trackCustomerCenterEventOptionChosen",
        "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;Ljava/lang/String;Ljava/lang/String;)V",
        "LG1/i;",
        "getCurrentLocaleList",
        "()LG1/i;",
        "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey;",
        "feedbackSurvey",
        "Lkotlin/Function1;",
        "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey$Option;",
        "onAnswerSubmitted",
        "displayFeedbackSurvey",
        "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey;Lkotlin/jvm/functions/Function1;)V",
        "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;",
        "promotionalOffer",
        "Lcom/revenuecat/purchases/models/SubscriptionOption;",
        "getPromotionalSubscriptionOption",
        "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;Lcom/revenuecat/purchases/models/StoreProduct;LZd/e;)Ljava/lang/Object;",
        "targetProductId",
        "sourceBasePlan",
        "findTargetProduct",
        "(Ljava/lang/String;Ljava/lang/String;LZd/e;)Ljava/lang/Object;",
        "offerIdentifier",
        "targetProduct",
        "getCustomerCenterSubscriptionOption",
        "(Ljava/lang/String;Lcom/revenuecat/purchases/models/StoreProduct;)Lcom/revenuecat/purchases/models/SubscriptionOption;",
        "handlePromotionalOffer",
        "(Landroid/content/Context;Lcom/revenuecat/purchases/models/StoreProduct;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;LZd/e;)Ljava/lang/Object;",
        "goBackToMain",
        "resetToMainScreen",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;",
        "productId",
        "showManageSubscriptions",
        "(Landroid/content/Context;Ljava/lang/String;)V",
        "notifyListenersForRestoreStarted",
        "notifyListenersForRestoreCompleted",
        "(Lcom/revenuecat/purchases/CustomerInfo;)V",
        "Lcom/revenuecat/purchases/PurchasesError;",
        "error",
        "notifyListenersForRestoreFailed",
        "(Lcom/revenuecat/purchases/PurchasesError;)V",
        "notifyListenersForManageSubscription",
        "feedbackSurveyOptionId",
        "notifyListenersForFeedbackSurveyCompleted",
        "(Ljava/lang/String;)V",
        "notifyListenersForManagementOptionSelected",
        "(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;)V",
        "Lcom/revenuecat/purchases/customercenter/CustomActionData;",
        "customActionData",
        "notifyListenersForCustomActionSelected",
        "(Lcom/revenuecat/purchases/customercenter/CustomActionData;)V",
        "Lcom/revenuecat/purchases/models/StoreTransaction;",
        "notifyListenersForPromotionalOfferSucceeded",
        "(Lcom/revenuecat/purchases/CustomerInfo;Lcom/revenuecat/purchases/models/StoreTransaction;)V",
        "tryFallbackToCurrentOffering",
        "(Landroid/content/Context;)V",
        "Lcom/revenuecat/purchases/Offering;",
        "offering",
        "launchPaywallActivity",
        "(Landroid/content/Context;Lcom/revenuecat/purchases/Offering;)V",
        "message",
        "Lcom/revenuecat/purchases/PurchasesErrorCode;",
        "errorCode",
        "handlePaywallError",
        "(Ljava/lang/String;Lcom/revenuecat/purchases/PurchasesErrorCode;)V",
        "Lcom/revenuecat/purchases/SubscriptionInfo;",
        "asTransactionDetails",
        "(Lcom/revenuecat/purchases/SubscriptionInfo;)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails$Subscription;",
        "pathButtonPressed",
        "(Landroid/content/Context;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;)V",
        "purchase",
        "selectPurchase",
        "(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;)V",
        "onCustomActionSelected",
        "showVirtualCurrencyBalances",
        "showCreateSupportTicket",
        "dismissSupportTicketSuccessSnackbar",
        "dismissRestoreDialog",
        "(LZd/e;)Ljava/lang/Object;",
        "restorePurchases",
        "supportEmail",
        "contactSupport",
        "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$OpenMethod;",
        "method",
        "openURL",
        "(Landroid/content/Context;Ljava/lang/String;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$OpenMethod;)V",
        "clearActionError",
        "originalPath",
        "loadAndDisplayPromotionalOffer",
        "subscriptionOption",
        "Landroid/app/Activity;",
        "activity",
        "onAcceptedPromotionalOffer",
        "(Lcom/revenuecat/purchases/models/SubscriptionOption;Landroid/app/Activity;LZd/e;)Ljava/lang/Object;",
        "dismissPromotionalOffer",
        "(Landroid/content/Context;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;)V",
        "onDismiss",
        "onNavigationButtonPressed",
        "(Landroid/content/Context;Lie/a;)V",
        "refreshCustomerCenter",
        "isChangingConfigurations",
        "onActivityStopped",
        "(Z)V",
        "onActivityStarted",
        "onActivityResumed",
        "refreshStateIfLocaleChanged",
        "currentColorScheme",
        "isSystemInDarkTheme",
        "refreshColors",
        "(LU/l;Z)V",
        "trackImpressionIfNeeded",
        "showPaywall",
        "Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;",
        "Lcom/revenuecat/purchases/ui/revenuecatui/utils/DateFormatter;",
        "Ljava/util/Locale;",
        "LU/l;",
        "Z",
        "Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;",
        "Lcom/revenuecat/purchases/customercenter/events/CustomerCenterImpressionEvent$CreationData;",
        "impressionCreationData",
        "Lcom/revenuecat/purchases/customercenter/events/CustomerCenterImpressionEvent$CreationData;",
        "wasBackgrounded",
        "shouldRefreshOnResume",
        "LJf/u;",
        "_lastLocaleList",
        "LJf/u;",
        "_colorScheme",
        "_state",
        "LJf/I;",
        "LJf/I;",
        "getState",
        "()LJf/I;",
        "LY/C0;",
        "_actionError",
        "LY/C0;",
        "LY/h2;",
        "getActionError",
        "()LY/h2;",
        "actionError",
        "Companion",
        "revenuecatui_defaultsBc8Release"
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
.field public static final $stable:I

.field public static final Companion:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$Companion;

.field private static final STOP_FLOW_TIMEOUT:J = 0x1388L


# instance fields
.field private final _actionError:LY/C0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LY/C0;"
        }
    .end annotation
.end field

.field private final _colorScheme:LJf/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LJf/u;"
        }
    .end annotation
.end field

.field private final _lastLocaleList:LJf/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LJf/u;"
        }
    .end annotation
.end field

.field private final _state:LJf/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LJf/u;"
        }
    .end annotation
.end field

.field private final colorScheme:LU/l;

.field private final dateFormatter:Lcom/revenuecat/purchases/ui/revenuecatui/utils/DateFormatter;

.field private impressionCreationData:Lcom/revenuecat/purchases/customercenter/events/CustomerCenterImpressionEvent$CreationData;

.field private isDarkMode:Z

.field private final listener:Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;

.field private final locale:Ljava/util/Locale;

.field private final purchases:Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;

.field private shouldRefreshOnResume:Z

.field private final state:LJf/I;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LJf/I;"
        }
    .end annotation
.end field

.field private wasBackgrounded:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->Companion:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$Companion;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->$stable:I

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;Lcom/revenuecat/purchases/ui/revenuecatui/utils/DateFormatter;Ljava/util/Locale;LU/l;ZLcom/revenuecat/purchases/customercenter/CustomerCenterListener;)V
    .locals 7

    const-string v0, "purchases"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dateFormatter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "locale"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "colorScheme"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Landroidx/lifecycle/U;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->purchases:Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;

    .line 6
    iput-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->dateFormatter:Lcom/revenuecat/purchases/ui/revenuecatui/utils/DateFormatter;

    .line 7
    iput-object p3, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->locale:Ljava/util/Locale;

    .line 8
    iput-object p4, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->colorScheme:LU/l;

    .line 9
    iput-boolean p5, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->isDarkMode:Z

    .line 10
    iput-object p6, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->listener:Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;

    .line 11
    invoke-direct {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->getCurrentLocaleList()LG1/i;

    move-result-object p1

    invoke-static {p1}, LJf/K;->a(Ljava/lang/Object;)LJf/u;

    move-result-object p1

    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->_lastLocaleList:LJf/u;

    .line 12
    invoke-static {p4}, LJf/K;->a(Ljava/lang/Object;)LJf/u;

    move-result-object p1

    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->_colorScheme:LJf/u;

    .line 13
    sget-object p1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$NotLoaded;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$NotLoaded;

    invoke-static {p1}, LJf/K;->a(Ljava/lang/Object;)LJf/u;

    move-result-object p1

    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->_state:LJf/u;

    .line 14
    new-instance p2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$state$1;

    const/4 p3, 0x0

    invoke-direct {p2, p0, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$state$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;LZd/e;)V

    invoke-static {p1, p2}, LJf/g;->v(LJf/e;Lkotlin/jvm/functions/Function2;)LJf/e;

    move-result-object p1

    .line 15
    invoke-static {p0}, Landroidx/lifecycle/V;->a(Landroidx/lifecycle/U;)LGf/O;

    move-result-object p2

    .line 16
    sget-object v0, LJf/E;->a:LJf/E$a;

    const/4 v5, 0x2

    const/4 v6, 0x0

    const-wide/16 v1, 0x1388

    const-wide/16 v3, 0x0

    invoke-static/range {v0 .. v6}, LJf/E$a;->b(LJf/E$a;JJILjava/lang/Object;)LJf/E;

    move-result-object p4

    .line 17
    sget-object p5, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Loading;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Loading;

    .line 18
    invoke-static {p1, p2, p4, p5}, LJf/g;->w(LJf/e;LGf/O;LJf/E;Ljava/lang/Object;)LJf/I;

    move-result-object p1

    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->state:LJf/I;

    const/4 p1, 0x2

    .line 19
    invoke-static {p3, p3, p1, p3}, LY/U1;->i(Ljava/lang/Object;LY/T1;ILjava/lang/Object;)LY/C0;

    move-result-object p1

    iput-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->_actionError:LY/C0;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;Lcom/revenuecat/purchases/ui/revenuecatui/utils/DateFormatter;Ljava/util/Locale;LU/l;ZLcom/revenuecat/purchases/customercenter/CustomerCenterListener;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_0

    .line 1
    new-instance p2, Lcom/revenuecat/purchases/ui/revenuecatui/utils/DefaultDateFormatter;

    invoke-direct {p2}, Lcom/revenuecat/purchases/ui/revenuecatui/utils/DefaultDateFormatter;-><init>()V

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p7, 0x4

    if-eqz p2, :cond_1

    .line 2
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p3

    const-string p2, "getDefault()"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    move-object v3, p3

    and-int/lit8 p2, p7, 0x20

    if-eqz p2, :cond_2

    const/4 p6, 0x0

    :cond_2
    move-object v0, p0

    move-object v1, p1

    move-object v4, p4

    move v5, p5

    move-object v6, p6

    .line 3
    invoke-direct/range {v0 .. v6}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;Lcom/revenuecat/purchases/ui/revenuecatui/utils/DateFormatter;Ljava/util/Locale;LU/l;ZLcom/revenuecat/purchases/customercenter/CustomerCenterListener;)V

    return-void
.end method

.method public static final synthetic access$createPurchaseInformation(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails;Lcom/revenuecat/purchases/EntitlementInfo;Lcom/revenuecat/purchases/ui/revenuecatui/utils/DateFormatter;Ljava/util/Locale;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->createPurchaseInformation(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails;Lcom/revenuecat/purchases/EntitlementInfo;Lcom/revenuecat/purchases/ui/revenuecatui/utils/DateFormatter;Ljava/util/Locale;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;LZd/e;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$findTargetProduct(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;Ljava/lang/String;Ljava/lang/String;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->findTargetProduct(Ljava/lang/String;Ljava/lang/String;LZd/e;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getPromotionalSubscriptionOption(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;Lcom/revenuecat/purchases/models/StoreProduct;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->getPromotionalSubscriptionOption(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;Lcom/revenuecat/purchases/models/StoreProduct;LZd/e;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getPurchases$p(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;)Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->purchases:Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$get_state$p(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;)LJf/u;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->_state:LJf/u;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$goBackToMain(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->goBackToMain()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$handlePaywallError(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;Ljava/lang/String;Lcom/revenuecat/purchases/PurchasesErrorCode;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->handlePaywallError(Ljava/lang/String;Lcom/revenuecat/purchases/PurchasesErrorCode;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$handlePromotionalOffer(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;Landroid/content/Context;Lcom/revenuecat/purchases/models/StoreProduct;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->handlePromotionalOffer(Landroid/content/Context;Lcom/revenuecat/purchases/models/StoreProduct;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;LZd/e;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$handleSupportTicketSubmit(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;Ljava/lang/String;Ljava/lang/String;Lie/a;Lie/a;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->handleSupportTicketSubmit(Ljava/lang/String;Ljava/lang/String;Lie/a;Lie/a;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$launchPaywallActivity(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;Landroid/content/Context;Lcom/revenuecat/purchases/Offering;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->launchPaywallActivity(Landroid/content/Context;Lcom/revenuecat/purchases/Offering;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$loadCustomerCenter(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;ZLZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->loadCustomerCenter(ZLZd/e;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$loadPurchases(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;Lcom/revenuecat/purchases/ui/revenuecatui/utils/DateFormatter;Ljava/util/Locale;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->loadPurchases(Lcom/revenuecat/purchases/ui/revenuecatui/utils/DateFormatter;Ljava/util/Locale;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;LZd/e;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$mainPathAction(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;Landroid/content/Context;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->mainPathAction(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;Landroid/content/Context;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$notifyListenersForFeedbackSurveyCompleted(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->notifyListenersForFeedbackSurveyCompleted(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$shouldResumeRestorePurchases(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;Ljava/lang/String;LZd/e;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->shouldResumeRestorePurchases(Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;Ljava/lang/String;LZd/e;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$trackCustomerCenterEventOptionChosen(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->trackCustomerCenterEventOptionChosen(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final asTransactionDetails(Lcom/revenuecat/purchases/SubscriptionInfo;)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails$Subscription;
    .locals 11

    .line 1
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails$Subscription;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/revenuecat/purchases/SubscriptionInfo;->getProductIdentifier()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p1}, Lcom/revenuecat/purchases/SubscriptionInfo;->getProductPlanIdentifier()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {p1}, Lcom/revenuecat/purchases/SubscriptionInfo;->getStore()Lcom/revenuecat/purchases/Store;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-virtual {p1}, Lcom/revenuecat/purchases/SubscriptionInfo;->isActive()Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    invoke-virtual {p1}, Lcom/revenuecat/purchases/SubscriptionInfo;->getWillRenew()Z

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    invoke-virtual {p1}, Lcom/revenuecat/purchases/SubscriptionInfo;->getExpiresDate()Ljava/util/Date;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    invoke-virtual {p1}, Lcom/revenuecat/purchases/SubscriptionInfo;->getPeriodType()Lcom/revenuecat/purchases/PeriodType;

    .line 28
    .line 29
    .line 30
    move-result-object v7

    .line 31
    sget-object v8, Lcom/revenuecat/purchases/PeriodType;->TRIAL:Lcom/revenuecat/purchases/PeriodType;

    .line 32
    .line 33
    if-ne v7, v8, :cond_0

    .line 34
    .line 35
    const/4 v7, 0x1

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 v7, 0x0

    .line 38
    :goto_0
    invoke-virtual {p1}, Lcom/revenuecat/purchases/SubscriptionInfo;->getManagementURL()Landroid/net/Uri;

    .line 39
    .line 40
    .line 41
    move-result-object v8

    .line 42
    invoke-virtual {p1}, Lcom/revenuecat/purchases/SubscriptionInfo;->getPrice()Lcom/revenuecat/purchases/models/Price;

    .line 43
    .line 44
    .line 45
    move-result-object v9

    .line 46
    invoke-virtual {p1}, Lcom/revenuecat/purchases/SubscriptionInfo;->isSandbox()Z

    .line 47
    .line 48
    .line 49
    move-result v10

    .line 50
    invoke-direct/range {v0 .. v10}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails$Subscription;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/Store;ZZLjava/util/Date;ZLandroid/net/Uri;Lcom/revenuecat/purchases/models/Price;Z)V

    .line 51
    .line 52
    .line 53
    return-object v0
.end method

.method private final computeMainScreenPaths(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;",
            ")",
            "Ljava/util/List<",
            "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->getPurchases()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_2

    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->getPurchases()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;

    .line 39
    .line 40
    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;->isExpired()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-nez v1, :cond_1

    .line 45
    .line 46
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->getCustomerCenterConfigData()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-virtual {v0}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;->getManagementScreen()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    goto :goto_1

    .line 55
    :cond_2
    :goto_0
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->getCustomerCenterConfigData()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;->getNoActiveScreen()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    :goto_1
    const/4 v1, 0x1

    .line 64
    if-eqz v0, :cond_4

    .line 65
    .line 66
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->getPurchases()Ljava/util/List;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-ne v2, v1, :cond_3

    .line 75
    .line 76
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->getPurchases()Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-static {v2}, LUd/u;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    check-cast v2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_3
    const/4 v2, 0x0

    .line 88
    :goto_2
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->getCustomerCenterConfigData()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    invoke-virtual {v3}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;->getLocalization()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-direct {p0, v2, v0, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->supportedPaths(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;)Ljava/util/List;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    if-nez v0, :cond_5

    .line 101
    .line 102
    :cond_4
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    :cond_5
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->getPurchases()Ljava/util/List;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    if-le p1, v1, :cond_6

    .line 115
    .line 116
    sget-object p1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PathUtils;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PathUtils;

    .line 117
    .line 118
    invoke-virtual {p1, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PathUtils;->filterGeneralPaths(Ljava/util/List;)Ljava/util/List;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    return-object p1

    .line 123
    :cond_6
    return-object v0
.end method

.method private final createPurchaseInformation(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails;Lcom/revenuecat/purchases/EntitlementInfo;Lcom/revenuecat/purchases/ui/revenuecatui/utils/DateFormatter;Ljava/util/Locale;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;LZd/e;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails;",
            "Lcom/revenuecat/purchases/EntitlementInfo;",
            "Lcom/revenuecat/purchases/ui/revenuecatui/utils/DateFormatter;",
            "Ljava/util/Locale;",
            "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;",
            "LZd/e;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p6

    .line 2
    .line 3
    instance-of v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$createPurchaseInformation$1;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$createPurchaseInformation$1;

    .line 9
    .line 10
    iget v2, v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$createPurchaseInformation$1;->label:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$createPurchaseInformation$1;->label:I

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    new-instance v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$createPurchaseInformation$1;

    .line 23
    .line 24
    invoke-direct {v1, p0, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$createPurchaseInformation$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;LZd/e;)V

    .line 25
    .line 26
    .line 27
    :goto_0
    iget-object v0, v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$createPurchaseInformation$1;->result:Ljava/lang/Object;

    .line 28
    .line 29
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    iget v3, v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$createPurchaseInformation$1;->label:I

    .line 34
    .line 35
    const/4 v4, 0x1

    .line 36
    if-eqz v3, :cond_2

    .line 37
    .line 38
    if-ne v3, v4, :cond_1

    .line 39
    .line 40
    iget-object p1, v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$createPurchaseInformation$1;->L$4:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast p1, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;

    .line 43
    .line 44
    iget-object v2, v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$createPurchaseInformation$1;->L$3:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v2, Ljava/util/Locale;

    .line 47
    .line 48
    iget-object v3, v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$createPurchaseInformation$1;->L$2:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v3, Lcom/revenuecat/purchases/ui/revenuecatui/utils/DateFormatter;

    .line 51
    .line 52
    iget-object v4, v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$createPurchaseInformation$1;->L$1:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v4, Lcom/revenuecat/purchases/EntitlementInfo;

    .line 55
    .line 56
    iget-object v1, v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$createPurchaseInformation$1;->L$0:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails;

    .line 59
    .line 60
    invoke-static {v0}, LTd/v;->b(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    move-object v9, p1

    .line 64
    move-object p1, v1

    .line 65
    goto :goto_2

    .line 66
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 67
    .line 68
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 69
    .line 70
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw p1

    .line 74
    :cond_2
    invoke-static {v0}, LTd/v;->b(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails;->getStore()Lcom/revenuecat/purchases/Store;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    sget-object v3, Lcom/revenuecat/purchases/Store;->PLAY_STORE:Lcom/revenuecat/purchases/Store;

    .line 82
    .line 83
    const/4 v5, 0x0

    .line 84
    if-ne v0, v3, :cond_7

    .line 85
    .line 86
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->purchases:Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;

    .line 87
    .line 88
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails;->getProductIdentifier()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    instance-of v6, p1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails$Subscription;

    .line 93
    .line 94
    if-eqz v6, :cond_3

    .line 95
    .line 96
    move-object v6, p1

    .line 97
    check-cast v6, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails$Subscription;

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_3
    move-object v6, v5

    .line 101
    :goto_1
    if-eqz v6, :cond_4

    .line 102
    .line 103
    invoke-virtual {v6}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails$Subscription;->getProductPlanIdentifier()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    :cond_4
    iput-object p1, v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$createPurchaseInformation$1;->L$0:Ljava/lang/Object;

    .line 108
    .line 109
    iput-object p2, v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$createPurchaseInformation$1;->L$1:Ljava/lang/Object;

    .line 110
    .line 111
    move-object/from16 v7, p3

    .line 112
    .line 113
    iput-object v7, v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$createPurchaseInformation$1;->L$2:Ljava/lang/Object;

    .line 114
    .line 115
    move-object/from16 v8, p4

    .line 116
    .line 117
    iput-object v8, v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$createPurchaseInformation$1;->L$3:Ljava/lang/Object;

    .line 118
    .line 119
    move-object/from16 v9, p5

    .line 120
    .line 121
    iput-object v9, v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$createPurchaseInformation$1;->L$4:Ljava/lang/Object;

    .line 122
    .line 123
    iput v4, v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$createPurchaseInformation$1;->label:I

    .line 124
    .line 125
    invoke-interface {v0, v3, v5, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;->awaitGetProduct(Ljava/lang/String;Ljava/lang/String;LZd/e;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    if-ne v0, v2, :cond_5

    .line 130
    .line 131
    return-object v2

    .line 132
    :cond_5
    move-object v4, p2

    .line 133
    move-object v3, v7

    .line 134
    move-object v2, v8

    .line 135
    :goto_2
    move-object v5, v0

    .line 136
    check-cast v5, Lcom/revenuecat/purchases/models/StoreProduct;

    .line 137
    .line 138
    if-nez v5, :cond_6

    .line 139
    .line 140
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;

    .line 141
    .line 142
    new-instance v1, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 145
    .line 146
    .line 147
    const-string v6, "Could not find product, loading without product information: "

    .line 148
    .line 149
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails;->getProductIdentifier()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v6

    .line 156
    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    invoke-virtual {v0, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->w(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    :cond_6
    move-object v11, v2

    .line 167
    move-object v10, v3

    .line 168
    move-object v7, v4

    .line 169
    move-object v8, v5

    .line 170
    move-object v12, v9

    .line 171
    move-object v9, p1

    .line 172
    goto :goto_3

    .line 173
    :cond_7
    move-object/from16 v7, p3

    .line 174
    .line 175
    move-object/from16 v8, p4

    .line 176
    .line 177
    move-object/from16 v9, p5

    .line 178
    .line 179
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;

    .line 180
    .line 181
    new-instance v1, Ljava/lang/StringBuilder;

    .line 182
    .line 183
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 184
    .line 185
    .line 186
    const-string v2, "Active product is not from Google, loading without product information: "

    .line 187
    .line 188
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails;->getStore()Lcom/revenuecat/purchases/Store;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    invoke-virtual {v0, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->w(Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    move-object v10, v7

    .line 206
    move-object v11, v8

    .line 207
    move-object v7, p2

    .line 208
    move-object v12, v9

    .line 209
    move-object v9, p1

    .line 210
    move-object v8, v5

    .line 211
    :goto_3
    new-instance v6, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;

    .line 212
    .line 213
    invoke-direct/range {v6 .. v12}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;-><init>(Lcom/revenuecat/purchases/EntitlementInfo;Lcom/revenuecat/purchases/models/StoreProduct;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails;Lcom/revenuecat/purchases/ui/revenuecatui/utils/DateFormatter;Ljava/util/Locale;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;)V

    .line 214
    .line 215
    .line 216
    return-object v6
.end method

.method private final displayFeedbackSurvey(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey;Lkotlin/jvm/functions/Function1;)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->_state:LJf/u;

    .line 4
    .line 5
    :cond_0
    invoke-interface {v1}, LJf/u;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    move-object v3, v2

    .line 10
    check-cast v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState;

    .line 11
    .line 12
    instance-of v4, v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 13
    .line 14
    if-eqz v4, :cond_1

    .line 15
    .line 16
    new-instance v4, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterDestination$FeedbackSurvey;

    .line 17
    .line 18
    new-instance v5, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/FeedbackSurveyData;

    .line 19
    .line 20
    move-object/from16 v6, p1

    .line 21
    .line 22
    move-object/from16 v7, p2

    .line 23
    .line 24
    invoke-direct {v5, v6, v7}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/FeedbackSurveyData;-><init>(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey;Lkotlin/jvm/functions/Function1;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v6}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey;->getTitle()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v8

    .line 31
    invoke-direct {v4, v5, v8}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterDestination$FeedbackSurvey;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/FeedbackSurveyData;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    move-object v9, v3

    .line 35
    check-cast v9, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 36
    .line 37
    invoke-virtual {v9}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->getNavigationState()Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterNavigationState;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {v3, v4}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterNavigationState;->push(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterDestination;)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterNavigationState;

    .line 42
    .line 43
    .line 44
    move-result-object v16

    .line 45
    sget-object v17, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$NavigationButtonType;->BACK:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$NavigationButtonType;

    .line 46
    .line 47
    const/16 v21, 0x73f

    .line 48
    .line 49
    const/16 v22, 0x0

    .line 50
    .line 51
    const/4 v10, 0x0

    .line 52
    const/4 v11, 0x0

    .line 53
    const/4 v12, 0x0

    .line 54
    const/4 v13, 0x0

    .line 55
    const/4 v14, 0x0

    .line 56
    const/4 v15, 0x0

    .line 57
    const/16 v18, 0x0

    .line 58
    .line 59
    const/16 v19, 0x0

    .line 60
    .line 61
    const/16 v20, 0x0

    .line 62
    .line 63
    invoke-static/range {v9 .. v22}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->copy$default(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesState;Lcom/revenuecat/purchases/Offering;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterNavigationState;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$NavigationButtonType;Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;ZZILjava/lang/Object;)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    goto :goto_0

    .line 68
    :cond_1
    move-object/from16 v6, p1

    .line 69
    .line 70
    move-object/from16 v7, p2

    .line 71
    .line 72
    :goto_0
    invoke-interface {v1, v2, v3}, LJf/u;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-eqz v2, :cond_0

    .line 77
    .line 78
    return-void
.end method

.method private final findActiveTransactions(Lcom/revenuecat/purchases/CustomerInfo;)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/CustomerInfo;",
            ")",
            "Ljava/util/List<",
            "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/revenuecat/purchases/CustomerInfo;->getSubscriptionsByProductIdentifier()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/lang/Iterable;

    .line 10
    .line 11
    new-instance v1, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    move-object v3, v2

    .line 31
    check-cast v3, Lcom/revenuecat/purchases/SubscriptionInfo;

    .line 32
    .line 33
    invoke-virtual {v3}, Lcom/revenuecat/purchases/SubscriptionInfo;->isActive()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_0

    .line 38
    .line 39
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$findActiveTransactions$$inlined$sortedBy$1;

    .line 44
    .line 45
    invoke-direct {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$findActiveTransactions$$inlined$sortedBy$1;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-static {v1, v0}, LUd/u;->R0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    new-instance v1, Ljava/util/ArrayList;

    .line 53
    .line 54
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    if-eqz v3, :cond_3

    .line 66
    .line 67
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    move-object v4, v3

    .line 72
    check-cast v4, Lcom/revenuecat/purchases/SubscriptionInfo;

    .line 73
    .line 74
    invoke-virtual {v4}, Lcom/revenuecat/purchases/SubscriptionInfo;->getStore()Lcom/revenuecat/purchases/Store;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    sget-object v5, Lcom/revenuecat/purchases/Store;->PLAY_STORE:Lcom/revenuecat/purchases/Store;

    .line 79
    .line 80
    if-ne v4, v5, :cond_2

    .line 81
    .line 82
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_3
    invoke-virtual {p1}, Lcom/revenuecat/purchases/CustomerInfo;->getNonSubscriptionTransactions()Ljava/util/List;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    new-instance v3, Ljava/util/ArrayList;

    .line 91
    .line 92
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 93
    .line 94
    .line 95
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object v2

    .line 99
    :cond_4
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    if-eqz v4, :cond_5

    .line 104
    .line 105
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    move-object v5, v4

    .line 110
    check-cast v5, Lcom/revenuecat/purchases/models/Transaction;

    .line 111
    .line 112
    invoke-virtual {v5}, Lcom/revenuecat/purchases/models/Transaction;->getStore()Lcom/revenuecat/purchases/Store;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    sget-object v6, Lcom/revenuecat/purchases/Store;->PLAY_STORE:Lcom/revenuecat/purchases/Store;

    .line 117
    .line 118
    if-ne v5, v6, :cond_4

    .line 119
    .line 120
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_5
    new-instance v2, Ljava/util/ArrayList;

    .line 125
    .line 126
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 127
    .line 128
    .line 129
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    :cond_6
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 134
    .line 135
    .line 136
    move-result v4

    .line 137
    if-eqz v4, :cond_7

    .line 138
    .line 139
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    move-object v5, v4

    .line 144
    check-cast v5, Lcom/revenuecat/purchases/SubscriptionInfo;

    .line 145
    .line 146
    invoke-virtual {v5}, Lcom/revenuecat/purchases/SubscriptionInfo;->getStore()Lcom/revenuecat/purchases/Store;

    .line 147
    .line 148
    .line 149
    move-result-object v5

    .line 150
    sget-object v6, Lcom/revenuecat/purchases/Store;->PLAY_STORE:Lcom/revenuecat/purchases/Store;

    .line 151
    .line 152
    if-eq v5, v6, :cond_6

    .line 153
    .line 154
    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_7
    invoke-virtual {p1}, Lcom/revenuecat/purchases/CustomerInfo;->getNonSubscriptionTransactions()Ljava/util/List;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    new-instance v0, Ljava/util/ArrayList;

    .line 163
    .line 164
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 165
    .line 166
    .line 167
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    :cond_8
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 172
    .line 173
    .line 174
    move-result v4

    .line 175
    if-eqz v4, :cond_9

    .line 176
    .line 177
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v4

    .line 181
    move-object v5, v4

    .line 182
    check-cast v5, Lcom/revenuecat/purchases/models/Transaction;

    .line 183
    .line 184
    invoke-virtual {v5}, Lcom/revenuecat/purchases/models/Transaction;->getStore()Lcom/revenuecat/purchases/Store;

    .line 185
    .line 186
    .line 187
    move-result-object v5

    .line 188
    sget-object v6, Lcom/revenuecat/purchases/Store;->PLAY_STORE:Lcom/revenuecat/purchases/Store;

    .line 189
    .line 190
    if-eq v5, v6, :cond_8

    .line 191
    .line 192
    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    goto :goto_4

    .line 196
    :cond_9
    invoke-static {v1, v3}, LUd/u;->I0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    invoke-static {p1, v2}, LUd/u;->I0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    invoke-static {p1, v0}, LUd/u;->I0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    new-instance v0, Ljava/util/ArrayList;

    .line 209
    .line 210
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 211
    .line 212
    .line 213
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 214
    .line 215
    .line 216
    move-result-object p1

    .line 217
    :cond_a
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 218
    .line 219
    .line 220
    move-result v1

    .line 221
    if-eqz v1, :cond_d

    .line 222
    .line 223
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    instance-of v2, v1, Lcom/revenuecat/purchases/SubscriptionInfo;

    .line 228
    .line 229
    if-eqz v2, :cond_b

    .line 230
    .line 231
    check-cast v1, Lcom/revenuecat/purchases/SubscriptionInfo;

    .line 232
    .line 233
    invoke-direct {p0, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->asTransactionDetails(Lcom/revenuecat/purchases/SubscriptionInfo;)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails$Subscription;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    goto :goto_6

    .line 238
    :cond_b
    instance-of v2, v1, Lcom/revenuecat/purchases/models/Transaction;

    .line 239
    .line 240
    if-eqz v2, :cond_c

    .line 241
    .line 242
    new-instance v2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails$NonSubscription;

    .line 243
    .line 244
    check-cast v1, Lcom/revenuecat/purchases/models/Transaction;

    .line 245
    .line 246
    invoke-virtual {v1}, Lcom/revenuecat/purchases/models/Transaction;->getProductIdentifier()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v3

    .line 250
    invoke-virtual {v1}, Lcom/revenuecat/purchases/models/Transaction;->getStore()Lcom/revenuecat/purchases/Store;

    .line 251
    .line 252
    .line 253
    move-result-object v4

    .line 254
    invoke-virtual {v1}, Lcom/revenuecat/purchases/models/Transaction;->getPrice()Lcom/revenuecat/purchases/models/Price;

    .line 255
    .line 256
    .line 257
    move-result-object v5

    .line 258
    invoke-virtual {v1}, Lcom/revenuecat/purchases/models/Transaction;->isSandbox()Z

    .line 259
    .line 260
    .line 261
    move-result v1

    .line 262
    invoke-direct {v2, v3, v4, v5, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails$NonSubscription;-><init>(Ljava/lang/String;Lcom/revenuecat/purchases/Store;Lcom/revenuecat/purchases/models/Price;Z)V

    .line 263
    .line 264
    .line 265
    move-object v1, v2

    .line 266
    goto :goto_6

    .line 267
    :cond_c
    const/4 v1, 0x0

    .line 268
    :goto_6
    if-eqz v1, :cond_a

    .line 269
    .line 270
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    goto :goto_5

    .line 274
    :cond_d
    return-object v0
.end method

.method private final findLatestExpiredSubscription(Lcom/revenuecat/purchases/CustomerInfo;)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails$Subscription;
    .locals 6

    .line 1
    invoke-virtual {p1}, Lcom/revenuecat/purchases/CustomerInfo;->getSubscriptionsByProductIdentifier()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-interface {p1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Ljava/lang/Iterable;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    move-object v2, v1

    .line 31
    check-cast v2, Lcom/revenuecat/purchases/SubscriptionInfo;

    .line 32
    .line 33
    invoke-virtual {v2}, Lcom/revenuecat/purchases/SubscriptionInfo;->isActive()Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-nez v3, :cond_0

    .line 38
    .line 39
    invoke-virtual {v2}, Lcom/revenuecat/purchases/SubscriptionInfo;->getExpiresDate()Ljava/util/Date;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    if-eqz v2, :cond_0

    .line 44
    .line 45
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    const/4 v1, 0x0

    .line 58
    if-nez v0, :cond_2

    .line 59
    .line 60
    move-object v0, v1

    .line 61
    goto :goto_1

    .line 62
    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-nez v2, :cond_3

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_3
    move-object v2, v0

    .line 74
    check-cast v2, Lcom/revenuecat/purchases/SubscriptionInfo;

    .line 75
    .line 76
    invoke-virtual {v2}, Lcom/revenuecat/purchases/SubscriptionInfo;->getExpiresDate()Ljava/util/Date;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-static {v2}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    move-object v4, v3

    .line 88
    check-cast v4, Lcom/revenuecat/purchases/SubscriptionInfo;

    .line 89
    .line 90
    invoke-virtual {v4}, Lcom/revenuecat/purchases/SubscriptionInfo;->getExpiresDate()Ljava/util/Date;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    invoke-static {v4}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    invoke-interface {v2, v4}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    if-gez v5, :cond_5

    .line 102
    .line 103
    move-object v0, v3

    .line 104
    move-object v2, v4

    .line 105
    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    if-nez v3, :cond_4

    .line 110
    .line 111
    :goto_1
    check-cast v0, Lcom/revenuecat/purchases/SubscriptionInfo;

    .line 112
    .line 113
    if-eqz v0, :cond_6

    .line 114
    .line 115
    invoke-direct {p0, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->asTransactionDetails(Lcom/revenuecat/purchases/SubscriptionInfo;)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails$Subscription;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    return-object p1

    .line 120
    :cond_6
    return-object v1
.end method

.method private final findTargetProduct(Ljava/lang/String;Ljava/lang/String;LZd/e;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "LZd/e;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$findTargetProduct$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$findTargetProduct$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$findTargetProduct$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$findTargetProduct$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$findTargetProduct$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$findTargetProduct$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;LZd/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$findTargetProduct$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$findTargetProduct$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    invoke-static {p3}, LTd/v;->b(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_2

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p3}, LTd/v;->b(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    const-string p3, ":"

    .line 54
    .line 55
    filled-new-array {p3}, [Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    const/4 v8, 0x6

    .line 60
    const/4 v9, 0x0

    .line 61
    const/4 v6, 0x0

    .line 62
    const/4 v7, 0x0

    .line 63
    move-object v4, p1

    .line 64
    invoke-static/range {v4 .. v9}, LDf/r;->N0(Ljava/lang/CharSequence;[Ljava/lang/String;ZIILjava/lang/Object;)Ljava/util/List;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-static {p1}, LUd/u;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p3

    .line 72
    check-cast p3, Ljava/lang/String;

    .line 73
    .line 74
    invoke-static {p1, v3}, LUd/u;->p0(Ljava/util/List;I)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    check-cast p1, Ljava/lang/String;

    .line 79
    .line 80
    if-nez p1, :cond_3

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_3
    move-object p2, p1

    .line 84
    :goto_1
    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->purchases:Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;

    .line 85
    .line 86
    iput v3, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$findTargetProduct$1;->label:I

    .line 87
    .line 88
    invoke-interface {p1, p3, p2, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;->awaitGetProduct(Ljava/lang/String;Ljava/lang/String;LZd/e;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p3

    .line 92
    if-ne p3, v1, :cond_4

    .line 93
    .line 94
    return-object v1

    .line 95
    :cond_4
    :goto_2
    check-cast p3, Lcom/revenuecat/purchases/models/StoreProduct;

    .line 96
    .line 97
    return-object p3
.end method

.method private final getCurrentLocaleList()LG1/i;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->purchases:Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;

    .line 2
    .line 3
    invoke-interface {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;->getPreferredUILocaleOverride()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, LG1/i;->d()LG1/i;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, "getDefault()"

    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_0
    :try_start_0
    invoke-static {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/LocaleHelpersKt;->createLocaleFromString(Ljava/lang/String;)Ljava/util/Locale;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    filled-new-array {v1}, [Ljava/util/Locale;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-static {v1}, LG1/i;->a([Ljava/util/Locale;)LG1/i;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const-string v2, "{\n            val locale\u2026.create(locale)\n        }"

    .line 32
    .line 33
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 34
    .line 35
    .line 36
    return-object v1

    .line 37
    :catch_0
    sget-object v1, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;

    .line 38
    .line 39
    new-instance v2, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 42
    .line 43
    .line 44
    const-string v3, "Invalid preferred locale format: "

    .line 45
    .line 46
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v0, ". Using system default."

    .line 53
    .line 54
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v1, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->w(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-static {}, LG1/i;->d()LG1/i;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    const-string v1, "{\n            Logger.w(\"\u2026at.getDefault()\n        }"

    .line 69
    .line 70
    invoke-static {v0, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return-object v0
.end method

.method private final getCustomerCenterSubscriptionOption(Ljava/lang/String;Lcom/revenuecat/purchases/models/StoreProduct;)Lcom/revenuecat/purchases/models/SubscriptionOption;
    .locals 5

    .line 1
    invoke-interface {p2}, Lcom/revenuecat/purchases/models/StoreProduct;->getSubscriptionOptions()Lcom/revenuecat/purchases/models/SubscriptionOptions;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    const/4 v0, 0x0

    .line 6
    if-eqz p2, :cond_2

    .line 7
    .line 8
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    move-object v2, v1

    .line 23
    check-cast v2, Lcom/revenuecat/purchases/models/SubscriptionOption;

    .line 24
    .line 25
    instance-of v3, v2, Lcom/revenuecat/purchases/models/GoogleSubscriptionOption;

    .line 26
    .line 27
    if-eqz v3, :cond_0

    .line 28
    .line 29
    invoke-interface {v2}, Lcom/revenuecat/purchases/models/SubscriptionOption;->getTags()Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    const-string v4, "rc-customer-center"

    .line 34
    .line 35
    invoke-interface {v3, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_0

    .line 40
    .line 41
    check-cast v2, Lcom/revenuecat/purchases/models/GoogleSubscriptionOption;

    .line 42
    .line 43
    invoke-virtual {v2}, Lcom/revenuecat/purchases/models/GoogleSubscriptionOption;->getOfferId()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-static {v2, p1}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_0

    .line 52
    .line 53
    move-object v0, v1

    .line 54
    :cond_1
    check-cast v0, Lcom/revenuecat/purchases/models/SubscriptionOption;

    .line 55
    .line 56
    :cond_2
    return-object v0
.end method

.method private final getPromotionalSubscriptionOption(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;Lcom/revenuecat/purchases/models/StoreProduct;LZd/e;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;",
            "Lcom/revenuecat/purchases/models/StoreProduct;",
            "LZd/e;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$getPromotionalSubscriptionOption$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$getPromotionalSubscriptionOption$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$getPromotionalSubscriptionOption$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$getPromotionalSubscriptionOption$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$getPromotionalSubscriptionOption$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$getPromotionalSubscriptionOption$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;LZd/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$getPromotionalSubscriptionOption$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$getPromotionalSubscriptionOption$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    const/4 v4, 0x0

    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    iget-object p1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$getPromotionalSubscriptionOption$1;->L$2:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$CrossProductPromotion;

    .line 42
    .line 43
    iget-object p2, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$getPromotionalSubscriptionOption$1;->L$1:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p2, Lcom/revenuecat/purchases/models/StoreProduct;

    .line 46
    .line 47
    iget-object v0, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$getPromotionalSubscriptionOption$1;->L$0:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;

    .line 50
    .line 51
    invoke-static {p3}, LTd/v;->b(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    goto/16 :goto_4

    .line 55
    .line 56
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 57
    .line 58
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 59
    .line 60
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    throw p1

    .line 64
    :cond_2
    invoke-static {p3}, LTd/v;->b(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    invoke-static {p2}, Lcom/revenuecat/purchases/models/GoogleStoreProductKt;->getGoogleProduct(Lcom/revenuecat/purchases/models/StoreProduct;)Lcom/revenuecat/purchases/models/GoogleStoreProduct;

    .line 68
    .line 69
    .line 70
    move-result-object p3

    .line 71
    invoke-virtual {p1}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;->getCrossProductPromotions()Ljava/util/Map;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-interface {p2}, Lcom/revenuecat/purchases/models/StoreProduct;->getId()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    invoke-interface {v2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    check-cast v2, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$CrossProductPromotion;

    .line 84
    .line 85
    if-nez v2, :cond_4

    .line 86
    .line 87
    if-eqz p3, :cond_3

    .line 88
    .line 89
    invoke-virtual {p1}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;->getCrossProductPromotions()Ljava/util/Map;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-virtual {p3}, Lcom/revenuecat/purchases/models/GoogleStoreProduct;->getProductId()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v5

    .line 97
    invoke-interface {v2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    check-cast v2, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$CrossProductPromotion;

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_3
    move-object v2, v4

    .line 105
    :goto_1
    if-nez v2, :cond_4

    .line 106
    .line 107
    invoke-virtual {p1}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;->getProductMapping()Ljava/util/Map;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-interface {p2}, Lcom/revenuecat/purchases/models/StoreProduct;->getId()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    check-cast p1, Ljava/lang/String;

    .line 120
    .line 121
    if-eqz p1, :cond_5

    .line 122
    .line 123
    new-instance v2, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$CrossProductPromotion;

    .line 124
    .line 125
    invoke-interface {p2}, Lcom/revenuecat/purchases/models/StoreProduct;->getId()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    invoke-direct {v2, p1, v5}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$CrossProductPromotion;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    :cond_4
    move-object p1, v2

    .line 133
    goto :goto_2

    .line 134
    :cond_5
    move-object p1, v4

    .line 135
    :goto_2
    if-nez p1, :cond_6

    .line 136
    .line 137
    sget-object p1, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;

    .line 138
    .line 139
    new-instance p3, Ljava/lang/StringBuilder;

    .line 140
    .line 141
    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    .line 142
    .line 143
    .line 144
    const-string v0, "No promotional offer configured for product "

    .line 145
    .line 146
    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-interface {p2}, Lcom/revenuecat/purchases/models/StoreProduct;->getId()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p2

    .line 153
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p2

    .line 160
    invoke-virtual {p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->d(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    return-object v4

    .line 164
    :cond_6
    invoke-virtual {p1}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$CrossProductPromotion;->getTargetProductId()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    invoke-interface {p2}, Lcom/revenuecat/purchases/models/StoreProduct;->getId()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    invoke-static {v2, v5}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v2

    .line 176
    if-eqz v2, :cond_7

    .line 177
    .line 178
    move-object v0, p0

    .line 179
    move-object p3, p2

    .line 180
    goto :goto_5

    .line 181
    :cond_7
    if-eqz p3, :cond_8

    .line 182
    .line 183
    invoke-virtual {p3}, Lcom/revenuecat/purchases/models/GoogleStoreProduct;->getBasePlanId()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    goto :goto_3

    .line 188
    :cond_8
    move-object v2, v4

    .line 189
    :goto_3
    if-eqz v2, :cond_a

    .line 190
    .line 191
    invoke-virtual {p1}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$CrossProductPromotion;->getTargetProductId()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    invoke-virtual {p3}, Lcom/revenuecat/purchases/models/GoogleStoreProduct;->getBasePlanId()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object p3

    .line 199
    invoke-static {p3}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 200
    .line 201
    .line 202
    iput-object p0, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$getPromotionalSubscriptionOption$1;->L$0:Ljava/lang/Object;

    .line 203
    .line 204
    iput-object p2, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$getPromotionalSubscriptionOption$1;->L$1:Ljava/lang/Object;

    .line 205
    .line 206
    iput-object p1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$getPromotionalSubscriptionOption$1;->L$2:Ljava/lang/Object;

    .line 207
    .line 208
    iput v3, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$getPromotionalSubscriptionOption$1;->label:I

    .line 209
    .line 210
    invoke-direct {p0, v2, p3, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->findTargetProduct(Ljava/lang/String;Ljava/lang/String;LZd/e;)Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object p3

    .line 214
    if-ne p3, v1, :cond_9

    .line 215
    .line 216
    return-object v1

    .line 217
    :cond_9
    move-object v0, p0

    .line 218
    :goto_4
    check-cast p3, Lcom/revenuecat/purchases/models/StoreProduct;

    .line 219
    .line 220
    move-object v6, p3

    .line 221
    move-object p3, p2

    .line 222
    move-object p2, v6

    .line 223
    goto :goto_5

    .line 224
    :cond_a
    move-object v0, p0

    .line 225
    move-object p3, p2

    .line 226
    move-object p2, v4

    .line 227
    :goto_5
    if-nez p2, :cond_b

    .line 228
    .line 229
    sget-object p2, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;

    .line 230
    .line 231
    new-instance v0, Ljava/lang/StringBuilder;

    .line 232
    .line 233
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 234
    .line 235
    .line 236
    const-string v1, "Could not find discount of product ("

    .line 237
    .line 238
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {p1}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$CrossProductPromotion;->getTargetProductId()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object p1

    .line 245
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    const-string p1, ") for active subscription "

    .line 249
    .line 250
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    invoke-interface {p3}, Lcom/revenuecat/purchases/models/StoreProduct;->getId()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object p1

    .line 257
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object p1

    .line 264
    invoke-virtual {p2, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->d(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    return-object v4

    .line 268
    :cond_b
    invoke-virtual {p1}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer$CrossProductPromotion;->getStoreOfferIdentifier()Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object p1

    .line 272
    invoke-direct {v0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->getCustomerCenterSubscriptionOption(Ljava/lang/String;Lcom/revenuecat/purchases/models/StoreProduct;)Lcom/revenuecat/purchases/models/SubscriptionOption;

    .line 273
    .line 274
    .line 275
    move-result-object p1

    .line 276
    return-object p1
.end method

.method private final goBackToMain()V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->_state:LJf/u;

    .line 2
    .line 3
    :cond_0
    invoke-interface {v0}, LJf/u;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    move-object v2, v1

    .line 8
    check-cast v2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState;

    .line 9
    .line 10
    instance-of v3, v2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 11
    .line 12
    if-eqz v3, :cond_1

    .line 13
    .line 14
    check-cast v2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 15
    .line 16
    invoke-direct {p0, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->resetToMainScreen(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    :cond_1
    invoke-interface {v0, v1, v2}, LJf/u;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    return-void
.end method

.method private final handleCancelPath(Landroid/content/Context;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->_state:LJf/u;

    .line 2
    .line 3
    invoke-interface {v0}, LJf/u;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    instance-of v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    check-cast v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v0, v2

    .line 16
    :goto_0
    if-nez v0, :cond_1

    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    if-nez p2, :cond_4

    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->getCurrentDestination()Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterDestination;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    instance-of v1, p2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterDestination$SelectedPurchaseDetail;

    .line 26
    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    check-cast p2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterDestination$SelectedPurchaseDetail;

    .line 30
    .line 31
    invoke-virtual {p2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterDestination$SelectedPurchaseDetail;->getPurchaseInformation()Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    goto :goto_1

    .line 36
    :cond_2
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->getPurchases()Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    const/4 v1, 0x1

    .line 45
    if-ne p2, v1, :cond_3

    .line 46
    .line 47
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->getPurchases()Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    invoke-static {p2}, LUd/u;->m0(Ljava/util/List;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    check-cast p2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_3
    move-object p2, v2

    .line 59
    :cond_4
    :goto_1
    if-eqz p2, :cond_5

    .line 60
    .line 61
    invoke-virtual {p2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;->getStore()Lcom/revenuecat/purchases/Store;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    goto :goto_2

    .line 66
    :cond_5
    move-object v0, v2

    .line 67
    :goto_2
    sget-object v1, Lcom/revenuecat/purchases/Store;->PLAY_STORE:Lcom/revenuecat/purchases/Store;

    .line 68
    .line 69
    if-ne v0, v1, :cond_6

    .line 70
    .line 71
    invoke-virtual {p2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;->getProduct()Lcom/revenuecat/purchases/models/StoreProduct;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    if-eqz v0, :cond_6

    .line 76
    .line 77
    invoke-virtual {p2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;->getProduct()Lcom/revenuecat/purchases/models/StoreProduct;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    invoke-direct {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->startGoogleProductCancellation(Landroid/content/Context;Lcom/revenuecat/purchases/models/StoreProduct;)V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :cond_6
    if-eqz p2, :cond_7

    .line 86
    .line 87
    invoke-virtual {p2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;->getStore()Lcom/revenuecat/purchases/Store;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    goto :goto_3

    .line 92
    :cond_7
    move-object v0, v2

    .line 93
    :goto_3
    sget-object v1, Lcom/revenuecat/purchases/Store;->AMAZON:Lcom/revenuecat/purchases/Store;

    .line 94
    .line 95
    if-ne v0, v1, :cond_8

    .line 96
    .line 97
    invoke-virtual {p2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;->getManagementURL()Landroid/net/Uri;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    if-eqz v0, :cond_8

    .line 102
    .line 103
    invoke-virtual {p2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;->getManagementURL()Landroid/net/Uri;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    invoke-direct {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->startAmazonCancellation(Landroid/content/Context;Landroid/net/Uri;)V

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :cond_8
    if-eqz p2, :cond_9

    .line 112
    .line 113
    invoke-virtual {p2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;->getManagementURL()Landroid/net/Uri;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    :cond_9
    if-eqz v2, :cond_a

    .line 118
    .line 119
    invoke-virtual {p2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;->getManagementURL()Landroid/net/Uri;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    invoke-direct {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->startManagementUrlCancellation(Landroid/content/Context;Landroid/net/Uri;)V

    .line 124
    .line 125
    .line 126
    return-void

    .line 127
    :cond_a
    sget-object p1, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;

    .line 128
    .line 129
    const-string p2, "No product or management URL available for cancel path"

    .line 130
    .line 131
    invoke-virtual {p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->e(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    return-void
.end method

.method static synthetic handleCancelPath$default(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;Landroid/content/Context;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;ILjava/lang/Object;)V
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
    invoke-direct {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->handleCancelPath(Landroid/content/Context;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private final handlePaywallError(Ljava/lang/String;Lcom/revenuecat/purchases/PurchasesErrorCode;)V
    .locals 2

    .line 1
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->e(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->_actionError:LY/C0;

    .line 7
    .line 8
    new-instance v1, Lcom/revenuecat/purchases/PurchasesError;

    .line 9
    .line 10
    invoke-direct {v1, p2, p1}, Lcom/revenuecat/purchases/PurchasesError;-><init>(Lcom/revenuecat/purchases/PurchasesErrorCode;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, v1}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method private final handlePromotionalOffer(Landroid/content/Context;Lcom/revenuecat/purchases/models/StoreProduct;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;LZd/e;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/revenuecat/purchases/models/StoreProduct;",
            "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;",
            "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;",
            "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;",
            "LZd/e;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    invoke-virtual/range {p0 .. p6}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->loadAndDisplayPromotionalOffer(Landroid/content/Context;Lcom/revenuecat/purchases/models/StoreProduct;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;LZd/e;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method private final handleSupportTicketSubmit(Ljava/lang/String;Ljava/lang/String;Lie/a;Lie/a;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lie/a;",
            "Lie/a;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->_state:LJf/u;

    .line 2
    .line 3
    invoke-interface {v0}, LJf/u;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState;

    .line 8
    .line 9
    instance-of v0, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    invoke-static {p0}, Landroidx/lifecycle/V;->a(Landroidx/lifecycle/U;)LGf/O;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    new-instance v2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$handleSupportTicketSubmit$1;

    .line 19
    .line 20
    const/4 v8, 0x0

    .line 21
    move-object v5, p0

    .line 22
    move-object v3, p1

    .line 23
    move-object v4, p2

    .line 24
    move-object v6, p3

    .line 25
    move-object v7, p4

    .line 26
    invoke-direct/range {v2 .. v8}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$handleSupportTicketSubmit$1;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;Lie/a;Lie/a;LZd/e;)V

    .line 27
    .line 28
    .line 29
    const/4 v5, 0x3

    .line 30
    const/4 v6, 0x0

    .line 31
    move-object v4, v2

    .line 32
    const/4 v2, 0x0

    .line 33
    const/4 v3, 0x0

    .line 34
    invoke-static/range {v1 .. v6}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 35
    .line 36
    .line 37
    return-void
.end method

.method private final isPathAllowedForStore(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;)Z
    .locals 4

    .line 1
    invoke-virtual {p1}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;->getType()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    aget p1, v0, p1

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    const/4 v1, 0x0

    .line 15
    packed-switch p1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    new-instance p1, LTd/r;

    .line 19
    .line 20
    invoke-direct {p1}, LTd/r;-><init>()V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :pswitch_0
    return v1

    .line 25
    :pswitch_1
    const/4 p1, 0x0

    .line 26
    if-eqz p2, :cond_0

    .line 27
    .line 28
    invoke-virtual {p2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;->getStore()Lcom/revenuecat/purchases/Store;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move-object v2, p1

    .line 34
    :goto_0
    sget-object v3, Lcom/revenuecat/purchases/Store;->PLAY_STORE:Lcom/revenuecat/purchases/Store;

    .line 35
    .line 36
    if-eq v2, v3, :cond_3

    .line 37
    .line 38
    if-eqz p2, :cond_1

    .line 39
    .line 40
    invoke-virtual {p2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;->getManagementURL()Landroid/net/Uri;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    :cond_1
    if-eqz p1, :cond_2

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    return v1

    .line 48
    :cond_3
    :goto_1
    :pswitch_2
    return v0

    .line 49
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_2
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private final isPathAllowedForSubscriptionState(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;->getType()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    sget-object v0, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;->CANCEL:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    if-ne p1, v0, :cond_1

    .line 9
    .line 10
    if-eqz p2, :cond_0

    .line 11
    .line 12
    invoke-virtual {p2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;->isSubscription()Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-ne p1, v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;->isExpired()Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-nez p1, :cond_0

    .line 23
    .line 24
    return v1

    .line 25
    :cond_0
    const/4 p1, 0x0

    .line 26
    return p1

    .line 27
    :cond_1
    return v1
.end method

.method private final launchPaywallActivity(Landroid/content/Context;Lcom/revenuecat/purchases/Offering;)V
    .locals 13

    .line 1
    :try_start_0
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string v2, "Showing paywall for offering: "

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p2}, Lcom/revenuecat/purchases/Offering;->getIdentifier()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->d(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    new-instance v2, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityArgs;

    .line 28
    .line 29
    new-instance v4, Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection$IdAndPresentedOfferingContext;

    .line 30
    .line 31
    invoke-virtual {p2}, Lcom/revenuecat/purchases/Offering;->getIdentifier()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {p2}, Lcom/revenuecat/purchases/Offering;->getAvailablePackages()Ljava/util/List;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-static {v3}, LUd/u;->o0(Ljava/util/List;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    check-cast v3, Lcom/revenuecat/purchases/Package;

    .line 44
    .line 45
    if-eqz v3, :cond_0

    .line 46
    .line 47
    invoke-virtual {v3}, Lcom/revenuecat/purchases/Package;->getPresentedOfferingContext()Lcom/revenuecat/purchases/PresentedOfferingContext;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    goto :goto_0

    .line 52
    :catch_0
    move-exception v0

    .line 53
    move-object p1, v0

    .line 54
    goto :goto_1

    .line 55
    :catch_1
    move-exception v0

    .line 56
    move-object p1, v0

    .line 57
    goto :goto_2

    .line 58
    :catch_2
    move-exception v0

    .line 59
    move-object p1, v0

    .line 60
    goto :goto_3

    .line 61
    :cond_0
    const/4 v3, 0x0

    .line 62
    :goto_0
    invoke-direct {v4, v1, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection$IdAndPresentedOfferingContext;-><init>(Ljava/lang/String;Lcom/revenuecat/purchases/PresentedOfferingContext;)V

    .line 63
    .line 64
    .line 65
    const/16 v11, 0xf5

    .line 66
    .line 67
    const/4 v12, 0x0

    .line 68
    const/4 v3, 0x0

    .line 69
    const/4 v5, 0x0

    .line 70
    const/4 v6, 0x1

    .line 71
    const/4 v7, 0x0

    .line 72
    const/4 v8, 0x0

    .line 73
    const/4 v9, 0x0

    .line 74
    const/4 v10, 0x0

    .line 75
    invoke-direct/range {v2 .. v12}, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivityArgs;-><init>(Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/OfferingSelection$IdAndPresentedOfferingContext;Ljava/util/Map;ZZZLjava/util/Map;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 76
    .line 77
    .line 78
    new-instance v1, Landroid/content/Intent;

    .line 79
    .line 80
    const-class v3, Lcom/revenuecat/purchases/ui/revenuecatui/activity/PaywallActivity;

    .line 81
    .line 82
    invoke-direct {v1, p1, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 83
    .line 84
    .line 85
    const-string v3, "paywall_args"

    .line 86
    .line 87
    invoke-virtual {v1, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 88
    .line 89
    .line 90
    const/high16 v2, 0x10000000

    .line 91
    .line 92
    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 96
    .line 97
    .line 98
    new-instance p1, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 101
    .line 102
    .line 103
    const-string v1, "Successfully launched paywall for offering: "

    .line 104
    .line 105
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {p2}, Lcom/revenuecat/purchases/Offering;->getIdentifier()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-virtual {v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->d(Ljava/lang/String;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :goto_1
    new-instance p2, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 126
    .line 127
    .line 128
    const-string v0, "Invalid argument for paywall: "

    .line 129
    .line 130
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    sget-object p2, Lcom/revenuecat/purchases/PurchasesErrorCode;->UnknownError:Lcom/revenuecat/purchases/PurchasesErrorCode;

    .line 145
    .line 146
    invoke-direct {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->handlePaywallError(Ljava/lang/String;Lcom/revenuecat/purchases/PurchasesErrorCode;)V

    .line 147
    .line 148
    .line 149
    goto :goto_4

    .line 150
    :goto_2
    new-instance p2, Ljava/lang/StringBuilder;

    .line 151
    .line 152
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 153
    .line 154
    .line 155
    const-string v0, "Security error launching paywall: "

    .line 156
    .line 157
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    sget-object p2, Lcom/revenuecat/purchases/PurchasesErrorCode;->UnknownError:Lcom/revenuecat/purchases/PurchasesErrorCode;

    .line 172
    .line 173
    invoke-direct {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->handlePaywallError(Ljava/lang/String;Lcom/revenuecat/purchases/PurchasesErrorCode;)V

    .line 174
    .line 175
    .line 176
    goto :goto_4

    .line 177
    :goto_3
    new-instance p2, Ljava/lang/StringBuilder;

    .line 178
    .line 179
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 180
    .line 181
    .line 182
    const-string v0, "PaywallActivity not found: "

    .line 183
    .line 184
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 192
    .line 193
    .line 194
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object p1

    .line 198
    sget-object p2, Lcom/revenuecat/purchases/PurchasesErrorCode;->ConfigurationError:Lcom/revenuecat/purchases/PurchasesErrorCode;

    .line 199
    .line 200
    invoke-direct {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->handlePaywallError(Ljava/lang/String;Lcom/revenuecat/purchases/PurchasesErrorCode;)V

    .line 201
    .line 202
    .line 203
    :goto_4
    return-void
.end method

.method private final launchRefreshIfPossible()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->_state:LJf/u;

    .line 2
    .line 3
    invoke-interface {v0}, LJf/u;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState;

    .line 8
    .line 9
    instance-of v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    check-cast v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->isRefreshing()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    invoke-static {p0}, Landroidx/lifecycle/V;->a(Landroidx/lifecycle/U;)LGf/O;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    new-instance v4, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$launchRefreshIfPossible$1;

    .line 26
    .line 27
    const/4 v0, 0x0

    .line 28
    invoke-direct {v4, p0, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$launchRefreshIfPossible$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;LZd/e;)V

    .line 29
    .line 30
    .line 31
    const/4 v5, 0x3

    .line 32
    const/4 v6, 0x0

    .line 33
    const/4 v2, 0x0

    .line 34
    const/4 v3, 0x0

    .line 35
    invoke-static/range {v1 .. v6}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 36
    .line 37
    .line 38
    :cond_0
    return-void
.end method

.method private final loadCustomerCenter(ZLZd/e;)Ljava/lang/Object;
    .locals 28
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "LZd/e;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v0, p2

    instance-of v3, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadCustomerCenter$2;

    if-eqz v3, :cond_0

    move-object v3, v0

    check-cast v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadCustomerCenter$2;

    iget v4, v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadCustomerCenter$2;->label:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadCustomerCenter$2;->label:I

    goto :goto_0

    :cond_0
    new-instance v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadCustomerCenter$2;

    invoke-direct {v3, v1, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadCustomerCenter$2;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;LZd/e;)V

    :goto_0
    iget-object v0, v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadCustomerCenter$2;->result:Ljava/lang/Object;

    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    move-result-object v4

    .line 2
    iget v5, v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadCustomerCenter$2;->label:I

    const/4 v6, 0x4

    const/4 v7, 0x3

    const/4 v8, 0x2

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eqz v5, :cond_5

    if-eq v5, v10, :cond_4

    if-eq v5, v8, :cond_3

    if-eq v5, v7, :cond_2

    if-ne v5, v6, :cond_1

    iget-boolean v2, v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadCustomerCenter$2;->Z$0:Z

    iget-object v4, v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadCustomerCenter$2;->L$3:Ljava/lang/Object;

    check-cast v4, Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;

    iget-object v5, v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadCustomerCenter$2;->L$2:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    iget-object v6, v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadCustomerCenter$2;->L$1:Ljava/lang/Object;

    check-cast v6, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;

    iget-object v3, v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadCustomerCenter$2;->L$0:Ljava/lang/Object;

    check-cast v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;

    :try_start_0
    invoke-static {v0}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/revenuecat/purchases/PurchasesException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_a

    :catch_0
    move-exception v0

    goto/16 :goto_c

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-boolean v2, v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadCustomerCenter$2;->Z$0:Z

    iget-object v5, v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadCustomerCenter$2;->L$2:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    iget-object v7, v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadCustomerCenter$2;->L$1:Ljava/lang/Object;

    check-cast v7, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;

    iget-object v8, v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadCustomerCenter$2;->L$0:Ljava/lang/Object;

    check-cast v8, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;

    :try_start_1
    invoke-static {v0}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Lcom/revenuecat/purchases/PurchasesException; {:try_start_1 .. :try_end_1} :catch_1

    goto/16 :goto_7

    :catch_1
    move-exception v0

    :goto_1
    move-object v1, v0

    :goto_2
    move v5, v2

    goto/16 :goto_11

    :cond_3
    iget-boolean v2, v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadCustomerCenter$2;->Z$0:Z

    iget-object v5, v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadCustomerCenter$2;->L$1:Ljava/lang/Object;

    check-cast v5, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;

    iget-object v8, v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadCustomerCenter$2;->L$0:Ljava/lang/Object;

    check-cast v8, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;

    :try_start_2
    invoke-static {v0}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_2
    .catch Lcom/revenuecat/purchases/PurchasesException; {:try_start_2 .. :try_end_2} :catch_1

    goto/16 :goto_6

    :cond_4
    iget-boolean v2, v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadCustomerCenter$2;->Z$0:Z

    iget-object v5, v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadCustomerCenter$2;->L$0:Ljava/lang/Object;

    check-cast v5, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;

    :try_start_3
    invoke-static {v0}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_3
    .catch Lcom/revenuecat/purchases/PurchasesException; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_5

    :catch_2
    move-exception v0

    move-object v1, v0

    move-object v8, v5

    goto :goto_2

    :cond_5
    invoke-static {v0}, LTd/v;->b(Ljava/lang/Object;)V

    .line 3
    iget-object v0, v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->_state:LJf/u;

    .line 4
    :goto_3
    invoke-interface {v0}, LJf/u;->getValue()Ljava/lang/Object;

    move-result-object v5

    .line 5
    move-object v11, v5

    check-cast v11, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState;

    if-eqz v2, :cond_6

    .line 6
    instance-of v12, v11, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    if-eqz v12, :cond_6

    .line 7
    move-object v13, v11

    check-cast v13, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    const/16 v25, 0x3ff

    const/16 v26, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x1

    invoke-static/range {v13 .. v26}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->copy$default(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesState;Lcom/revenuecat/purchases/Offering;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterNavigationState;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$NavigationButtonType;Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;ZZILjava/lang/Object;)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    move-result-object v11

    goto :goto_4

    .line 8
    :cond_6
    instance-of v12, v11, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Loading;

    if-nez v12, :cond_7

    .line 9
    sget-object v11, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Loading;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Loading;

    .line 10
    :cond_7
    :goto_4
    invoke-interface {v0, v5, v11}, LJf/u;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_11

    .line 11
    :try_start_4
    iget-object v0, v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->purchases:Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;

    iput-object v1, v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadCustomerCenter$2;->L$0:Ljava/lang/Object;

    iput-boolean v2, v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadCustomerCenter$2;->Z$0:Z

    iput v10, v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadCustomerCenter$2;->label:I

    invoke-interface {v0, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;->awaitCustomerCenterConfigData(LZd/e;)Ljava/lang/Object;

    move-result-object v0
    :try_end_4
    .catch Lcom/revenuecat/purchases/PurchasesException; {:try_start_4 .. :try_end_4} :catch_7

    if-ne v0, v4, :cond_8

    goto/16 :goto_9

    :cond_8
    move-object v5, v1

    .line 12
    :goto_5
    :try_start_5
    check-cast v0, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;

    .line 13
    iget-object v11, v5, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->dateFormatter:Lcom/revenuecat/purchases/ui/revenuecatui/utils/DateFormatter;

    .line 14
    iget-object v12, v5, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->locale:Ljava/util/Locale;

    .line 15
    invoke-virtual {v0}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;->getLocalization()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;

    move-result-object v13

    .line 16
    iput-object v5, v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadCustomerCenter$2;->L$0:Ljava/lang/Object;

    iput-object v0, v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadCustomerCenter$2;->L$1:Ljava/lang/Object;

    iput-boolean v2, v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadCustomerCenter$2;->Z$0:Z

    iput v8, v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadCustomerCenter$2;->label:I

    invoke-direct {v5, v11, v12, v13, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->loadPurchases(Lcom/revenuecat/purchases/ui/revenuecatui/utils/DateFormatter;Ljava/util/Locale;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;LZd/e;)Ljava/lang/Object;

    move-result-object v8
    :try_end_5
    .catch Lcom/revenuecat/purchases/PurchasesException; {:try_start_5 .. :try_end_5} :catch_2

    if-ne v8, v4, :cond_9

    goto :goto_9

    :cond_9
    move-object/from16 v27, v5

    move-object v5, v0

    move-object v0, v8

    move-object/from16 v8, v27

    .line 17
    :goto_6
    :try_start_6
    check-cast v0, Ljava/util/List;

    .line 18
    invoke-virtual {v5}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;->getSupport()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support;

    move-result-object v11

    invoke-virtual {v11}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support;->getDisplayVirtualCurrencies()Ljava/lang/Boolean;

    move-result-object v11

    invoke-static {v10}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    move-result-object v10

    invoke-static {v11, v10}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_b

    .line 19
    iget-object v10, v8, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->purchases:Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;

    invoke-interface {v10}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;->invalidateVirtualCurrenciesCache()V

    .line 20
    iget-object v10, v8, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->purchases:Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;

    iput-object v8, v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadCustomerCenter$2;->L$0:Ljava/lang/Object;

    iput-object v5, v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadCustomerCenter$2;->L$1:Ljava/lang/Object;

    iput-object v0, v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadCustomerCenter$2;->L$2:Ljava/lang/Object;

    iput-boolean v2, v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadCustomerCenter$2;->Z$0:Z

    iput v7, v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadCustomerCenter$2;->label:I

    invoke-interface {v10, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;->awaitGetVirtualCurrencies(LZd/e;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v4, :cond_a

    goto :goto_9

    :cond_a
    move-object/from16 v27, v5

    move-object v5, v0

    move-object v0, v7

    move-object/from16 v7, v27

    :goto_7
    check-cast v0, Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;

    move-object v10, v7

    move-object v7, v5

    move-object v5, v0

    goto :goto_8

    :cond_b
    move-object v7, v0

    move-object v10, v5

    move-object v5, v9

    .line 21
    :goto_8
    invoke-virtual {v10}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;->getNoActiveScreen()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen;

    move-result-object v0
    :try_end_6
    .catch Lcom/revenuecat/purchases/PurchasesException; {:try_start_6 .. :try_end_6} :catch_1

    if-eqz v0, :cond_d

    .line 22
    :try_start_7
    iget-object v11, v8, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->purchases:Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;

    iput-object v8, v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadCustomerCenter$2;->L$0:Ljava/lang/Object;

    iput-object v10, v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadCustomerCenter$2;->L$1:Ljava/lang/Object;

    iput-object v7, v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadCustomerCenter$2;->L$2:Ljava/lang/Object;

    iput-object v5, v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadCustomerCenter$2;->L$3:Ljava/lang/Object;

    iput-boolean v2, v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadCustomerCenter$2;->Z$0:Z

    iput v6, v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadCustomerCenter$2;->label:I

    invoke-static {v0, v11, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/ScreenOfferingExtensionsKt;->resolveOfferingSuspend(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen;Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;LZd/e;)Ljava/lang/Object;

    move-result-object v0
    :try_end_7
    .catch Lcom/revenuecat/purchases/PurchasesException; {:try_start_7 .. :try_end_7} :catch_3

    if-ne v0, v4, :cond_c

    :goto_9
    return-object v4

    :cond_c
    move-object v4, v5

    move-object v5, v7

    move-object v3, v8

    move-object v6, v10

    :goto_a
    :try_start_8
    check-cast v0, Lcom/revenuecat/purchases/Offering;
    :try_end_8
    .catch Lcom/revenuecat/purchases/PurchasesException; {:try_start_8 .. :try_end_8} :catch_0

    move-object v9, v0

    :goto_b
    move-object v7, v5

    move-object v10, v6

    move-object v5, v4

    goto :goto_d

    :catch_3
    move-exception v0

    move-object v4, v5

    move-object v5, v7

    move-object v3, v8

    move-object v6, v10

    .line 23
    :goto_c
    :try_start_9
    sget-object v7, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Failed to resolve NO_ACTIVE screen offering: "

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->d(Ljava/lang/String;)V
    :try_end_9
    .catch Lcom/revenuecat/purchases/PurchasesException; {:try_start_9 .. :try_end_9} :catch_4

    goto :goto_b

    :goto_d
    move-object v8, v3

    :cond_d
    move-object v12, v5

    move-object v5, v7

    move-object v4, v10

    goto :goto_e

    :catch_4
    move-exception v0

    move-object v1, v0

    move v5, v2

    move-object v8, v3

    goto/16 :goto_11

    .line 24
    :goto_e
    :try_start_a
    new-instance v13, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 25
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    move-result-object v6

    .line 26
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    move-result-object v7
    :try_end_a
    .catch Lcom/revenuecat/purchases/PurchasesException; {:try_start_a .. :try_end_a} :catch_6

    const/16 v15, 0x2d0

    const/16 v16, 0x0

    move-object v3, v8

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v14, v3

    move-object v3, v13

    const/4 v13, 0x0

    move-object/from16 v17, v14

    const/4 v14, 0x0

    move-object/from16 v1, v17

    .line 27
    :try_start_b
    invoke-direct/range {v3 .. v16}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;-><init>(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesState;Lcom/revenuecat/purchases/Offering;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterNavigationState;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$NavigationButtonType;Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 28
    invoke-direct {v1, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->computeMainScreenPaths(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;)Ljava/util/List;

    move-result-object v16

    .line 29
    iget-object v0, v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->_state:LJf/u;

    .line 30
    :goto_f
    invoke-interface {v0}, LJf/u;->getValue()Ljava/lang/Object;

    move-result-object v4

    .line 31
    move-object v5, v4

    check-cast v5, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState;

    const/16 v25, 0x7fb

    const/16 v26, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object v13, v3

    .line 32
    invoke-static/range {v13 .. v26}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->copy$default(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesState;Lcom/revenuecat/purchases/Offering;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterNavigationState;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$NavigationButtonType;Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;ZZILjava/lang/Object;)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    move-result-object v3

    .line 33
    invoke-direct {v1, v3, v2, v5}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->preservingUIStateIfRefresh(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;ZLcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState;)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    move-result-object v3

    .line 34
    invoke-interface {v0, v4, v3}, LJf/u;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3
    :try_end_b
    .catch Lcom/revenuecat/purchases/PurchasesException; {:try_start_b .. :try_end_b} :catch_5

    if-eqz v3, :cond_e

    goto :goto_13

    :cond_e
    move-object v3, v13

    goto :goto_f

    :catch_5
    move-exception v0

    move-object v8, v1

    :goto_10
    move v5, v2

    move-object v1, v0

    goto :goto_11

    :catch_6
    move-exception v0

    move-object v1, v8

    goto :goto_10

    :catch_7
    move-exception v0

    move-object/from16 v8, p0

    goto/16 :goto_1

    .line 35
    :goto_11
    iget-object v11, v8, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->_state:LJf/u;

    .line 36
    :cond_f
    invoke-interface {v11}, LJf/u;->getValue()Ljava/lang/Object;

    move-result-object v0

    .line 37
    move-object v2, v0

    check-cast v2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState;

    if-eqz v5, :cond_10

    .line 38
    instance-of v3, v2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    if-eqz v3, :cond_10

    .line 39
    sget-object v3, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;

    const-string v4, "Error refreshing Customer Center data, keeping existing state"

    invoke-virtual {v3, v4, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 40
    move-object v12, v2

    check-cast v12, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    const/16 v24, 0x3ff

    const/16 v25, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-static/range {v12 .. v25}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->copy$default(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesState;Lcom/revenuecat/purchases/Offering;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterNavigationState;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$NavigationButtonType;Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;ZZILjava/lang/Object;)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    move-result-object v2

    goto :goto_12

    .line 41
    :cond_10
    new-instance v2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Error;

    invoke-virtual {v1}, Lcom/revenuecat/purchases/PurchasesException;->getError()Lcom/revenuecat/purchases/PurchasesError;

    move-result-object v3

    invoke-direct {v2, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Error;-><init>(Lcom/revenuecat/purchases/PurchasesError;)V

    .line 42
    :goto_12
    invoke-interface {v11, v0, v2}, LJf/u;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 43
    :goto_13
    sget-object v0, LTd/L;->a:LTd/L;

    return-object v0

    :cond_11
    move-object/from16 v1, p0

    goto/16 :goto_3
.end method

.method private final loadPurchases(Lcom/revenuecat/purchases/ui/revenuecatui/utils/DateFormatter;Ljava/util/Locale;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;LZd/e;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/ui/revenuecatui/utils/DateFormatter;",
            "Ljava/util/Locale;",
            "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;",
            "LZd/e;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p4

    .line 4
    .line 5
    instance-of v2, v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadPurchases$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadPurchases$1;

    .line 11
    .line 12
    iget v3, v2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadPurchases$1;->label:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadPurchases$1;->label:I

    .line 22
    .line 23
    :goto_0
    move-object v9, v2

    .line 24
    goto :goto_1

    .line 25
    :cond_0
    new-instance v2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadPurchases$1;

    .line 26
    .line 27
    invoke-direct {v2, v0, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadPurchases$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;LZd/e;)V

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :goto_1
    iget-object v1, v9, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadPurchases$1;->result:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    iget v3, v9, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadPurchases$1;->label:I

    .line 38
    .line 39
    const/4 v4, 0x3

    .line 40
    const/4 v5, 0x2

    .line 41
    const/4 v6, 0x1

    .line 42
    if-eqz v3, :cond_4

    .line 43
    .line 44
    if-eq v3, v6, :cond_3

    .line 45
    .line 46
    if-eq v3, v5, :cond_2

    .line 47
    .line 48
    if-ne v3, v4, :cond_1

    .line 49
    .line 50
    invoke-static {v1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    goto/16 :goto_8

    .line 54
    .line 55
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 56
    .line 57
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw v1

    .line 63
    :cond_2
    iget-object v3, v9, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadPurchases$1;->L$7:Ljava/lang/Object;

    .line 64
    .line 65
    check-cast v3, Ljava/util/Collection;

    .line 66
    .line 67
    iget-object v4, v9, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadPurchases$1;->L$6:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v4, Ljava/util/Iterator;

    .line 70
    .line 71
    iget-object v6, v9, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadPurchases$1;->L$5:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v6, Ljava/util/Collection;

    .line 74
    .line 75
    iget-object v8, v9, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadPurchases$1;->L$4:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v8, Lcom/revenuecat/purchases/CustomerInfo;

    .line 78
    .line 79
    iget-object v10, v9, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadPurchases$1;->L$3:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v10, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;

    .line 82
    .line 83
    iget-object v11, v9, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadPurchases$1;->L$2:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v11, Ljava/util/Locale;

    .line 86
    .line 87
    iget-object v12, v9, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadPurchases$1;->L$1:Ljava/lang/Object;

    .line 88
    .line 89
    check-cast v12, Lcom/revenuecat/purchases/ui/revenuecatui/utils/DateFormatter;

    .line 90
    .line 91
    iget-object v13, v9, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadPurchases$1;->L$0:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v13, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;

    .line 94
    .line 95
    invoke-static {v1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    move-object v14, v12

    .line 99
    move-object v12, v11

    .line 100
    move-object v11, v14

    .line 101
    move-object v14, v9

    .line 102
    goto/16 :goto_5

    .line 103
    .line 104
    :cond_3
    iget-object v3, v9, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadPurchases$1;->L$3:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v3, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;

    .line 107
    .line 108
    iget-object v6, v9, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadPurchases$1;->L$2:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast v6, Ljava/util/Locale;

    .line 111
    .line 112
    iget-object v8, v9, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadPurchases$1;->L$1:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v8, Lcom/revenuecat/purchases/ui/revenuecatui/utils/DateFormatter;

    .line 115
    .line 116
    iget-object v10, v9, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadPurchases$1;->L$0:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v10, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;

    .line 119
    .line 120
    invoke-static {v1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    move-object/from16 v16, v8

    .line 124
    .line 125
    move-object v8, v3

    .line 126
    move-object v3, v10

    .line 127
    move-object v10, v6

    .line 128
    move-object/from16 v6, v16

    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_4
    invoke-static {v1}, LTd/v;->b(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    iget-object v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->purchases:Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;

    .line 135
    .line 136
    sget-object v3, Lcom/revenuecat/purchases/CacheFetchPolicy;->FETCH_CURRENT:Lcom/revenuecat/purchases/CacheFetchPolicy;

    .line 137
    .line 138
    iput-object v0, v9, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadPurchases$1;->L$0:Ljava/lang/Object;

    .line 139
    .line 140
    move-object/from16 v8, p1

    .line 141
    .line 142
    iput-object v8, v9, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadPurchases$1;->L$1:Ljava/lang/Object;

    .line 143
    .line 144
    move-object/from16 v10, p2

    .line 145
    .line 146
    iput-object v10, v9, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadPurchases$1;->L$2:Ljava/lang/Object;

    .line 147
    .line 148
    move-object/from16 v11, p3

    .line 149
    .line 150
    iput-object v11, v9, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadPurchases$1;->L$3:Ljava/lang/Object;

    .line 151
    .line 152
    iput v6, v9, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadPurchases$1;->label:I

    .line 153
    .line 154
    invoke-interface {v1, v3, v9}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;->awaitCustomerInfo(Lcom/revenuecat/purchases/CacheFetchPolicy;LZd/e;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    if-ne v1, v2, :cond_5

    .line 159
    .line 160
    goto/16 :goto_7

    .line 161
    .line 162
    :cond_5
    move-object v3, v0

    .line 163
    move-object v6, v8

    .line 164
    move-object v8, v11

    .line 165
    :goto_2
    check-cast v1, Lcom/revenuecat/purchases/CustomerInfo;

    .line 166
    .line 167
    invoke-virtual {v1}, Lcom/revenuecat/purchases/CustomerInfo;->getActiveSubscriptions()Ljava/util/Set;

    .line 168
    .line 169
    .line 170
    move-result-object v11

    .line 171
    check-cast v11, Ljava/util/Collection;

    .line 172
    .line 173
    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    .line 174
    .line 175
    .line 176
    move-result v11

    .line 177
    invoke-virtual {v1}, Lcom/revenuecat/purchases/CustomerInfo;->getNonSubscriptionTransactions()Ljava/util/List;

    .line 178
    .line 179
    .line 180
    move-result-object v12

    .line 181
    invoke-interface {v12}, Ljava/util/Collection;->isEmpty()Z

    .line 182
    .line 183
    .line 184
    move-result v12

    .line 185
    if-eqz v11, :cond_6

    .line 186
    .line 187
    if-nez v12, :cond_c

    .line 188
    .line 189
    :cond_6
    invoke-direct {v3, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->findActiveTransactions(Lcom/revenuecat/purchases/CustomerInfo;)Ljava/util/List;

    .line 190
    .line 191
    .line 192
    move-result-object v11

    .line 193
    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    .line 194
    .line 195
    .line 196
    move-result v12

    .line 197
    if-nez v12, :cond_b

    .line 198
    .line 199
    new-instance v4, Ljava/util/ArrayList;

    .line 200
    .line 201
    const/16 v12, 0xa

    .line 202
    .line 203
    invoke-static {v11, v12}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 204
    .line 205
    .line 206
    move-result v12

    .line 207
    invoke-direct {v4, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 208
    .line 209
    .line 210
    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 211
    .line 212
    .line 213
    move-result-object v11

    .line 214
    move-object v13, v8

    .line 215
    move-object v14, v9

    .line 216
    move-object v12, v10

    .line 217
    move-object v8, v3

    .line 218
    move-object v3, v4

    .line 219
    move-object v4, v11

    .line 220
    move-object v11, v6

    .line 221
    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 222
    .line 223
    .line 224
    move-result v6

    .line 225
    if-eqz v6, :cond_a

    .line 226
    .line 227
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v6

    .line 231
    move-object v9, v6

    .line 232
    check-cast v9, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails;

    .line 233
    .line 234
    invoke-virtual {v1}, Lcom/revenuecat/purchases/CustomerInfo;->getEntitlements()Lcom/revenuecat/purchases/EntitlementInfos;

    .line 235
    .line 236
    .line 237
    move-result-object v6

    .line 238
    invoke-virtual {v6}, Lcom/revenuecat/purchases/EntitlementInfos;->getAll()Ljava/util/Map;

    .line 239
    .line 240
    .line 241
    move-result-object v6

    .line 242
    invoke-interface {v6}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 243
    .line 244
    .line 245
    move-result-object v6

    .line 246
    check-cast v6, Ljava/lang/Iterable;

    .line 247
    .line 248
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 249
    .line 250
    .line 251
    move-result-object v6

    .line 252
    :cond_7
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 253
    .line 254
    .line 255
    move-result v10

    .line 256
    if-eqz v10, :cond_8

    .line 257
    .line 258
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v10

    .line 262
    move-object v15, v10

    .line 263
    check-cast v15, Lcom/revenuecat/purchases/EntitlementInfo;

    .line 264
    .line 265
    invoke-virtual {v15}, Lcom/revenuecat/purchases/EntitlementInfo;->getProductIdentifier()Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v15

    .line 269
    invoke-virtual {v9}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails;->getProductIdentifier()Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v7

    .line 273
    invoke-static {v15, v7}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    move-result v7

    .line 277
    if-eqz v7, :cond_7

    .line 278
    .line 279
    goto :goto_4

    .line 280
    :cond_8
    const/4 v10, 0x0

    .line 281
    :goto_4
    check-cast v10, Lcom/revenuecat/purchases/EntitlementInfo;

    .line 282
    .line 283
    iput-object v8, v14, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadPurchases$1;->L$0:Ljava/lang/Object;

    .line 284
    .line 285
    iput-object v11, v14, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadPurchases$1;->L$1:Ljava/lang/Object;

    .line 286
    .line 287
    iput-object v12, v14, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadPurchases$1;->L$2:Ljava/lang/Object;

    .line 288
    .line 289
    iput-object v13, v14, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadPurchases$1;->L$3:Ljava/lang/Object;

    .line 290
    .line 291
    iput-object v1, v14, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadPurchases$1;->L$4:Ljava/lang/Object;

    .line 292
    .line 293
    iput-object v3, v14, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadPurchases$1;->L$5:Ljava/lang/Object;

    .line 294
    .line 295
    iput-object v4, v14, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadPurchases$1;->L$6:Ljava/lang/Object;

    .line 296
    .line 297
    iput-object v3, v14, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadPurchases$1;->L$7:Ljava/lang/Object;

    .line 298
    .line 299
    iput v5, v14, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadPurchases$1;->label:I

    .line 300
    .line 301
    invoke-direct/range {v8 .. v14}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->createPurchaseInformation(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails;Lcom/revenuecat/purchases/EntitlementInfo;Lcom/revenuecat/purchases/ui/revenuecatui/utils/DateFormatter;Ljava/util/Locale;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;LZd/e;)Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v6

    .line 305
    if-ne v6, v2, :cond_9

    .line 306
    .line 307
    goto/16 :goto_7

    .line 308
    .line 309
    :cond_9
    move-object v10, v13

    .line 310
    move-object v13, v8

    .line 311
    move-object v8, v1

    .line 312
    move-object v1, v6

    .line 313
    move-object v6, v3

    .line 314
    :goto_5
    check-cast v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;

    .line 315
    .line 316
    invoke-interface {v3, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 317
    .line 318
    .line 319
    move-object v3, v6

    .line 320
    move-object v1, v8

    .line 321
    move-object v8, v13

    .line 322
    move-object v13, v10

    .line 323
    goto :goto_3

    .line 324
    :cond_a
    check-cast v3, Ljava/util/List;

    .line 325
    .line 326
    return-object v3

    .line 327
    :cond_b
    sget-object v5, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;

    .line 328
    .line 329
    const-string v7, "Could not find subscription information"

    .line 330
    .line 331
    invoke-virtual {v5, v7}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->w(Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    :cond_c
    invoke-direct {v3, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->findLatestExpiredSubscription(Lcom/revenuecat/purchases/CustomerInfo;)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails$Subscription;

    .line 335
    .line 336
    .line 337
    move-result-object v5

    .line 338
    if-eqz v5, :cond_10

    .line 339
    .line 340
    invoke-virtual {v1}, Lcom/revenuecat/purchases/CustomerInfo;->getEntitlements()Lcom/revenuecat/purchases/EntitlementInfos;

    .line 341
    .line 342
    .line 343
    move-result-object v1

    .line 344
    invoke-virtual {v1}, Lcom/revenuecat/purchases/EntitlementInfos;->getAll()Ljava/util/Map;

    .line 345
    .line 346
    .line 347
    move-result-object v1

    .line 348
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 349
    .line 350
    .line 351
    move-result-object v1

    .line 352
    check-cast v1, Ljava/lang/Iterable;

    .line 353
    .line 354
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 355
    .line 356
    .line 357
    move-result-object v1

    .line 358
    :cond_d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 359
    .line 360
    .line 361
    move-result v7

    .line 362
    if-eqz v7, :cond_e

    .line 363
    .line 364
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v7

    .line 368
    move-object v11, v7

    .line 369
    check-cast v11, Lcom/revenuecat/purchases/EntitlementInfo;

    .line 370
    .line 371
    invoke-virtual {v11}, Lcom/revenuecat/purchases/EntitlementInfo;->getProductIdentifier()Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v11

    .line 375
    invoke-virtual {v5}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails$Subscription;->getProductIdentifier()Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v12

    .line 379
    invoke-static {v11, v12}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 380
    .line 381
    .line 382
    move-result v11

    .line 383
    if-eqz v11, :cond_d

    .line 384
    .line 385
    goto :goto_6

    .line 386
    :cond_e
    const/4 v7, 0x0

    .line 387
    :goto_6
    check-cast v7, Lcom/revenuecat/purchases/EntitlementInfo;

    .line 388
    .line 389
    const/4 v1, 0x0

    .line 390
    iput-object v1, v9, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadPurchases$1;->L$0:Ljava/lang/Object;

    .line 391
    .line 392
    iput-object v1, v9, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadPurchases$1;->L$1:Ljava/lang/Object;

    .line 393
    .line 394
    iput-object v1, v9, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadPurchases$1;->L$2:Ljava/lang/Object;

    .line 395
    .line 396
    iput-object v1, v9, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadPurchases$1;->L$3:Ljava/lang/Object;

    .line 397
    .line 398
    iput v4, v9, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadPurchases$1;->label:I

    .line 399
    .line 400
    move-object v4, v5

    .line 401
    move-object v5, v7

    .line 402
    move-object v7, v10

    .line 403
    invoke-direct/range {v3 .. v9}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->createPurchaseInformation(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/TransactionDetails;Lcom/revenuecat/purchases/EntitlementInfo;Lcom/revenuecat/purchases/ui/revenuecatui/utils/DateFormatter;Ljava/util/Locale;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;LZd/e;)Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v1

    .line 407
    if-ne v1, v2, :cond_f

    .line 408
    .line 409
    :goto_7
    return-object v2

    .line 410
    :cond_f
    :goto_8
    invoke-static {v1}, LUd/u;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 411
    .line 412
    .line 413
    move-result-object v1

    .line 414
    return-object v1

    .line 415
    :cond_10
    invoke-static {}, LUd/u;->m()Ljava/util/List;

    .line 416
    .line 417
    .line 418
    move-result-object v1

    .line 419
    return-object v1
.end method

.method private final mainPathAction(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;Landroid/content/Context;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    invoke-virtual/range {p1 .. p1}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;->getType()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    sget-object v4, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 12
    .line 13
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    aget v3, v4, v3

    .line 18
    .line 19
    const/4 v4, 0x1

    .line 20
    if-eq v3, v4, :cond_5

    .line 21
    .line 22
    const/4 v4, 0x2

    .line 23
    if-eq v3, v4, :cond_4

    .line 24
    .line 25
    const/4 v4, 0x3

    .line 26
    if-eq v3, v4, :cond_2

    .line 27
    .line 28
    const/4 v1, 0x4

    .line 29
    if-eq v3, v1, :cond_0

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;->getActionIdentifier()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    if-eqz v1, :cond_8

    .line 37
    .line 38
    new-instance v3, Lcom/revenuecat/purchases/customercenter/CustomActionData;

    .line 39
    .line 40
    if-eqz v2, :cond_1

    .line 41
    .line 42
    invoke-virtual {v2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;->getProduct()Lcom/revenuecat/purchases/models/StoreProduct;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    if-eqz v2, :cond_1

    .line 47
    .line 48
    invoke-interface {v2}, Lcom/revenuecat/purchases/models/StoreProduct;->getId()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    goto :goto_0

    .line 53
    :cond_1
    const/4 v2, 0x0

    .line 54
    :goto_0
    invoke-direct {v3, v1, v2}, Lcom/revenuecat/purchases/customercenter/CustomActionData;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->onCustomActionSelected(Lcom/revenuecat/purchases/customercenter/CustomActionData;)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_2
    invoke-virtual/range {p1 .. p1}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;->getUrl()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    if-eqz v2, :cond_8

    .line 66
    .line 67
    invoke-virtual/range {p1 .. p1}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;->getOpenMethod()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$OpenMethod;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    if-nez v3, :cond_3

    .line 72
    .line 73
    sget-object v3, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$OpenMethod;->EXTERNAL:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$OpenMethod;

    .line 74
    .line 75
    :cond_3
    invoke-virtual {v0, v1, v2, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->openURL(Landroid/content/Context;Ljava/lang/String;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$OpenMethod;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_4
    invoke-direct {v0, v1, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->handleCancelPath(Landroid/content/Context;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :cond_5
    iget-object v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->_state:LJf/u;

    .line 84
    .line 85
    :cond_6
    invoke-interface {v1}, LJf/u;->getValue()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    move-object v3, v2

    .line 90
    check-cast v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState;

    .line 91
    .line 92
    instance-of v4, v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 93
    .line 94
    if-eqz v4, :cond_7

    .line 95
    .line 96
    move-object v5, v3

    .line 97
    check-cast v5, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 98
    .line 99
    sget-object v10, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesState;->RESTORING:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesState;

    .line 100
    .line 101
    const/16 v17, 0x7ef

    .line 102
    .line 103
    const/16 v18, 0x0

    .line 104
    .line 105
    const/4 v6, 0x0

    .line 106
    const/4 v7, 0x0

    .line 107
    const/4 v8, 0x0

    .line 108
    const/4 v9, 0x0

    .line 109
    const/4 v11, 0x0

    .line 110
    const/4 v12, 0x0

    .line 111
    const/4 v13, 0x0

    .line 112
    const/4 v14, 0x0

    .line 113
    const/4 v15, 0x0

    .line 114
    const/16 v16, 0x0

    .line 115
    .line 116
    invoke-static/range {v5 .. v18}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->copy$default(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesState;Lcom/revenuecat/purchases/Offering;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterNavigationState;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$NavigationButtonType;Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;ZZILjava/lang/Object;)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    :cond_7
    invoke-interface {v1, v2, v3}, LJf/u;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    if-eqz v2, :cond_6

    .line 125
    .line 126
    :cond_8
    :goto_1
    return-void
.end method

.method static synthetic mainPathAction$default(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;Landroid/content/Context;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;ILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p4, p4, 0x4

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    const/4 p3, 0x0

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->mainPathAction(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;Landroid/content/Context;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method private final notifyListenersForCustomActionSelected(Lcom/revenuecat/purchases/customercenter/CustomActionData;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->listener:Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/revenuecat/purchases/customercenter/CustomActionData;->getActionIdentifier()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {p1}, Lcom/revenuecat/purchases/customercenter/CustomActionData;->getPurchaseIdentifier()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-interface {v0, v1, v2}, Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;->onCustomActionSelected(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->purchases:Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;

    .line 17
    .line 18
    invoke-interface {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;->getCustomerCenterListener()Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    invoke-virtual {p1}, Lcom/revenuecat/purchases/customercenter/CustomActionData;->getActionIdentifier()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {p1}, Lcom/revenuecat/purchases/customercenter/CustomActionData;->getPurchaseIdentifier()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-interface {v0, v1, p1}, Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;->onCustomActionSelected(Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    return-void
.end method

.method private final notifyListenersForFeedbackSurveyCompleted(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->listener:Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;->onFeedbackSurveyCompleted(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->purchases:Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;

    .line 9
    .line 10
    invoke-interface {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;->getCustomerCenterListener()Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-interface {v0, p1}, Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;->onFeedbackSurveyCompleted(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :cond_1
    return-void
.end method

.method private final notifyListenersForManageSubscription()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->listener:Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;->onShowingManageSubscriptions()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->purchases:Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;

    .line 9
    .line 10
    invoke-interface {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;->getCustomerCenterListener()Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-interface {v0}, Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;->onShowingManageSubscriptions()V

    .line 17
    .line 18
    .line 19
    :cond_1
    return-void
.end method

.method private final notifyListenersForManagementOptionSelected(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;->getType()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    aget v0, v1, v0

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    if-eq v0, v1, :cond_4

    .line 15
    .line 16
    const/4 v1, 0x2

    .line 17
    if-eq v0, v1, :cond_3

    .line 18
    .line 19
    const/4 v1, 0x3

    .line 20
    const/4 v2, 0x0

    .line 21
    if-eq v0, v1, :cond_2

    .line 22
    .line 23
    const/4 v1, 0x4

    .line 24
    if-eq v0, v1, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-virtual {p1}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;->getActionIdentifier()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    if-eqz p1, :cond_5

    .line 32
    .line 33
    new-instance v0, Lcom/revenuecat/purchases/customercenter/CustomerCenterManagementOption$CustomAction;

    .line 34
    .line 35
    if-eqz p2, :cond_1

    .line 36
    .line 37
    invoke-virtual {p2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;->getProduct()Lcom/revenuecat/purchases/models/StoreProduct;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    if-eqz p2, :cond_1

    .line 42
    .line 43
    invoke-interface {p2}, Lcom/revenuecat/purchases/models/StoreProduct;->getId()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    :cond_1
    invoke-direct {v0, p1, v2}, Lcom/revenuecat/purchases/customercenter/CustomerCenterManagementOption$CustomAction;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    move-object v2, v0

    .line 51
    goto :goto_0

    .line 52
    :cond_2
    invoke-virtual {p1}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;->getUrl()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    if-eqz p1, :cond_5

    .line 57
    .line 58
    new-instance v2, Lcom/revenuecat/purchases/customercenter/CustomerCenterManagementOption$CustomUrl;

    .line 59
    .line 60
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-direct {v2, p1}, Lcom/revenuecat/purchases/customercenter/CustomerCenterManagementOption$CustomUrl;-><init>(Landroid/net/Uri;)V

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    sget-object v2, Lcom/revenuecat/purchases/customercenter/CustomerCenterManagementOption$Cancel;->INSTANCE:Lcom/revenuecat/purchases/customercenter/CustomerCenterManagementOption$Cancel;

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_4
    sget-object v2, Lcom/revenuecat/purchases/customercenter/CustomerCenterManagementOption$MissingPurchase;->INSTANCE:Lcom/revenuecat/purchases/customercenter/CustomerCenterManagementOption$MissingPurchase;

    .line 72
    .line 73
    :cond_5
    :goto_0
    if-eqz v2, :cond_7

    .line 74
    .line 75
    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->listener:Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;

    .line 76
    .line 77
    if-eqz p1, :cond_6

    .line 78
    .line 79
    invoke-interface {p1, v2}, Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;->onManagementOptionSelected(Lcom/revenuecat/purchases/customercenter/CustomerCenterManagementOption;)V

    .line 80
    .line 81
    .line 82
    :cond_6
    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->purchases:Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;

    .line 83
    .line 84
    invoke-interface {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;->getCustomerCenterListener()Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    if-eqz p1, :cond_7

    .line 89
    .line 90
    invoke-interface {p1, v2}, Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;->onManagementOptionSelected(Lcom/revenuecat/purchases/customercenter/CustomerCenterManagementOption;)V

    .line 91
    .line 92
    .line 93
    :cond_7
    return-void
.end method

.method private final notifyListenersForPromotionalOfferSucceeded(Lcom/revenuecat/purchases/CustomerInfo;Lcom/revenuecat/purchases/models/StoreTransaction;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->listener:Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1, p2}, Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;->onPromotionalOfferSucceeded(Lcom/revenuecat/purchases/CustomerInfo;Lcom/revenuecat/purchases/models/StoreTransaction;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->purchases:Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;

    .line 9
    .line 10
    invoke-interface {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;->getCustomerCenterListener()Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-interface {v0, p1, p2}, Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;->onPromotionalOfferSucceeded(Lcom/revenuecat/purchases/CustomerInfo;Lcom/revenuecat/purchases/models/StoreTransaction;)V

    .line 17
    .line 18
    .line 19
    :cond_1
    return-void
.end method

.method private final notifyListenersForRestoreCompleted(Lcom/revenuecat/purchases/CustomerInfo;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->listener:Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;->onRestoreCompleted(Lcom/revenuecat/purchases/CustomerInfo;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->purchases:Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;

    .line 9
    .line 10
    invoke-interface {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;->getCustomerCenterListener()Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-interface {v0, p1}, Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;->onRestoreCompleted(Lcom/revenuecat/purchases/CustomerInfo;)V

    .line 17
    .line 18
    .line 19
    :cond_1
    return-void
.end method

.method private final notifyListenersForRestoreFailed(Lcom/revenuecat/purchases/PurchasesError;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->listener:Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;->onRestoreFailed(Lcom/revenuecat/purchases/PurchasesError;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->purchases:Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;

    .line 9
    .line 10
    invoke-interface {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;->getCustomerCenterListener()Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-interface {v0, p1}, Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;->onRestoreFailed(Lcom/revenuecat/purchases/PurchasesError;)V

    .line 17
    .line 18
    .line 19
    :cond_1
    return-void
.end method

.method private final notifyListenersForRestoreStarted()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->listener:Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0}, Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;->onRestoreStarted()V

    .line 6
    .line 7
    .line 8
    :cond_0
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->purchases:Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;

    .line 9
    .line 10
    invoke-interface {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;->getCustomerCenterListener()Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-interface {v0}, Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;->onRestoreStarted()V

    .line 17
    .line 18
    .line 19
    :cond_1
    return-void
.end method

.method private final preservingUIStateIfRefresh(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;ZLcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState;)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;
    .locals 16

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    if-eqz p2, :cond_1

    .line 4
    .line 5
    instance-of v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move-object v1, v0

    .line 11
    check-cast v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 12
    .line 13
    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->getNavigationState()Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterNavigationState;

    .line 14
    .line 15
    .line 16
    move-result-object v9

    .line 17
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState;->getNavigationButtonType()Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$NavigationButtonType;

    .line 18
    .line 19
    .line 20
    move-result-object v10

    .line 21
    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->getRestorePurchasesState()Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesState;

    .line 22
    .line 23
    .line 24
    move-result-object v7

    .line 25
    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->getShowSupportTicketSuccessSnackbar()Z

    .line 26
    .line 27
    .line 28
    move-result v12

    .line 29
    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->getDetailScreenPaths()Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v6

    .line 33
    const/16 v14, 0x527

    .line 34
    .line 35
    const/4 v15, 0x0

    .line 36
    const/4 v3, 0x0

    .line 37
    const/4 v4, 0x0

    .line 38
    const/4 v5, 0x0

    .line 39
    const/4 v8, 0x0

    .line 40
    const/4 v11, 0x0

    .line 41
    const/4 v13, 0x0

    .line 42
    move-object/from16 v2, p1

    .line 43
    .line 44
    invoke-static/range {v2 .. v15}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->copy$default(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesState;Lcom/revenuecat/purchases/Offering;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterNavigationState;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$NavigationButtonType;Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;ZZILjava/lang/Object;)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    return-object v0

    .line 49
    :cond_1
    :goto_0
    return-object p1
.end method

.method private final resetToMainScreen(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;
    .locals 15

    .line 1
    invoke-virtual/range {p1 .. p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->getNavigationState()Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterNavigationState;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterNavigationState;->popToMain()Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterNavigationState;

    .line 6
    .line 7
    .line 8
    move-result-object v8

    .line 9
    sget-object v9, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$NavigationButtonType;->CLOSE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$NavigationButtonType;

    .line 10
    .line 11
    const/16 v13, 0x72f

    .line 12
    .line 13
    const/4 v14, 0x0

    .line 14
    const/4 v2, 0x0

    .line 15
    const/4 v3, 0x0

    .line 16
    const/4 v4, 0x0

    .line 17
    const/4 v5, 0x0

    .line 18
    const/4 v6, 0x0

    .line 19
    const/4 v7, 0x0

    .line 20
    const/4 v10, 0x0

    .line 21
    const/4 v11, 0x0

    .line 22
    const/4 v12, 0x0

    .line 23
    move-object/from16 v1, p1

    .line 24
    .line 25
    invoke-static/range {v1 .. v14}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->copy$default(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesState;Lcom/revenuecat/purchases/Offering;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterNavigationState;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$NavigationButtonType;Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;ZZILjava/lang/Object;)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0
.end method

.method private final shouldResumeRestorePurchases(Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;Ljava/lang/String;LZd/e;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;",
            "Ljava/lang/String;",
            "LZd/e;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$shouldResumeRestorePurchases$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$shouldResumeRestorePurchases$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$shouldResumeRestorePurchases$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$shouldResumeRestorePurchases$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$shouldResumeRestorePurchases$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$shouldResumeRestorePurchases$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;LZd/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$shouldResumeRestorePurchases$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$shouldResumeRestorePurchases$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x1

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    iget-object p1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$shouldResumeRestorePurchases$1;->L$1:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p1, Ljava/lang/String;

    .line 41
    .line 42
    iget-object p1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$shouldResumeRestorePurchases$1;->L$0:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;

    .line 45
    .line 46
    invoke-static {p3}, LTd/v;->b(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 51
    .line 52
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 53
    .line 54
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw p1

    .line 58
    :cond_2
    invoke-static {p3}, LTd/v;->b(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iput-object p1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$shouldResumeRestorePurchases$1;->L$0:Ljava/lang/Object;

    .line 62
    .line 63
    iput-object p2, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$shouldResumeRestorePurchases$1;->L$1:Ljava/lang/Object;

    .line 64
    .line 65
    iput v3, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$shouldResumeRestorePurchases$1;->label:I

    .line 66
    .line 67
    new-instance p3, LGf/p;

    .line 68
    .line 69
    invoke-static {v0}, Lae/b;->c(LZd/e;)LZd/e;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-direct {p3, v2, v3}, LGf/p;-><init>(LZd/e;I)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p3}, LGf/p;->C()V

    .line 77
    .line 78
    .line 79
    sget-object v2, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;

    .line 80
    .line 81
    new-instance v4, Ljava/lang/StringBuilder;

    .line 82
    .line 83
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 84
    .line 85
    .line 86
    const-string v5, "Restore Purchases Initiated\u2026 waiting for "

    .line 87
    .line 88
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string p2, " to proceed."

    .line 95
    .line 96
    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p2

    .line 103
    invoke-virtual {v2, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->d(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    if-eqz p1, :cond_3

    .line 107
    .line 108
    new-instance p2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$shouldResumeRestorePurchases$shouldResume$1$1;

    .line 109
    .line 110
    invoke-direct {p2, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$shouldResumeRestorePurchases$shouldResume$1$1;-><init>(LGf/n;)V

    .line 111
    .line 112
    .line 113
    invoke-interface {p1, p2}, Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;->onRestoreInitiated(Lcom/revenuecat/purchases/customercenter/Resumable;)V

    .line 114
    .line 115
    .line 116
    sget-object p1, LTd/L;->a:LTd/L;

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_3
    const/4 p1, 0x0

    .line 120
    :goto_1
    if-nez p1, :cond_4

    .line 121
    .line 122
    sget-object p1, LTd/u;->b:LTd/u$a;

    .line 123
    .line 124
    invoke-static {v3}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-static {p1}, LTd/u;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    invoke-interface {p3, p1}, LZd/e;->resumeWith(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    :cond_4
    invoke-virtual {p3}, LGf/p;->v()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object p3

    .line 139
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    if-ne p3, p1, :cond_5

    .line 144
    .line 145
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/h;->c(LZd/e;)V

    .line 146
    .line 147
    .line 148
    :cond_5
    if-ne p3, v1, :cond_6

    .line 149
    .line 150
    return-object v1

    .line 151
    :cond_6
    :goto_2
    check-cast p3, Ljava/lang/Boolean;

    .line 152
    .line 153
    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 154
    .line 155
    .line 156
    move-result p1

    .line 157
    if-eqz p1, :cond_7

    .line 158
    .line 159
    const-string p2, "will"

    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_7
    const-string p2, "will not"

    .line 163
    .line 164
    :goto_3
    sget-object p3, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;

    .line 165
    .line 166
    new-instance v0, Ljava/lang/StringBuilder;

    .line 167
    .line 168
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 169
    .line 170
    .line 171
    const-string v1, "Restore Purchases gate complete. The SDK **"

    .line 172
    .line 173
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    const-string p2, "** attempt to restore purchases."

    .line 180
    .line 181
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object p2

    .line 188
    invoke-virtual {p3, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->d(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    .line 192
    .line 193
    .line 194
    move-result-object p1

    .line 195
    return-object p1
.end method

.method private final showManageSubscriptions(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v2, "https://play.google.com/store/account/subscriptions?sku="

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string p2, "&package="

    .line 19
    .line 20
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    new-instance v0, Landroid/content/Intent;

    .line 31
    .line 32
    const-string v1, "android.intent.action.VIEW"

    .line 33
    .line 34
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    invoke-direct {v0, v1, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :catch_0
    move-exception p1

    .line 46
    sget-object p2, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;

    .line 47
    .line 48
    const-string v0, "Error opening manage subscriptions"

    .line 49
    .line 50
    invoke-virtual {p2, v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method private final startAmazonCancellation(Landroid/content/Context;Landroid/net/Uri;)V
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->shouldRefreshOnResume:Z

    .line 3
    .line 4
    invoke-direct {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->notifyListenersForManageSubscription()V

    .line 5
    .line 6
    .line 7
    :try_start_0
    new-instance v0, Landroid/content/Intent;

    .line 8
    .line 9
    const-string v1, "android.intent.action.VIEW"

    .line 10
    .line 11
    const-string v2, "amzn://apps/library/subscriptions"

    .line 12
    .line 13
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :catch_0
    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    const-string v0, "managementURL.toString()"

    .line 29
    .line 30
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    sget-object v0, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$OpenMethod;->EXTERNAL:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$OpenMethod;

    .line 34
    .line 35
    invoke-virtual {p0, p1, p2, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->openURL(Landroid/content/Context;Ljava/lang/String;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$OpenMethod;)V

    .line 36
    .line 37
    .line 38
    return-void
.end method

.method private final startGoogleProductCancellation(Landroid/content/Context;Lcom/revenuecat/purchases/models/StoreProduct;)V
    .locals 1

    .line 1
    instance-of v0, p2, Lcom/revenuecat/purchases/models/GoogleStoreProduct;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p2, Lcom/revenuecat/purchases/models/GoogleStoreProduct;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p2, 0x0

    .line 9
    :goto_0
    if-nez p2, :cond_1

    .line 10
    .line 11
    sget-object p1, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;

    .line 12
    .line 13
    const-string p2, "Expected GoogleStoreProduct for Play Store cancellation"

    .line 14
    .line 15
    invoke-virtual {p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->e(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_1
    const/4 v0, 0x1

    .line 20
    iput-boolean v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->shouldRefreshOnResume:Z

    .line 21
    .line 22
    invoke-direct {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->notifyListenersForManageSubscription()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p2}, Lcom/revenuecat/purchases/models/GoogleStoreProduct;->getProductId()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    invoke-direct {p0, p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->showManageSubscriptions(Landroid/content/Context;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method private final startManagementUrlCancellation(Landroid/content/Context;Landroid/net/Uri;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->shouldRefreshOnResume:Z

    .line 3
    .line 4
    invoke-direct {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->notifyListenersForManageSubscription()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    const-string v0, "managementURL.toString()"

    .line 12
    .line 13
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sget-object v0, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$OpenMethod;->EXTERNAL:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$OpenMethod;

    .line 17
    .line 18
    invoke-virtual {p0, p1, p2, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->openURL(Landroid/content/Context;Ljava/lang/String;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$OpenMethod;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method private final supportedPaths(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;",
            "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen;",
            "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;",
            ")",
            "Ljava/util/List<",
            "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p2}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen;->getPaths()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    move-object v2, v1

    .line 25
    check-cast v2, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;

    .line 26
    .line 27
    invoke-direct {p0, v2, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->isPathAllowedForStore(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;)Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    new-instance p2, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_3

    .line 51
    .line 52
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    move-object v2, v1

    .line 57
    check-cast v2, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;

    .line 58
    .line 59
    invoke-direct {p0, v2, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->isPathAllowedForSubscriptionState(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_2

    .line 64
    .line 65
    invoke-interface {p2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_3
    invoke-direct {p0, p2, p1, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->transformPathsOnSubscriptionState(Ljava/util/List;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;)Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    return-object p1
.end method

.method private final trackCustomerCenterEventOptionChosen(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;Ljava/lang/String;Ljava/lang/String;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->_lastLocaleList:LJf/u;

    .line 4
    .line 5
    invoke-interface {v1}, LJf/u;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, LG1/i;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    invoke-virtual {v1, v2}, LG1/i;->c(I)Ljava/util/Locale;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    :cond_0
    new-instance v2, Lcom/revenuecat/purchases/customercenter/events/CustomerCenterSurveyOptionChosenEvent;

    .line 23
    .line 24
    new-instance v3, Lcom/revenuecat/purchases/customercenter/events/CustomerCenterSurveyOptionChosenEvent$Data;

    .line 25
    .line 26
    new-instance v4, Ljava/util/Date;

    .line 27
    .line 28
    invoke-direct {v4}, Ljava/util/Date;-><init>()V

    .line 29
    .line 30
    .line 31
    iget-boolean v5, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->isDarkMode:Z

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/util/Locale;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v6

    .line 37
    const-string v1, "locale.toString()"

    .line 38
    .line 39
    invoke-static {v6, v1}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const/16 v14, 0x238

    .line 43
    .line 44
    const/4 v15, 0x0

    .line 45
    const/4 v7, 0x0

    .line 46
    const/4 v8, 0x0

    .line 47
    const/4 v9, 0x0

    .line 48
    const/4 v13, 0x0

    .line 49
    move-object/from16 v10, p1

    .line 50
    .line 51
    move-object/from16 v11, p2

    .line 52
    .line 53
    move-object/from16 v12, p3

    .line 54
    .line 55
    invoke-direct/range {v3 .. v15}, Lcom/revenuecat/purchases/customercenter/events/CustomerCenterSurveyOptionChosenEvent$Data;-><init>(Ljava/util/Date;ZLjava/lang/String;IILcom/revenuecat/purchases/customercenter/events/CustomerCenterDisplayMode;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 56
    .line 57
    .line 58
    const/4 v1, 0x1

    .line 59
    const/4 v4, 0x0

    .line 60
    invoke-direct {v2, v4, v3, v1, v4}, Lcom/revenuecat/purchases/customercenter/events/CustomerCenterSurveyOptionChosenEvent;-><init>(Lcom/revenuecat/purchases/customercenter/events/CustomerCenterSurveyOptionChosenEvent$CreationData;Lcom/revenuecat/purchases/customercenter/events/CustomerCenterSurveyOptionChosenEvent$Data;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 61
    .line 62
    .line 63
    iget-object v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->purchases:Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;

    .line 64
    .line 65
    invoke-interface {v1, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;->track(Lcom/revenuecat/purchases/common/events/FeatureEvent;)V

    .line 66
    .line 67
    .line 68
    return-void
.end method

.method private final transformPathsOnSubscriptionState(Ljava/util/List;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;)Ljava/util/List;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;",
            ">;",
            "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;",
            "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;",
            ")",
            "Ljava/util/List<",
            "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    const/16 v1, 0xa

    .line 4
    .line 5
    move-object/from16 v2, p1

    .line 6
    .line 7
    invoke-static {v2, v1}, LUd/u;->x(Ljava/lang/Iterable;I)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    move-object v3, v2

    .line 29
    check-cast v3, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;

    .line 30
    .line 31
    invoke-virtual {v3}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;->getType()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    sget-object v4, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;->CANCEL:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;

    .line 36
    .line 37
    if-ne v2, v4, :cond_0

    .line 38
    .line 39
    if-eqz p2, :cond_0

    .line 40
    .line 41
    invoke-virtual/range {p2 .. p2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;->isCancelled()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    const/4 v4, 0x1

    .line 46
    if-ne v2, v4, :cond_0

    .line 47
    .line 48
    sget-object v2, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;->RESUBSCRIBE:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;

    .line 49
    .line 50
    move-object/from16 v14, p3

    .line 51
    .line 52
    invoke-virtual {v14, v2}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;->commonLocalizedString(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    const/16 v12, 0xe5

    .line 57
    .line 58
    const/4 v13, 0x0

    .line 59
    const/4 v4, 0x0

    .line 60
    const/4 v6, 0x0

    .line 61
    const/4 v7, 0x0

    .line 62
    const/4 v8, 0x0

    .line 63
    const/4 v9, 0x0

    .line 64
    const/4 v10, 0x0

    .line 65
    const/4 v11, 0x0

    .line 66
    invoke-static/range {v3 .. v13}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;->copy$default(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathType;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey;Ljava/lang/String;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$OpenMethod;Ljava/lang/String;ILjava/lang/Object;)Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;

    .line 67
    .line 68
    .line 69
    move-result-object v3

    .line 70
    goto :goto_1

    .line 71
    :cond_0
    move-object/from16 v14, p3

    .line 72
    .line 73
    :goto_1
    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_1
    return-object v0
.end method

.method private final tryFallbackToCurrentOffering(Landroid/content/Context;)V
    .locals 3

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
    new-instance v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$tryFallbackToCurrentOffering$1;

    .line 8
    .line 9
    invoke-direct {v1, p0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$tryFallbackToCurrentOffering$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;)V

    .line 10
    .line 11
    .line 12
    new-instance v2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$tryFallbackToCurrentOffering$2;

    .line 13
    .line 14
    invoke-direct {v2, p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$tryFallbackToCurrentOffering$2;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;Landroid/content/Context;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1, v2}, Lcom/revenuecat/purchases/ListenerConversionsCommonKt;->getOfferingsWith(Lcom/revenuecat/purchases/Purchases;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public clearActionError()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->_actionError:LY/C0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-interface {v0, v1}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public contactSupport(Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "supportEmail"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Landroid/content/Intent;

    .line 12
    .line 13
    const-string v1, "android.intent.action.SENDTO"

    .line 14
    .line 15
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    new-instance v1, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    const-string v2, "mailto:"

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p2

    .line 35
    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    invoke-virtual {v0, p2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 40
    .line 41
    .line 42
    const-string p2, "android.intent.extra.SUBJECT"

    .line 43
    .line 44
    const-string v1, "Support Request"

    .line 45
    .line 46
    invoke-virtual {v0, p2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 47
    .line 48
    .line 49
    const-string p2, "android.intent.extra.TEXT"

    .line 50
    .line 51
    const-string v1, "Support request details..."

    .line 52
    .line 53
    invoke-virtual {v0, p2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 54
    .line 55
    .line 56
    const-string p2, "Contact Support"

    .line 57
    .line 58
    invoke-static {v0, p2}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    invoke-virtual {p1, p2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 63
    .line 64
    .line 65
    return-void
.end method

.method public dismissPromotionalOffer(Landroid/content/Context;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;)V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const-string v3, "context"

    .line 8
    .line 9
    invoke-static {v1, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    const-string v3, "originalPath"

    .line 13
    .line 14
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v3, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->_state:LJf/u;

    .line 18
    .line 19
    invoke-interface {v3}, LJf/u;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    instance-of v4, v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 24
    .line 25
    const/4 v5, 0x0

    .line 26
    if-eqz v4, :cond_0

    .line 27
    .line 28
    check-cast v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move-object v3, v5

    .line 32
    :goto_0
    if-eqz v3, :cond_1

    .line 33
    .line 34
    invoke-virtual {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->getCurrentDestination()Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterDestination;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    move-object v3, v5

    .line 40
    :goto_1
    instance-of v4, v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterDestination$PromotionalOffer;

    .line 41
    .line 42
    if-eqz v4, :cond_2

    .line 43
    .line 44
    check-cast v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterDestination$PromotionalOffer;

    .line 45
    .line 46
    invoke-virtual {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterDestination$PromotionalOffer;->getPurchaseInformation()Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    :cond_2
    invoke-direct {v0, v2, v1, v5}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->mainPathAction(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;Landroid/content/Context;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;)V

    .line 51
    .line 52
    .line 53
    iget-object v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->_state:LJf/u;

    .line 54
    .line 55
    :cond_3
    invoke-interface {v1}, LJf/u;->getValue()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    move-object v3, v2

    .line 60
    check-cast v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState;

    .line 61
    .line 62
    instance-of v4, v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 63
    .line 64
    if-eqz v4, :cond_4

    .line 65
    .line 66
    move-object v5, v3

    .line 67
    check-cast v5, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 68
    .line 69
    invoke-virtual {v5}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->getNavigationState()Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterNavigationState;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-virtual {v3}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterNavigationState;->popToMain()Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterNavigationState;

    .line 74
    .line 75
    .line 76
    move-result-object v12

    .line 77
    sget-object v13, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$NavigationButtonType;->CLOSE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$NavigationButtonType;

    .line 78
    .line 79
    const/16 v17, 0x73f

    .line 80
    .line 81
    const/16 v18, 0x0

    .line 82
    .line 83
    const/4 v6, 0x0

    .line 84
    const/4 v7, 0x0

    .line 85
    const/4 v8, 0x0

    .line 86
    const/4 v9, 0x0

    .line 87
    const/4 v10, 0x0

    .line 88
    const/4 v11, 0x0

    .line 89
    const/4 v14, 0x0

    .line 90
    const/4 v15, 0x0

    .line 91
    const/16 v16, 0x0

    .line 92
    .line 93
    invoke-static/range {v5 .. v18}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->copy$default(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesState;Lcom/revenuecat/purchases/Offering;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterNavigationState;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$NavigationButtonType;Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;ZZILjava/lang/Object;)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    :cond_4
    invoke-interface {v1, v2, v3}, LJf/u;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    if-eqz v2, :cond_3

    .line 102
    .line 103
    return-void
.end method

.method public dismissRestoreDialog(LZd/e;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZd/e;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->loadCustomerCenter(LZd/e;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-ne p1, v0, :cond_0

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 13
    .line 14
    return-object p1
.end method

.method public dismissSupportTicketSuccessSnackbar()V
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->_state:LJf/u;

    .line 4
    .line 5
    :cond_0
    invoke-interface {v1}, LJf/u;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    move-object v3, v2

    .line 10
    check-cast v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState;

    .line 11
    .line 12
    instance-of v4, v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 13
    .line 14
    if-eqz v4, :cond_1

    .line 15
    .line 16
    move-object v5, v3

    .line 17
    check-cast v5, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 18
    .line 19
    const/16 v17, 0x5ff

    .line 20
    .line 21
    const/16 v18, 0x0

    .line 22
    .line 23
    const/4 v6, 0x0

    .line 24
    const/4 v7, 0x0

    .line 25
    const/4 v8, 0x0

    .line 26
    const/4 v9, 0x0

    .line 27
    const/4 v10, 0x0

    .line 28
    const/4 v11, 0x0

    .line 29
    const/4 v12, 0x0

    .line 30
    const/4 v13, 0x0

    .line 31
    const/4 v14, 0x0

    .line 32
    const/4 v15, 0x0

    .line 33
    const/16 v16, 0x0

    .line 34
    .line 35
    invoke-static/range {v5 .. v18}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->copy$default(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesState;Lcom/revenuecat/purchases/Offering;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterNavigationState;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$NavigationButtonType;Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;ZZILjava/lang/Object;)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    :cond_1
    invoke-interface {v1, v2, v3}, LJf/u;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_0

    .line 44
    .line 45
    return-void
.end method

.method public getActionError()LY/h2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LY/h2;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->_actionError:LY/C0;

    .line 2
    .line 3
    return-object v0
.end method

.method public getState()LJf/I;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LJf/I;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->state:LJf/I;

    .line 2
    .line 3
    return-object v0
.end method

.method public loadAndDisplayPromotionalOffer(Landroid/content/Context;Lcom/revenuecat/purchases/models/StoreProduct;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;LZd/e;)Ljava/lang/Object;
    .locals 27
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lcom/revenuecat/purchases/models/StoreProduct;",
            "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;",
            "Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;",
            "Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;",
            "LZd/e;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    move-object/from16 v2, p6

    .line 6
    .line 7
    instance-of v3, v2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadAndDisplayPromotionalOffer$1;

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    move-object v3, v2

    .line 12
    check-cast v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadAndDisplayPromotionalOffer$1;

    .line 13
    .line 14
    iget v4, v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadAndDisplayPromotionalOffer$1;->label:I

    .line 15
    .line 16
    const/high16 v5, -0x80000000

    .line 17
    .line 18
    and-int v6, v4, v5

    .line 19
    .line 20
    if-eqz v6, :cond_0

    .line 21
    .line 22
    sub-int/2addr v4, v5

    .line 23
    iput v4, v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadAndDisplayPromotionalOffer$1;->label:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadAndDisplayPromotionalOffer$1;

    .line 27
    .line 28
    invoke-direct {v3, v0, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadAndDisplayPromotionalOffer$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;LZd/e;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v2, v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadAndDisplayPromotionalOffer$1;->result:Ljava/lang/Object;

    .line 32
    .line 33
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    iget v5, v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadAndDisplayPromotionalOffer$1;->label:I

    .line 38
    .line 39
    const/4 v6, 0x0

    .line 40
    const/4 v7, 0x1

    .line 41
    if-eqz v5, :cond_2

    .line 42
    .line 43
    if-ne v5, v7, :cond_1

    .line 44
    .line 45
    iget-object v1, v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadAndDisplayPromotionalOffer$1;->L$3:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;

    .line 48
    .line 49
    iget-object v4, v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadAndDisplayPromotionalOffer$1;->L$2:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v4, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;

    .line 52
    .line 53
    iget-object v5, v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadAndDisplayPromotionalOffer$1;->L$1:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v5, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;

    .line 56
    .line 57
    iget-object v3, v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadAndDisplayPromotionalOffer$1;->L$0:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;

    .line 60
    .line 61
    invoke-static {v2}, LTd/v;->b(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    move-object/from16 v26, v5

    .line 65
    .line 66
    move-object v5, v1

    .line 67
    move-object/from16 v1, v26

    .line 68
    .line 69
    move-object/from16 v26, v3

    .line 70
    .line 71
    move-object v3, v2

    .line 72
    move-object v2, v4

    .line 73
    move-object/from16 v4, v26

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 77
    .line 78
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 79
    .line 80
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    throw v1

    .line 84
    :cond_2
    invoke-static {v2}, LTd/v;->b(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;->getEligible()Z

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-nez v2, :cond_3

    .line 92
    .line 93
    sget-object v2, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;

    .line 94
    .line 95
    new-instance v3, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 98
    .line 99
    .line 100
    const-string v4, "User not eligible for promo with id \'"

    .line 101
    .line 102
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;->getAndroidOfferId()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    const-string v1, "\'. Check eligibility configuration in the dashboard, and make sure the user has an active/expired subscription for the product with id \'"

    .line 113
    .line 114
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-interface/range {p2 .. p2}, Lcom/revenuecat/purchases/models/StoreProduct;->getId()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    const-string v1, "\'."

    .line 125
    .line 126
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    invoke-virtual {v2, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->d(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    return-object v1

    .line 141
    :cond_3
    iput-object v0, v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadAndDisplayPromotionalOffer$1;->L$0:Ljava/lang/Object;

    .line 142
    .line 143
    iput-object v1, v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadAndDisplayPromotionalOffer$1;->L$1:Ljava/lang/Object;

    .line 144
    .line 145
    move-object/from16 v2, p4

    .line 146
    .line 147
    iput-object v2, v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadAndDisplayPromotionalOffer$1;->L$2:Ljava/lang/Object;

    .line 148
    .line 149
    move-object/from16 v5, p5

    .line 150
    .line 151
    iput-object v5, v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadAndDisplayPromotionalOffer$1;->L$3:Ljava/lang/Object;

    .line 152
    .line 153
    iput v7, v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$loadAndDisplayPromotionalOffer$1;->label:I

    .line 154
    .line 155
    move-object/from16 v8, p2

    .line 156
    .line 157
    invoke-direct {v0, v1, v8, v3}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->getPromotionalSubscriptionOption(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;Lcom/revenuecat/purchases/models/StoreProduct;LZd/e;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    if-ne v3, v4, :cond_4

    .line 162
    .line 163
    return-object v4

    .line 164
    :cond_4
    move-object v4, v0

    .line 165
    :goto_1
    check-cast v3, Lcom/revenuecat/purchases/models/SubscriptionOption;

    .line 166
    .line 167
    if-nez v3, :cond_5

    .line 168
    .line 169
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    return-object v1

    .line 174
    :cond_5
    iget-object v8, v4, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->_state:LJf/u;

    .line 175
    .line 176
    :cond_6
    invoke-interface {v8}, LJf/u;->getValue()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v9

    .line 180
    move-object v10, v9

    .line 181
    check-cast v10, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState;

    .line 182
    .line 183
    instance-of v11, v10, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 184
    .line 185
    if-eqz v11, :cond_7

    .line 186
    .line 187
    move-object v12, v10

    .line 188
    check-cast v12, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 189
    .line 190
    invoke-virtual {v12}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->getCustomerCenterConfigData()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;

    .line 191
    .line 192
    .line 193
    move-result-object v6

    .line 194
    invoke-virtual {v6}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;->getLocalization()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;

    .line 195
    .line 196
    .line 197
    move-result-object v6

    .line 198
    iget-object v10, v4, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->locale:Ljava/util/Locale;

    .line 199
    .line 200
    invoke-static {v3, v6, v10}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/extensions/SubscriptionOptionExtensionsKt;->getLocalizedDescription(Lcom/revenuecat/purchases/models/SubscriptionOption;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;Ljava/util/Locale;)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v6

    .line 204
    new-instance v10, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterDestination$PromotionalOffer;

    .line 205
    .line 206
    new-instance v11, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PromotionalOfferData;

    .line 207
    .line 208
    invoke-direct {v11, v1, v3, v2, v6}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PromotionalOfferData;-><init>(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$PromotionalOffer;Lcom/revenuecat/purchases/models/SubscriptionOption;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;Ljava/lang/String;)V

    .line 209
    .line 210
    .line 211
    invoke-direct {v10, v11, v5}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterDestination$PromotionalOffer;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PromotionalOfferData;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v12}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->getNavigationState()Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterNavigationState;

    .line 215
    .line 216
    .line 217
    move-result-object v6

    .line 218
    invoke-virtual {v6, v10}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterNavigationState;->push(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterDestination;)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterNavigationState;

    .line 219
    .line 220
    .line 221
    move-result-object v19

    .line 222
    sget-object v20, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$NavigationButtonType;->CLOSE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$NavigationButtonType;

    .line 223
    .line 224
    const/16 v24, 0x73f

    .line 225
    .line 226
    const/16 v25, 0x0

    .line 227
    .line 228
    const/4 v13, 0x0

    .line 229
    const/4 v14, 0x0

    .line 230
    const/4 v15, 0x0

    .line 231
    const/16 v16, 0x0

    .line 232
    .line 233
    const/16 v17, 0x0

    .line 234
    .line 235
    const/16 v18, 0x0

    .line 236
    .line 237
    const/16 v21, 0x0

    .line 238
    .line 239
    const/16 v22, 0x0

    .line 240
    .line 241
    const/16 v23, 0x0

    .line 242
    .line 243
    invoke-static/range {v12 .. v25}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->copy$default(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesState;Lcom/revenuecat/purchases/Offering;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterNavigationState;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$NavigationButtonType;Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;ZZILjava/lang/Object;)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v12}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->getNavigationState()Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterNavigationState;

    .line 247
    .line 248
    .line 249
    move-result-object v6

    .line 250
    invoke-virtual {v6, v10}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterNavigationState;->push(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterDestination;)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterNavigationState;

    .line 251
    .line 252
    .line 253
    move-result-object v19

    .line 254
    invoke-static/range {v12 .. v25}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->copy$default(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesState;Lcom/revenuecat/purchases/Offering;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterNavigationState;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$NavigationButtonType;Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;ZZILjava/lang/Object;)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 255
    .line 256
    .line 257
    move-result-object v10

    .line 258
    move v6, v7

    .line 259
    :cond_7
    invoke-interface {v8, v9, v10}, LJf/u;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result v9

    .line 263
    if-eqz v9, :cond_6

    .line 264
    .line 265
    invoke-static {v6}, Lkotlin/coroutines/jvm/internal/b;->a(Z)Ljava/lang/Boolean;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    return-object v1
.end method

.method public loadCustomerCenter(LZd/e;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZd/e;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->loadCustomerCenter(ZLZd/e;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    move-result-object v0

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LTd/L;->a:LTd/L;

    return-object p1
.end method

.method public onAcceptedPromotionalOffer(Lcom/revenuecat/purchases/models/SubscriptionOption;Landroid/app/Activity;LZd/e;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/revenuecat/purchases/models/SubscriptionOption;",
            "Landroid/app/Activity;",
            "LZd/e;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    instance-of v0, p3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$onAcceptedPromotionalOffer$1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$onAcceptedPromotionalOffer$1;

    .line 7
    .line 8
    iget v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$onAcceptedPromotionalOffer$1;->label:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$onAcceptedPromotionalOffer$1;->label:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$onAcceptedPromotionalOffer$1;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$onAcceptedPromotionalOffer$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;LZd/e;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$onAcceptedPromotionalOffer$1;->result:Ljava/lang/Object;

    .line 26
    .line 27
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget v2, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$onAcceptedPromotionalOffer$1;->label:I

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    if-eq v2, v4, :cond_2

    .line 38
    .line 39
    if-ne v2, v3, :cond_1

    .line 40
    .line 41
    iget-object p1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$onAcceptedPromotionalOffer$1;->L$0:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;

    .line 44
    .line 45
    :try_start_0
    invoke-static {p3}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/revenuecat/purchases/PurchasesException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    .line 47
    .line 48
    goto/16 :goto_4

    .line 49
    .line 50
    :catch_0
    move-exception p2

    .line 51
    goto :goto_3

    .line 52
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 53
    .line 54
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 55
    .line 56
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    throw p1

    .line 60
    :cond_2
    iget-object p1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$onAcceptedPromotionalOffer$1;->L$0:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast p1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;

    .line 63
    .line 64
    :try_start_1
    invoke-static {p3}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_1
    .catch Lcom/revenuecat/purchases/PurchasesException; {:try_start_1 .. :try_end_1} :catch_0

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_3
    invoke-static {p3}, LTd/v;->b(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    if-nez p2, :cond_4

    .line 72
    .line 73
    sget-object p1, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;

    .line 74
    .line 75
    const-string p2, "Activity is null when accepting promotional offer"

    .line 76
    .line 77
    invoke-virtual {p1, p2}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->e(Ljava/lang/String;)V

    .line 78
    .line 79
    .line 80
    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->_actionError:LY/C0;

    .line 81
    .line 82
    new-instance p2, Lcom/revenuecat/purchases/PurchasesError;

    .line 83
    .line 84
    sget-object p3, Lcom/revenuecat/purchases/PurchasesErrorCode;->PurchaseInvalidError:Lcom/revenuecat/purchases/PurchasesErrorCode;

    .line 85
    .line 86
    const-string v0, "Couldn\'t perform purchase"

    .line 87
    .line 88
    invoke-direct {p2, p3, v0}, Lcom/revenuecat/purchases/PurchasesError;-><init>(Lcom/revenuecat/purchases/PurchasesErrorCode;Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    invoke-interface {p1, p2}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    sget-object p1, LTd/L;->a:LTd/L;

    .line 95
    .line 96
    return-object p1

    .line 97
    :cond_4
    new-instance p3, Lcom/revenuecat/purchases/PurchaseParams$Builder;

    .line 98
    .line 99
    invoke-direct {p3, p2, p1}, Lcom/revenuecat/purchases/PurchaseParams$Builder;-><init>(Landroid/app/Activity;Lcom/revenuecat/purchases/models/SubscriptionOption;)V

    .line 100
    .line 101
    .line 102
    :try_start_2
    iget-object p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->purchases:Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;

    .line 103
    .line 104
    iput-object p0, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$onAcceptedPromotionalOffer$1;->L$0:Ljava/lang/Object;

    .line 105
    .line 106
    iput v4, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$onAcceptedPromotionalOffer$1;->label:I

    .line 107
    .line 108
    invoke-interface {p1, p3, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;->awaitPurchase(Lcom/revenuecat/purchases/PurchaseParams$Builder;LZd/e;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p3
    :try_end_2
    .catch Lcom/revenuecat/purchases/PurchasesException; {:try_start_2 .. :try_end_2} :catch_1

    .line 112
    if-ne p3, v1, :cond_5

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_5
    move-object p1, p0

    .line 116
    :goto_1
    :try_start_3
    check-cast p3, Lcom/revenuecat/purchases/PurchaseResult;

    .line 117
    .line 118
    invoke-virtual {p3}, Lcom/revenuecat/purchases/PurchaseResult;->getCustomerInfo()Lcom/revenuecat/purchases/CustomerInfo;

    .line 119
    .line 120
    .line 121
    move-result-object p2

    .line 122
    invoke-virtual {p3}, Lcom/revenuecat/purchases/PurchaseResult;->getStoreTransaction()Lcom/revenuecat/purchases/models/StoreTransaction;

    .line 123
    .line 124
    .line 125
    move-result-object p3

    .line 126
    invoke-direct {p1, p2, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->notifyListenersForPromotionalOfferSucceeded(Lcom/revenuecat/purchases/CustomerInfo;Lcom/revenuecat/purchases/models/StoreTransaction;)V

    .line 127
    .line 128
    .line 129
    iput-object p1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$onAcceptedPromotionalOffer$1;->L$0:Ljava/lang/Object;

    .line 130
    .line 131
    iput v3, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$onAcceptedPromotionalOffer$1;->label:I

    .line 132
    .line 133
    invoke-virtual {p1, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->loadCustomerCenter(LZd/e;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p1
    :try_end_3
    .catch Lcom/revenuecat/purchases/PurchasesException; {:try_start_3 .. :try_end_3} :catch_0

    .line 137
    if-ne p1, v1, :cond_6

    .line 138
    .line 139
    :goto_2
    return-object v1

    .line 140
    :catch_1
    move-exception p2

    .line 141
    move-object p1, p0

    .line 142
    :goto_3
    invoke-virtual {p2}, Lcom/revenuecat/purchases/PurchasesException;->getCode()Lcom/revenuecat/purchases/PurchasesErrorCode;

    .line 143
    .line 144
    .line 145
    move-result-object p3

    .line 146
    sget-object v0, Lcom/revenuecat/purchases/PurchasesErrorCode;->PurchaseCancelledError:Lcom/revenuecat/purchases/PurchasesErrorCode;

    .line 147
    .line 148
    if-eq p3, v0, :cond_6

    .line 149
    .line 150
    iget-object p3, p1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->_actionError:LY/C0;

    .line 151
    .line 152
    invoke-virtual {p2}, Lcom/revenuecat/purchases/PurchasesException;->getError()Lcom/revenuecat/purchases/PurchasesError;

    .line 153
    .line 154
    .line 155
    move-result-object p2

    .line 156
    invoke-interface {p3, p2}, LY/C0;->setValue(Ljava/lang/Object;)V

    .line 157
    .line 158
    .line 159
    invoke-direct {p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->goBackToMain()V

    .line 160
    .line 161
    .line 162
    :cond_6
    :goto_4
    sget-object p1, LTd/L;->a:LTd/L;

    .line 163
    .line 164
    return-object p1
.end method

.method public onActivityResumed()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->shouldRefreshOnResume:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->shouldRefreshOnResume:Z

    .line 7
    .line 8
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;

    .line 9
    .line 10
    const-string v1, "Refreshing Customer Center after returning from manage subscriptions"

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->d(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->launchRefreshIfPossible()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public onActivityStarted()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->wasBackgrounded:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->wasBackgrounded:Z

    .line 7
    .line 8
    iget-boolean v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->shouldRefreshOnResume:Z

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-direct {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->launchRefreshIfPossible()V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method

.method public onActivityStopped(Z)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x1

    .line 4
    iput-boolean p1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->wasBackgrounded:Z

    .line 5
    .line 6
    :cond_0
    return-void
.end method

.method public onCustomActionSelected(Lcom/revenuecat/purchases/customercenter/CustomActionData;)V
    .locals 1

    .line 1
    const-string v0, "customActionData"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->notifyListenersForCustomActionSelected(Lcom/revenuecat/purchases/customercenter/CustomActionData;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public onNavigationButtonPressed(Landroid/content/Context;Lie/a;)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lie/a;",
            ")V"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "context"

    .line 6
    .line 7
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-string v2, "onDismiss"

    .line 11
    .line 12
    move-object/from16 v3, p2

    .line 13
    .line 14
    invoke-static {v3, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iget-object v2, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->_state:LJf/u;

    .line 18
    .line 19
    invoke-interface {v2}, LJf/u;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState;

    .line 24
    .line 25
    instance-of v4, v2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 26
    .line 27
    if-eqz v4, :cond_0

    .line 28
    .line 29
    check-cast v2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 30
    .line 31
    invoke-virtual {v2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->getCurrentDestination()Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterDestination;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    instance-of v4, v4, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterDestination$PromotionalOffer;

    .line 36
    .line 37
    if-eqz v4, :cond_0

    .line 38
    .line 39
    invoke-virtual {v2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->getCurrentDestination()Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterDestination;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    const-string v3, "null cannot be cast to non-null type com.revenuecat.purchases.ui.revenuecatui.customercenter.navigation.CustomerCenterDestination.PromotionalOffer"

    .line 44
    .line 45
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    check-cast v2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterDestination$PromotionalOffer;

    .line 49
    .line 50
    invoke-virtual {v2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterDestination$PromotionalOffer;->getData()Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PromotionalOfferData;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    invoke-virtual {v2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PromotionalOfferData;->getOriginalPath()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    invoke-virtual {v0, v1, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->dismissPromotionalOffer(Landroid/content/Context;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_0
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->getState()LJf/I;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-interface {v1}, LJf/I;->getValue()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    check-cast v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState;

    .line 71
    .line 72
    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState;->getNavigationButtonType()Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$NavigationButtonType;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    iget-object v2, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->_state:LJf/u;

    .line 77
    .line 78
    :cond_1
    invoke-interface {v2}, LJf/u;->getValue()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    move-object v5, v4

    .line 83
    check-cast v5, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState;

    .line 84
    .line 85
    instance-of v6, v5, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 86
    .line 87
    if-eqz v6, :cond_4

    .line 88
    .line 89
    sget-object v6, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$NavigationButtonType;->BACK:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$NavigationButtonType;

    .line 90
    .line 91
    if-ne v1, v6, :cond_4

    .line 92
    .line 93
    move-object v7, v5

    .line 94
    check-cast v7, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 95
    .line 96
    invoke-virtual {v7}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->getNavigationState()Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterNavigationState;

    .line 97
    .line 98
    .line 99
    move-result-object v5

    .line 100
    invoke-virtual {v5}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterNavigationState;->getCanNavigateBack()Z

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    if-eqz v5, :cond_3

    .line 105
    .line 106
    invoke-virtual {v7}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->getNavigationState()Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterNavigationState;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    invoke-virtual {v5}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterNavigationState;->pop()Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterNavigationState;

    .line 111
    .line 112
    .line 113
    move-result-object v14

    .line 114
    invoke-virtual {v14}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterNavigationState;->getCanNavigateBack()Z

    .line 115
    .line 116
    .line 117
    move-result v5

    .line 118
    if-eqz v5, :cond_2

    .line 119
    .line 120
    :goto_0
    move-object v15, v6

    .line 121
    goto :goto_1

    .line 122
    :cond_2
    sget-object v6, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$NavigationButtonType;->CLOSE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$NavigationButtonType;

    .line 123
    .line 124
    goto :goto_0

    .line 125
    :goto_1
    const/16 v19, 0x73f

    .line 126
    .line 127
    const/16 v20, 0x0

    .line 128
    .line 129
    const/4 v8, 0x0

    .line 130
    const/4 v9, 0x0

    .line 131
    const/4 v10, 0x0

    .line 132
    const/4 v11, 0x0

    .line 133
    const/4 v12, 0x0

    .line 134
    const/4 v13, 0x0

    .line 135
    const/16 v16, 0x0

    .line 136
    .line 137
    const/16 v17, 0x0

    .line 138
    .line 139
    const/16 v18, 0x0

    .line 140
    .line 141
    invoke-static/range {v7 .. v20}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->copy$default(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesState;Lcom/revenuecat/purchases/Offering;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterNavigationState;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$NavigationButtonType;Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;ZZILjava/lang/Object;)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 142
    .line 143
    .line 144
    move-result-object v5

    .line 145
    goto :goto_2

    .line 146
    :cond_3
    sget-object v5, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$NotLoaded;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$NotLoaded;

    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_4
    sget-object v5, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$NotLoaded;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$NotLoaded;

    .line 150
    .line 151
    :goto_2
    invoke-interface {v2, v4, v5}, LJf/u;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v4

    .line 155
    if-eqz v4, :cond_1

    .line 156
    .line 157
    sget-object v2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$NavigationButtonType;->CLOSE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$NavigationButtonType;

    .line 158
    .line 159
    if-ne v1, v2, :cond_5

    .line 160
    .line 161
    invoke-interface {v3}, Lie/a;->invoke()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    :cond_5
    return-void
.end method

.method public openURL(Landroid/content/Context;Ljava/lang/String;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$OpenMethod;)V
    .locals 1

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "url"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "method"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$WhenMappings;->$EnumSwitchMapping$1:[I

    .line 17
    .line 18
    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    .line 19
    .line 20
    .line 21
    move-result p3

    .line 22
    aget p3, v0, p3

    .line 23
    .line 24
    const/4 v0, 0x1

    .line 25
    if-eq p3, v0, :cond_1

    .line 26
    .line 27
    const/4 v0, 0x2

    .line 28
    if-ne p3, v0, :cond_0

    .line 29
    .line 30
    sget-object p3, Lcom/revenuecat/purchases/ui/revenuecatui/utils/URLOpeningMethod;->EXTERNAL_BROWSER:Lcom/revenuecat/purchases/ui/revenuecatui/utils/URLOpeningMethod;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    new-instance p1, LTd/r;

    .line 34
    .line 35
    invoke-direct {p1}, LTd/r;-><init>()V

    .line 36
    .line 37
    .line 38
    throw p1

    .line 39
    :cond_1
    sget-object p3, Lcom/revenuecat/purchases/ui/revenuecatui/utils/URLOpeningMethod;->IN_APP_BROWSER:Lcom/revenuecat/purchases/ui/revenuecatui/utils/URLOpeningMethod;

    .line 40
    .line 41
    :goto_0
    sget-object v0, Lcom/revenuecat/purchases/ui/revenuecatui/utils/URLOpener;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/utils/URLOpener;

    .line 42
    .line 43
    invoke-virtual {v0, p1, p2, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/utils/URLOpener;->openURL$revenuecatui_defaultsBc8Release(Landroid/content/Context;Ljava/lang/String;Lcom/revenuecat/purchases/ui/revenuecatui/utils/URLOpeningMethod;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public pathButtonPressed(Landroid/content/Context;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;)V
    .locals 9

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "path"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p2, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->notifyListenersForManagementOptionSelected(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p2}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;->getFeedbackSurvey()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    new-instance v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$pathButtonPressed$1$1;

    .line 21
    .line 22
    invoke-direct {v1, p0, p2, p1, p3}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$pathButtonPressed$1$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;Landroid/content/Context;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;)V

    .line 23
    .line 24
    .line 25
    invoke-direct {p0, v0, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->displayFeedbackSurvey(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath$PathDetail$FeedbackSurvey;Lkotlin/jvm/functions/Function1;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    invoke-static {p0}, Landroidx/lifecycle/V;->a(Landroidx/lifecycle/U;)LGf/O;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    new-instance v3, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$pathButtonPressed$2;

    .line 34
    .line 35
    const/4 v8, 0x0

    .line 36
    move-object v4, p0

    .line 37
    move-object v5, p1

    .line 38
    move-object v7, p2

    .line 39
    move-object v6, p3

    .line 40
    invoke-direct/range {v3 .. v8}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$pathButtonPressed$2;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;Landroid/content/Context;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$HelpPath;LZd/e;)V

    .line 41
    .line 42
    .line 43
    const/4 v6, 0x3

    .line 44
    const/4 v7, 0x0

    .line 45
    move-object v5, v3

    .line 46
    const/4 v3, 0x0

    .line 47
    const/4 v4, 0x0

    .line 48
    invoke-static/range {v2 .. v7}, LGf/i;->d(LGf/O;LZd/i;LGf/Q;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)LGf/C0;

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public refreshColors(LU/l;Z)V
    .locals 1

    .line 1
    const-string v0, "currentColorScheme"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iput-boolean p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->isDarkMode:Z

    .line 7
    .line 8
    iget-object p2, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->_colorScheme:LJf/u;

    .line 9
    .line 10
    invoke-interface {p2, p1}, LJf/u;->setValue(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public refreshCustomerCenter(LZd/e;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZd/e;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->loadCustomerCenter(ZLZd/e;)Ljava/lang/Object;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-ne p1, v0, :cond_0

    .line 11
    .line 12
    return-object p1

    .line 13
    :cond_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 14
    .line 15
    return-object p1
.end method

.method public refreshStateIfLocaleChanged()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->getCurrentLocaleList()LG1/i;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->_lastLocaleList:LJf/u;

    .line 6
    .line 7
    invoke-interface {v1}, LJf/u;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {v1, v0}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    iget-object v1, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->_lastLocaleList:LJf/u;

    .line 18
    .line 19
    invoke-interface {v1, v0}, LJf/u;->setValue(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method

.method public restorePurchases(LZd/e;)Ljava/lang/Object;
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LZd/e;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    instance-of v2, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$restorePurchases$1;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v0

    .line 10
    check-cast v2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$restorePurchases$1;

    .line 11
    .line 12
    iget v3, v2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$restorePurchases$1;->label:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$restorePurchases$1;->label:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$restorePurchases$1;

    .line 25
    .line 26
    invoke-direct {v2, v1, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$restorePurchases$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;LZd/e;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v0, v2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$restorePurchases$1;->result:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    iget v4, v2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$restorePurchases$1;->label:I

    .line 36
    .line 37
    const/4 v5, 0x3

    .line 38
    const/4 v6, 0x2

    .line 39
    const/4 v7, 0x1

    .line 40
    if-eqz v4, :cond_4

    .line 41
    .line 42
    if-eq v4, v7, :cond_3

    .line 43
    .line 44
    if-eq v4, v6, :cond_2

    .line 45
    .line 46
    if-ne v4, v5, :cond_1

    .line 47
    .line 48
    iget-object v2, v2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$restorePurchases$1;->L$0:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;

    .line 51
    .line 52
    :try_start_0
    invoke-static {v0}, LTd/v;->b(Ljava/lang/Object;)V
    :try_end_0
    .catch Lcom/revenuecat/purchases/PurchasesException; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    .line 54
    .line 55
    goto/16 :goto_4

    .line 56
    .line 57
    :catch_0
    move-exception v0

    .line 58
    goto/16 :goto_8

    .line 59
    .line 60
    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 61
    .line 62
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 63
    .line 64
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw v0

    .line 68
    :cond_2
    iget-object v4, v2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$restorePurchases$1;->L$0:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v4, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;

    .line 71
    .line 72
    invoke-static {v0}, LTd/v;->b(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_3
    iget-object v4, v2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$restorePurchases$1;->L$0:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v4, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;

    .line 79
    .line 80
    invoke-static {v0}, LTd/v;->b(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_4
    invoke-static {v0}, LTd/v;->b(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    iget-object v0, v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->listener:Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;

    .line 88
    .line 89
    iput-object v1, v2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$restorePurchases$1;->L$0:Ljava/lang/Object;

    .line 90
    .line 91
    iput v7, v2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$restorePurchases$1;->label:I

    .line 92
    .line 93
    const-string v4, "listener"

    .line 94
    .line 95
    invoke-direct {v1, v0, v4, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->shouldResumeRestorePurchases(Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;Ljava/lang/String;LZd/e;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    if-ne v0, v3, :cond_5

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_5
    move-object v4, v1

    .line 103
    :goto_1
    check-cast v0, Ljava/lang/Boolean;

    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-eqz v0, :cond_12

    .line 110
    .line 111
    iget-object v0, v4, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->purchases:Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;

    .line 112
    .line 113
    invoke-interface {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;->getCustomerCenterListener()Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    iput-object v4, v2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$restorePurchases$1;->L$0:Ljava/lang/Object;

    .line 118
    .line 119
    iput v6, v2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$restorePurchases$1;->label:I

    .line 120
    .line 121
    const-string v6, "purchases.customerCenterListener"

    .line 122
    .line 123
    invoke-direct {v4, v0, v6, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->shouldResumeRestorePurchases(Lcom/revenuecat/purchases/customercenter/CustomerCenterListener;Ljava/lang/String;LZd/e;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    if-ne v0, v3, :cond_6

    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_6
    :goto_2
    check-cast v0, Ljava/lang/Boolean;

    .line 131
    .line 132
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    if-nez v0, :cond_7

    .line 137
    .line 138
    goto/16 :goto_a

    .line 139
    .line 140
    :cond_7
    invoke-direct {v4}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->notifyListenersForRestoreStarted()V

    .line 141
    .line 142
    .line 143
    iget-object v0, v4, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->_state:LJf/u;

    .line 144
    .line 145
    :cond_8
    invoke-interface {v0}, LJf/u;->getValue()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v6

    .line 149
    move-object v8, v6

    .line 150
    check-cast v8, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState;

    .line 151
    .line 152
    instance-of v9, v8, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 153
    .line 154
    if-eqz v9, :cond_9

    .line 155
    .line 156
    move-object v10, v8

    .line 157
    check-cast v10, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 158
    .line 159
    sget-object v15, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesState;->RESTORING:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesState;

    .line 160
    .line 161
    const/16 v22, 0x7ef

    .line 162
    .line 163
    const/16 v23, 0x0

    .line 164
    .line 165
    const/4 v11, 0x0

    .line 166
    const/4 v12, 0x0

    .line 167
    const/4 v13, 0x0

    .line 168
    const/4 v14, 0x0

    .line 169
    const/16 v16, 0x0

    .line 170
    .line 171
    const/16 v17, 0x0

    .line 172
    .line 173
    const/16 v18, 0x0

    .line 174
    .line 175
    const/16 v19, 0x0

    .line 176
    .line 177
    const/16 v20, 0x0

    .line 178
    .line 179
    const/16 v21, 0x0

    .line 180
    .line 181
    invoke-static/range {v10 .. v23}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->copy$default(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesState;Lcom/revenuecat/purchases/Offering;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterNavigationState;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$NavigationButtonType;Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;ZZILjava/lang/Object;)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 182
    .line 183
    .line 184
    move-result-object v8

    .line 185
    :cond_9
    invoke-interface {v0, v6, v8}, LJf/u;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result v6

    .line 189
    if-eqz v6, :cond_8

    .line 190
    .line 191
    :try_start_1
    iget-object v0, v4, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->purchases:Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;

    .line 192
    .line 193
    iput-object v4, v2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$restorePurchases$1;->L$0:Ljava/lang/Object;

    .line 194
    .line 195
    iput v5, v2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$restorePurchases$1;->label:I

    .line 196
    .line 197
    invoke-interface {v0, v2}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;->awaitRestore(LZd/e;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v0
    :try_end_1
    .catch Lcom/revenuecat/purchases/PurchasesException; {:try_start_1 .. :try_end_1} :catch_1

    .line 201
    if-ne v0, v3, :cond_a

    .line 202
    .line 203
    :goto_3
    return-object v3

    .line 204
    :cond_a
    move-object v2, v4

    .line 205
    :goto_4
    :try_start_2
    check-cast v0, Lcom/revenuecat/purchases/CustomerInfo;

    .line 206
    .line 207
    invoke-virtual {v0}, Lcom/revenuecat/purchases/CustomerInfo;->getActiveSubscriptions()Ljava/util/Set;

    .line 208
    .line 209
    .line 210
    move-result-object v3

    .line 211
    check-cast v3, Ljava/util/Collection;

    .line 212
    .line 213
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 214
    .line 215
    .line 216
    move-result v3

    .line 217
    if-eqz v3, :cond_c

    .line 218
    .line 219
    invoke-virtual {v0}, Lcom/revenuecat/purchases/CustomerInfo;->getNonSubscriptionTransactions()Ljava/util/List;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 224
    .line 225
    .line 226
    move-result v3

    .line 227
    if-nez v3, :cond_b

    .line 228
    .line 229
    goto :goto_5

    .line 230
    :cond_b
    const/4 v7, 0x0

    .line 231
    :cond_c
    :goto_5
    invoke-direct {v2, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->notifyListenersForRestoreCompleted(Lcom/revenuecat/purchases/CustomerInfo;)V

    .line 232
    .line 233
    .line 234
    iget-object v0, v2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->_state:LJf/u;

    .line 235
    .line 236
    :cond_d
    invoke-interface {v0}, LJf/u;->getValue()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v3

    .line 240
    move-object v4, v3

    .line 241
    check-cast v4, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState;

    .line 242
    .line 243
    instance-of v5, v4, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 244
    .line 245
    if-eqz v5, :cond_f

    .line 246
    .line 247
    move-object v8, v4

    .line 248
    check-cast v8, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 249
    .line 250
    if-eqz v7, :cond_e

    .line 251
    .line 252
    sget-object v4, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesState;->PURCHASES_RECOVERED:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesState;

    .line 253
    .line 254
    :goto_6
    move-object v13, v4

    .line 255
    goto :goto_7

    .line 256
    :cond_e
    sget-object v4, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesState;->PURCHASES_NOT_FOUND:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesState;

    .line 257
    .line 258
    goto :goto_6

    .line 259
    :goto_7
    const/16 v20, 0x7ef

    .line 260
    .line 261
    const/16 v21, 0x0

    .line 262
    .line 263
    const/4 v9, 0x0

    .line 264
    const/4 v10, 0x0

    .line 265
    const/4 v11, 0x0

    .line 266
    const/4 v12, 0x0

    .line 267
    const/4 v14, 0x0

    .line 268
    const/4 v15, 0x0

    .line 269
    const/16 v16, 0x0

    .line 270
    .line 271
    const/16 v17, 0x0

    .line 272
    .line 273
    const/16 v18, 0x0

    .line 274
    .line 275
    const/16 v19, 0x0

    .line 276
    .line 277
    invoke-static/range {v8 .. v21}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->copy$default(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesState;Lcom/revenuecat/purchases/Offering;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterNavigationState;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$NavigationButtonType;Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;ZZILjava/lang/Object;)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 278
    .line 279
    .line 280
    move-result-object v4

    .line 281
    :cond_f
    invoke-interface {v0, v3, v4}, LJf/u;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    move-result v3
    :try_end_2
    .catch Lcom/revenuecat/purchases/PurchasesException; {:try_start_2 .. :try_end_2} :catch_0

    .line 285
    if-eqz v3, :cond_d

    .line 286
    .line 287
    goto :goto_9

    .line 288
    :catch_1
    move-exception v0

    .line 289
    move-object v2, v4

    .line 290
    :goto_8
    sget-object v3, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;

    .line 291
    .line 292
    const-string v4, "Error restoring purchases"

    .line 293
    .line 294
    invoke-virtual {v3, v4, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->e(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v0}, Lcom/revenuecat/purchases/PurchasesException;->getError()Lcom/revenuecat/purchases/PurchasesError;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    invoke-direct {v2, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->notifyListenersForRestoreFailed(Lcom/revenuecat/purchases/PurchasesError;)V

    .line 302
    .line 303
    .line 304
    iget-object v6, v2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->_state:LJf/u;

    .line 305
    .line 306
    :cond_10
    invoke-interface {v6}, LJf/u;->getValue()Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v0

    .line 310
    move-object v2, v0

    .line 311
    check-cast v2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState;

    .line 312
    .line 313
    instance-of v3, v2, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 314
    .line 315
    if-eqz v3, :cond_11

    .line 316
    .line 317
    move-object v7, v2

    .line 318
    check-cast v7, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 319
    .line 320
    sget-object v12, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesState;->PURCHASES_NOT_FOUND:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesState;

    .line 321
    .line 322
    const/16 v19, 0x7ef

    .line 323
    .line 324
    const/16 v20, 0x0

    .line 325
    .line 326
    const/4 v8, 0x0

    .line 327
    const/4 v9, 0x0

    .line 328
    const/4 v10, 0x0

    .line 329
    const/4 v11, 0x0

    .line 330
    const/4 v13, 0x0

    .line 331
    const/4 v14, 0x0

    .line 332
    const/4 v15, 0x0

    .line 333
    const/16 v16, 0x0

    .line 334
    .line 335
    const/16 v17, 0x0

    .line 336
    .line 337
    const/16 v18, 0x0

    .line 338
    .line 339
    invoke-static/range {v7 .. v20}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->copy$default(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesState;Lcom/revenuecat/purchases/Offering;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterNavigationState;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$NavigationButtonType;Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;ZZILjava/lang/Object;)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 340
    .line 341
    .line 342
    move-result-object v2

    .line 343
    :cond_11
    invoke-interface {v6, v0, v2}, LJf/u;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 344
    .line 345
    .line 346
    move-result v0

    .line 347
    if-eqz v0, :cond_10

    .line 348
    .line 349
    :goto_9
    sget-object v0, LTd/L;->a:LTd/L;

    .line 350
    .line 351
    return-object v0

    .line 352
    :cond_12
    :goto_a
    sget-object v0, LTd/L;->a:LTd/L;

    .line 353
    .line 354
    return-object v0
.end method

.method public selectPurchase(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "purchase"

    .line 6
    .line 7
    invoke-static {v1, v2}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v2, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->_state:LJf/u;

    .line 11
    .line 12
    :cond_0
    invoke-interface {v2}, LJf/u;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    move-object v4, v3

    .line 17
    check-cast v4, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState;

    .line 18
    .line 19
    instance-of v5, v4, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 20
    .line 21
    if-eqz v5, :cond_2

    .line 22
    .line 23
    move-object v6, v4

    .line 24
    check-cast v6, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 25
    .line 26
    invoke-virtual {v6}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->getCustomerCenterConfigData()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    invoke-virtual {v4}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;->getManagementScreen()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    if-eqz v4, :cond_1

    .line 35
    .line 36
    invoke-virtual {v6}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->getCustomerCenterConfigData()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-virtual {v5}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;->getLocalization()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;

    .line 41
    .line 42
    .line 43
    move-result-object v5

    .line 44
    invoke-direct {v0, v1, v4, v5}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->supportedPaths(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    sget-object v7, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PathUtils;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PathUtils;

    .line 49
    .line 50
    invoke-virtual {v7, v5}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PathUtils;->filterSubscriptionSpecificPaths(Ljava/util/List;)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v10

    .line 54
    invoke-virtual {v6}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->getNavigationState()Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterNavigationState;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    new-instance v7, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterDestination$SelectedPurchaseDetail;

    .line 59
    .line 60
    invoke-virtual {v4}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Screen;->getTitle()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    invoke-direct {v7, v1, v4}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterDestination$SelectedPurchaseDetail;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/PurchaseInformation;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v5, v7}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterNavigationState;->push(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterDestination;)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterNavigationState;

    .line 68
    .line 69
    .line 70
    move-result-object v13

    .line 71
    sget-object v14, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$NavigationButtonType;->BACK:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$NavigationButtonType;

    .line 72
    .line 73
    const/16 v18, 0x737

    .line 74
    .line 75
    const/16 v19, 0x0

    .line 76
    .line 77
    const/4 v7, 0x0

    .line 78
    const/4 v8, 0x0

    .line 79
    const/4 v9, 0x0

    .line 80
    const/4 v11, 0x0

    .line 81
    const/4 v12, 0x0

    .line 82
    const/4 v15, 0x0

    .line 83
    const/16 v16, 0x0

    .line 84
    .line 85
    const/16 v17, 0x0

    .line 86
    .line 87
    invoke-static/range {v6 .. v19}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->copy$default(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesState;Lcom/revenuecat/purchases/Offering;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterNavigationState;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$NavigationButtonType;Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;ZZILjava/lang/Object;)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    goto :goto_0

    .line 92
    :cond_1
    sget-object v4, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->INSTANCE:Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;

    .line 93
    .line 94
    const-string v5, "No management screen available in the customer center config data"

    .line 95
    .line 96
    invoke-virtual {v4, v5}, Lcom/revenuecat/purchases/ui/revenuecatui/helpers/Logger;->e(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    new-instance v4, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Error;

    .line 100
    .line 101
    new-instance v6, Lcom/revenuecat/purchases/PurchasesError;

    .line 102
    .line 103
    sget-object v7, Lcom/revenuecat/purchases/PurchasesErrorCode;->UnknownError:Lcom/revenuecat/purchases/PurchasesErrorCode;

    .line 104
    .line 105
    invoke-direct {v6, v7, v5}, Lcom/revenuecat/purchases/PurchasesError;-><init>(Lcom/revenuecat/purchases/PurchasesErrorCode;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    invoke-direct {v4, v6}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Error;-><init>(Lcom/revenuecat/purchases/PurchasesError;)V

    .line 109
    .line 110
    .line 111
    :cond_2
    :goto_0
    invoke-interface {v2, v3, v4}, LJf/u;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    if-eqz v3, :cond_0

    .line 116
    .line 117
    return-void
.end method

.method public showCreateSupportTicket()V
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->_state:LJf/u;

    .line 4
    .line 5
    invoke-interface {v1}, LJf/u;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState;

    .line 10
    .line 11
    instance-of v2, v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 12
    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object v2, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->_state:LJf/u;

    .line 17
    .line 18
    :cond_1
    invoke-interface {v2}, LJf/u;->getValue()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    move-object v4, v3

    .line 23
    check-cast v4, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState;

    .line 24
    .line 25
    instance-of v5, v4, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 26
    .line 27
    if-eqz v5, :cond_2

    .line 28
    .line 29
    new-instance v5, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterDestination$CreateSupportTicket;

    .line 30
    .line 31
    new-instance v6, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CreateSupportTicketData;

    .line 32
    .line 33
    new-instance v7, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$showCreateSupportTicket$1$createSupportTicketDestination$1;

    .line 34
    .line 35
    invoke-direct {v7, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$showCreateSupportTicket$1$createSupportTicketDestination$1;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;)V

    .line 36
    .line 37
    .line 38
    new-instance v8, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$showCreateSupportTicket$1$createSupportTicketDestination$2;

    .line 39
    .line 40
    invoke-direct {v8, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$showCreateSupportTicket$1$createSupportTicketDestination$2;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;)V

    .line 41
    .line 42
    .line 43
    new-instance v9, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$showCreateSupportTicket$1$createSupportTicketDestination$3;

    .line 44
    .line 45
    invoke-direct {v9, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl$showCreateSupportTicket$1$createSupportTicketDestination$3;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;)V

    .line 46
    .line 47
    .line 48
    invoke-direct {v6, v7, v8, v9}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CreateSupportTicketData;-><init>(Lie/p;Lie/a;Lie/a;)V

    .line 49
    .line 50
    .line 51
    move-object v7, v1

    .line 52
    check-cast v7, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 53
    .line 54
    invoke-virtual {v7}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->getCustomerCenterConfigData()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    invoke-virtual {v7}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;->getLocalization()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;

    .line 59
    .line 60
    .line 61
    move-result-object v7

    .line 62
    sget-object v8, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;->SUPPORT_TICKET_CREATE:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;

    .line 63
    .line 64
    invoke-virtual {v7, v8}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;->commonLocalizedString(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    invoke-direct {v5, v6, v7}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterDestination$CreateSupportTicket;-><init>(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CreateSupportTicketData;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    move-object v8, v4

    .line 72
    check-cast v8, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 73
    .line 74
    invoke-virtual {v8}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->getNavigationState()Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterNavigationState;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-virtual {v4, v5}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterNavigationState;->push(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterDestination;)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterNavigationState;

    .line 79
    .line 80
    .line 81
    move-result-object v15

    .line 82
    sget-object v16, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$NavigationButtonType;->BACK:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$NavigationButtonType;

    .line 83
    .line 84
    const/16 v20, 0x73f

    .line 85
    .line 86
    const/16 v21, 0x0

    .line 87
    .line 88
    const/4 v9, 0x0

    .line 89
    const/4 v10, 0x0

    .line 90
    const/4 v11, 0x0

    .line 91
    const/4 v12, 0x0

    .line 92
    const/4 v13, 0x0

    .line 93
    const/4 v14, 0x0

    .line 94
    const/16 v17, 0x0

    .line 95
    .line 96
    const/16 v18, 0x0

    .line 97
    .line 98
    const/16 v19, 0x0

    .line 99
    .line 100
    invoke-static/range {v8 .. v21}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->copy$default(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesState;Lcom/revenuecat/purchases/Offering;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterNavigationState;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$NavigationButtonType;Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;ZZILjava/lang/Object;)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    :cond_2
    invoke-interface {v2, v3, v4}, LJf/u;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    if-eqz v3, :cond_1

    .line 109
    .line 110
    :goto_0
    return-void
.end method

.method public showPaywall(Landroid/content/Context;)V
    .locals 2

    .line 1
    const-string v0, "context"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->_state:LJf/u;

    .line 7
    .line 8
    invoke-interface {v0}, LJf/u;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState;

    .line 13
    .line 14
    instance-of v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    check-cast v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->getNoActiveScreenOffering()Lcom/revenuecat/purchases/Offering;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-direct {p0, p1, v0}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->launchPaywallActivity(Landroid/content/Context;Lcom/revenuecat/purchases/Offering;)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    invoke-direct {p0, p1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->tryFallbackToCurrentOffering(Landroid/content/Context;)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public showVirtualCurrencyBalances()V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->_state:LJf/u;

    .line 4
    .line 5
    invoke-interface {v1}, LJf/u;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState;

    .line 10
    .line 11
    instance-of v2, v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 12
    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    check-cast v1, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 17
    .line 18
    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->getCustomerCenterConfigData()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v2}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;->getSupport()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v2}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Support;->getDisplayVirtualCurrencies()Ljava/lang/Boolean;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 31
    .line 32
    invoke-static {v2, v3}, Lkotlin/jvm/internal/s;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-nez v2, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    iget-object v2, v0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->_state:LJf/u;

    .line 40
    .line 41
    :cond_2
    invoke-interface {v2}, LJf/u;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    move-object v4, v3

    .line 46
    check-cast v4, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState;

    .line 47
    .line 48
    instance-of v5, v4, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 49
    .line 50
    if-eqz v5, :cond_3

    .line 51
    .line 52
    new-instance v5, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterDestination$VirtualCurrencyBalances;

    .line 53
    .line 54
    invoke-virtual {v1}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->getCustomerCenterConfigData()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    invoke-virtual {v6}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;->getLocalization()Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    sget-object v7, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;->VIRTUAL_CURRENCY_BALANCES_SCREEN_HEADER:Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;

    .line 63
    .line 64
    invoke-virtual {v6, v7}, Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization;->commonLocalizedString(Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData$Localization$CommonLocalizedString;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    invoke-direct {v5, v6}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterDestination$VirtualCurrencyBalances;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    move-object v7, v4

    .line 72
    check-cast v7, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 73
    .line 74
    invoke-virtual {v7}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->getNavigationState()Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterNavigationState;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-virtual {v4, v5}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterNavigationState;->push(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterDestination;)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterNavigationState;

    .line 79
    .line 80
    .line 81
    move-result-object v14

    .line 82
    sget-object v15, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$NavigationButtonType;->BACK:Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$NavigationButtonType;

    .line 83
    .line 84
    const/16 v19, 0x73f

    .line 85
    .line 86
    const/16 v20, 0x0

    .line 87
    .line 88
    const/4 v8, 0x0

    .line 89
    const/4 v9, 0x0

    .line 90
    const/4 v10, 0x0

    .line 91
    const/4 v11, 0x0

    .line 92
    const/4 v12, 0x0

    .line 93
    const/4 v13, 0x0

    .line 94
    const/16 v16, 0x0

    .line 95
    .line 96
    const/16 v17, 0x0

    .line 97
    .line 98
    const/16 v18, 0x0

    .line 99
    .line 100
    invoke-static/range {v7 .. v20}, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;->copy$default(Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;Lcom/revenuecat/purchases/customercenter/CustomerCenterConfigData;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/dialogs/RestorePurchasesState;Lcom/revenuecat/purchases/Offering;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/navigation/CustomerCenterNavigationState;Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$NavigationButtonType;Lcom/revenuecat/purchases/virtualcurrencies/VirtualCurrencies;ZZILjava/lang/Object;)Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/data/CustomerCenterState$Success;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    :cond_3
    invoke-interface {v2, v3, v4}, LJf/u;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    if-eqz v3, :cond_2

    .line 109
    .line 110
    :goto_0
    return-void
.end method

.method public trackImpressionIfNeeded()V
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->impressionCreationData:Lcom/revenuecat/purchases/customercenter/events/CustomerCenterImpressionEvent$CreationData;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    new-instance v0, Lcom/revenuecat/purchases/customercenter/events/CustomerCenterImpressionEvent$CreationData;

    .line 6
    .line 7
    const/4 v1, 0x3

    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-direct {v0, v2, v2, v1, v2}, Lcom/revenuecat/purchases/customercenter/events/CustomerCenterImpressionEvent$CreationData;-><init>(Ljava/util/UUID;Ljava/util/Date;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->impressionCreationData:Lcom/revenuecat/purchases/customercenter/events/CustomerCenterImpressionEvent$CreationData;

    .line 13
    .line 14
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->_lastLocaleList:LJf/u;

    .line 15
    .line 16
    invoke-interface {v0}, LJf/u;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, LG1/i;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-virtual {v0, v1}, LG1/i;->c(I)Ljava/util/Locale;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    :cond_0
    new-instance v1, Lcom/revenuecat/purchases/customercenter/events/CustomerCenterImpressionEvent;

    .line 34
    .line 35
    new-instance v3, Lcom/revenuecat/purchases/customercenter/events/CustomerCenterImpressionEvent$Data;

    .line 36
    .line 37
    new-instance v4, Ljava/util/Date;

    .line 38
    .line 39
    invoke-direct {v4}, Ljava/util/Date;-><init>()V

    .line 40
    .line 41
    .line 42
    iget-boolean v5, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->isDarkMode:Z

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/util/Locale;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v6

    .line 48
    const-string v0, "locale.toString()"

    .line 49
    .line 50
    invoke-static {v6, v0}, Lkotlin/jvm/internal/s;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const/16 v10, 0x38

    .line 54
    .line 55
    const/4 v11, 0x0

    .line 56
    const/4 v7, 0x0

    .line 57
    const/4 v8, 0x0

    .line 58
    const/4 v9, 0x0

    .line 59
    invoke-direct/range {v3 .. v11}, Lcom/revenuecat/purchases/customercenter/events/CustomerCenterImpressionEvent$Data;-><init>(Ljava/util/Date;ZLjava/lang/String;IILcom/revenuecat/purchases/customercenter/events/CustomerCenterDisplayMode;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 60
    .line 61
    .line 62
    const/4 v0, 0x1

    .line 63
    invoke-direct {v1, v2, v3, v0, v2}, Lcom/revenuecat/purchases/customercenter/events/CustomerCenterImpressionEvent;-><init>(Lcom/revenuecat/purchases/customercenter/events/CustomerCenterImpressionEvent$CreationData;Lcom/revenuecat/purchases/customercenter/events/CustomerCenterImpressionEvent$Data;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 64
    .line 65
    .line 66
    iget-object v0, p0, Lcom/revenuecat/purchases/ui/revenuecatui/customercenter/viewmodel/CustomerCenterViewModelImpl;->purchases:Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;

    .line 67
    .line 68
    invoke-interface {v0, v1}, Lcom/revenuecat/purchases/ui/revenuecatui/data/PurchasesType;->track(Lcom/revenuecat/purchases/common/events/FeatureEvent;)V

    .line 69
    .line 70
    .line 71
    :cond_1
    return-void
.end method
