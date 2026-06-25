.class public final LCf/z;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LCf/i;


# instance fields
.field private final a:LCf/i;

.field private final b:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(LCf/i;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const-string v0, "sequence"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "transformer"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, LCf/z;->a:LCf/i;

    .line 15
    .line 16
    iput-object p2, p0, LCf/z;->b:Lkotlin/jvm/functions/Function1;

    .line 17
    .line 18
    return-void
.end method

.method public static final synthetic c(LCf/z;)LCf/i;
    .locals 0

    .line 1
    iget-object p0, p0, LCf/z;->a:LCf/i;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic d(LCf/z;)Lkotlin/jvm/functions/Function1;
    .locals 0

    .line 1
    iget-object p0, p0, LCf/z;->b:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public final e(Lkotlin/jvm/functions/Function1;)LCf/i;
    .locals 3

    .line 1
    const-string v0, "iterator"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, LCf/g;

    .line 7
    .line 8
    iget-object v1, p0, LCf/z;->a:LCf/i;

    .line 9
    .line 10
    iget-object v2, p0, LCf/z;->b:Lkotlin/jvm/functions/Function1;

    .line 11
    .line 12
    invoke-direct {v0, v1, v2, p1}, LCf/g;-><init>(LCf/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, LCf/z$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LCf/z$a;-><init>(LCf/z;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
