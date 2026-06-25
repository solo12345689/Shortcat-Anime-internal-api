.class public final LCf/g;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LCf/i;


# instance fields
.field private final a:LCf/i;

.field private final b:Lkotlin/jvm/functions/Function1;

.field private final c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(LCf/i;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
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
    const-string v0, "iterator"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, LCf/g;->a:LCf/i;

    .line 20
    .line 21
    iput-object p2, p0, LCf/g;->b:Lkotlin/jvm/functions/Function1;

    .line 22
    .line 23
    iput-object p3, p0, LCf/g;->c:Lkotlin/jvm/functions/Function1;

    .line 24
    .line 25
    return-void
.end method

.method public static final synthetic c(LCf/g;)Lkotlin/jvm/functions/Function1;
    .locals 0

    .line 1
    iget-object p0, p0, LCf/g;->c:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic d(LCf/g;)LCf/i;
    .locals 0

    .line 1
    iget-object p0, p0, LCf/g;->a:LCf/i;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic e(LCf/g;)Lkotlin/jvm/functions/Function1;
    .locals 0

    .line 1
    iget-object p0, p0, LCf/g;->b:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, LCf/g$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LCf/g$a;-><init>(LCf/g;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
