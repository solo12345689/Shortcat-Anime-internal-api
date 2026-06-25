.class public final LN/o;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private a:Ljava/util/concurrent/atomic/AtomicReference;

.field private final b:LY/z0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, LN/o;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-static {v0}, LY/W0;->a(F)LY/z0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, LN/o;->b:LY/z0;

    .line 18
    .line 19
    return-void
.end method

.method public static final synthetic a(LN/o;)Ljava/util/concurrent/atomic/AtomicReference;
    .locals 0

    .line 1
    iget-object p0, p0, LN/o;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic b(LN/o;F)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LN/o;->d(F)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final d(F)V
    .locals 1

    .line 1
    iget-object v0, p0, LN/o;->b:LY/z0;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LY/z0;->k(F)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c()F
    .locals 1

    .line 1
    iget-object v0, p0, LN/o;->b:LY/z0;

    .line 2
    .line 3
    invoke-interface {v0}, LY/c0;->c()F

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final e(LZd/e;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, LN/o$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, v1}, LN/o$a;-><init>(LN/o;LZd/e;)V

    .line 5
    .line 6
    .line 7
    invoke-static {v0, p1}, LGf/P;->e(Lkotlin/jvm/functions/Function2;LZd/e;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {}, Lae/b;->f()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    if-ne p1, v0, :cond_0

    .line 16
    .line 17
    return-object p1

    .line 18
    :cond_0
    sget-object p1, LTd/L;->a:LTd/L;

    .line 19
    .line 20
    return-object p1
.end method
