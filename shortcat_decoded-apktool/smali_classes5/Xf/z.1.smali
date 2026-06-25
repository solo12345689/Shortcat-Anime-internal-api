.class public final LXf/z;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final a:LVf/v;

.field private b:Z


# direct methods
.method public constructor <init>(LTf/e;)V
    .locals 2

    .line 1
    const-string v0, "descriptor"

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
    new-instance v0, LVf/v;

    .line 10
    .line 11
    new-instance v1, LXf/z$a;

    .line 12
    .line 13
    invoke-direct {v1, p0}, LXf/z$a;-><init>(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, p1, v1}, LVf/v;-><init>(LTf/e;Lkotlin/jvm/functions/Function2;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, LXf/z;->a:LVf/v;

    .line 20
    .line 21
    return-void
.end method

.method public static final synthetic a(LXf/z;LTf/e;I)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, LXf/z;->e(LTf/e;I)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private final e(LTf/e;I)Z
    .locals 1

    .line 1
    invoke-interface {p1, p2}, LTf/e;->p(I)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-interface {p1, p2}, LTf/e;->n(I)LTf/e;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-interface {p1}, LTf/e;->i()Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    :goto_0
    iput-boolean p1, p0, LXf/z;->b:Z

    .line 21
    .line 22
    return p1
.end method


# virtual methods
.method public final b()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LXf/z;->b:Z

    .line 2
    .line 3
    return v0
.end method

.method public final c(I)V
    .locals 1

    .line 1
    iget-object v0, p0, LXf/z;->a:LVf/v;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, LVf/v;->a(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final d()I
    .locals 1

    .line 1
    iget-object v0, p0, LXf/z;->a:LVf/v;

    .line 2
    .line 3
    invoke-virtual {v0}, LVf/v;->d()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method
