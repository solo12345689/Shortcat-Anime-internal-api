.class public final Lkg/h;
.super Ldg/F;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# instance fields
.field private final b:Ljava/lang/String;

.field private final c:J

.field private final d:Ltg/j;


# direct methods
.method public constructor <init>(Ljava/lang/String;JLtg/j;)V
    .locals 1

    .line 1
    const-string v0, "source"

    .line 2
    .line 3
    invoke-static {p4, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ldg/F;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lkg/h;->b:Ljava/lang/String;

    .line 10
    .line 11
    iput-wide p2, p0, Lkg/h;->c:J

    .line 12
    .line 13
    iput-object p4, p0, Lkg/h;->d:Ltg/j;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public h()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lkg/h;->c:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public j()Ldg/x;
    .locals 2

    .line 1
    iget-object v0, p0, Lkg/h;->b:Ljava/lang/String;

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
    iget-object v0, p0, Lkg/h;->d:Ltg/j;

    .line 2
    .line 3
    return-object v0
.end method
