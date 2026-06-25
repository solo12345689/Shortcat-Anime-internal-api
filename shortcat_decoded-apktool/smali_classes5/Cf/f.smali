.class public final LCf/f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LCf/i;


# instance fields
.field private final a:LCf/i;

.field private final b:Z

.field private final c:Lkotlin/jvm/functions/Function1;


# direct methods
.method public constructor <init>(LCf/i;ZLkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const-string v0, "sequence"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "predicate"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, LCf/f;->a:LCf/i;

    .line 15
    .line 16
    iput-boolean p2, p0, LCf/f;->b:Z

    .line 17
    .line 18
    iput-object p3, p0, LCf/f;->c:Lkotlin/jvm/functions/Function1;

    .line 19
    .line 20
    return-void
.end method

.method public static final synthetic c(LCf/f;)Lkotlin/jvm/functions/Function1;
    .locals 0

    .line 1
    iget-object p0, p0, LCf/f;->c:Lkotlin/jvm/functions/Function1;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic d(LCf/f;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, LCf/f;->b:Z

    .line 2
    .line 3
    return p0
.end method

.method public static final synthetic e(LCf/f;)LCf/i;
    .locals 0

    .line 1
    iget-object p0, p0, LCf/f;->a:LCf/i;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, LCf/f$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LCf/f$a;-><init>(LCf/f;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
