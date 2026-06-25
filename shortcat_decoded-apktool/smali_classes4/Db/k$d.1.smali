.class final LDb/k$d;
.super Ldg/F;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LDb/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "d"
.end annotation


# instance fields
.field private final b:Ldg/F;

.field private final c:LDb/k$c;

.field private d:Ltg/j;


# direct methods
.method public constructor <init>(Ldg/F;LDb/k$c;)V
    .locals 1

    .line 1
    const-string v0, "progressListener"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ldg/F;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LDb/k$d;->b:Ldg/F;

    .line 10
    .line 11
    iput-object p2, p0, LDb/k$d;->c:LDb/k$c;

    .line 12
    .line 13
    return-void
.end method

.method public static final synthetic m(LDb/k$d;)LDb/k$c;
    .locals 0

    .line 1
    iget-object p0, p0, LDb/k$d;->c:LDb/k$c;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic o(LDb/k$d;)Ldg/F;
    .locals 0

    .line 1
    iget-object p0, p0, LDb/k$d;->b:Ldg/F;

    .line 2
    .line 3
    return-object p0
.end method

.method private final q(Ltg/Z;)Ltg/Z;
    .locals 1

    .line 1
    new-instance v0, LDb/k$d$a;

    .line 2
    .line 3
    invoke-direct {v0, p1, p0}, LDb/k$d$a;-><init>(Ltg/Z;LDb/k$d;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public h()J
    .locals 2

    .line 1
    iget-object v0, p0, LDb/k$d;->b:Ldg/F;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ldg/F;->h()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0

    .line 10
    :cond_0
    const-wide/16 v0, -0x1

    .line 11
    .line 12
    return-wide v0
.end method

.method public j()Ldg/x;
    .locals 1

    .line 1
    iget-object v0, p0, LDb/k$d;->b:Ldg/F;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ldg/F;->j()Ldg/x;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return-object v0
.end method

.method public k()Ltg/j;
    .locals 1

    .line 1
    iget-object v0, p0, LDb/k$d;->d:Ltg/j;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LDb/k$d;->b:Ldg/F;

    .line 6
    .line 7
    invoke-static {v0}, Lkotlin/jvm/internal/s;->e(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Ldg/F;->k()Ltg/j;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-direct {p0, v0}, LDb/k$d;->q(Ltg/Z;)Ltg/Z;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {v0}, Ltg/K;->d(Ltg/Z;)Ltg/j;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :cond_0
    return-object v0
.end method
