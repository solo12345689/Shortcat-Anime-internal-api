.class final Ldg/c$a;
.super Ldg/F;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ldg/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final b:Lhg/d$d;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/lang/String;

.field private final e:Ltg/j;


# direct methods
.method public constructor <init>(Lhg/d$d;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "snapshot"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ldg/F;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Ldg/c$a;->b:Lhg/d$d;

    .line 10
    .line 11
    iput-object p2, p0, Ldg/c$a;->c:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p3, p0, Ldg/c$a;->d:Ljava/lang/String;

    .line 14
    .line 15
    const/4 p2, 0x1

    .line 16
    invoke-virtual {p1, p2}, Lhg/d$d;->b(I)Ltg/Z;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    new-instance p2, Ldg/c$a$a;

    .line 21
    .line 22
    invoke-direct {p2, p1, p0}, Ldg/c$a$a;-><init>(Ltg/Z;Ldg/c$a;)V

    .line 23
    .line 24
    .line 25
    invoke-static {p2}, Ltg/K;->d(Ltg/Z;)Ltg/j;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, Ldg/c$a;->e:Ltg/j;

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public h()J
    .locals 3

    .line 1
    iget-object v0, p0, Ldg/c$a;->d:Ljava/lang/String;

    .line 2
    .line 3
    const-wide/16 v1, -0x1

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {v0, v1, v2}, Lfg/e;->X(Ljava/lang/String;J)J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0

    .line 12
    :cond_0
    return-wide v1
.end method

.method public j()Ldg/x;
    .locals 2

    .line 1
    iget-object v0, p0, Ldg/c$a;->c:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v1, Ldg/x;->e:Ldg/x$a;

    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ldg/x$a;->c(Ljava/lang/String;)Ldg/x;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return-object v0
.end method

.method public k()Ltg/j;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/c$a;->e:Ltg/j;

    .line 2
    .line 3
    return-object v0
.end method

.method public final m()Lhg/d$d;
    .locals 1

    .line 1
    iget-object v0, p0, Ldg/c$a;->b:Lhg/d$d;

    .line 2
    .line 3
    return-object v0
.end method
