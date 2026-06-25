.class public final LDb/k$d$a;
.super Ltg/r;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LDb/k$d;->q(Ltg/Z;)Ltg/Z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private b:J

.field final synthetic c:LDb/k$d;


# direct methods
.method constructor <init>(Ltg/Z;LDb/k$d;)V
    .locals 0

    .line 1
    iput-object p2, p0, LDb/k$d$a;->c:LDb/k$d;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Ltg/r;-><init>(Ltg/Z;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public N0(Ltg/h;J)J
    .locals 10

    .line 1
    const-string v0, "sink"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, Ltg/r;->N0(Ltg/h;J)J

    .line 7
    .line 8
    .line 9
    move-result-wide p1

    .line 10
    iget-wide v0, p0, LDb/k$d$a;->b:J

    .line 11
    .line 12
    const-wide/16 v2, -0x1

    .line 13
    .line 14
    cmp-long p3, p1, v2

    .line 15
    .line 16
    if-eqz p3, :cond_0

    .line 17
    .line 18
    move-wide v4, p1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const-wide/16 v4, 0x0

    .line 21
    .line 22
    :goto_0
    add-long/2addr v0, v4

    .line 23
    iput-wide v0, p0, LDb/k$d$a;->b:J

    .line 24
    .line 25
    iget-object v0, p0, LDb/k$d$a;->c:LDb/k$d;

    .line 26
    .line 27
    invoke-static {v0}, LDb/k$d;->m(LDb/k$d;)LDb/k$c;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    iget-wide v5, p0, LDb/k$d$a;->b:J

    .line 32
    .line 33
    iget-object v0, p0, LDb/k$d$a;->c:LDb/k$d;

    .line 34
    .line 35
    invoke-static {v0}, LDb/k$d;->o(LDb/k$d;)Ldg/F;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    invoke-virtual {v0}, Ldg/F;->h()J

    .line 42
    .line 43
    .line 44
    move-result-wide v2

    .line 45
    :cond_1
    move-wide v7, v2

    .line 46
    if-nez p3, :cond_2

    .line 47
    .line 48
    const/4 p3, 0x1

    .line 49
    :goto_1
    move v9, p3

    .line 50
    goto :goto_2

    .line 51
    :cond_2
    const/4 p3, 0x0

    .line 52
    goto :goto_1

    .line 53
    :goto_2
    invoke-interface/range {v4 .. v9}, LDb/k$c;->a(JJZ)V

    .line 54
    .line 55
    .line 56
    return-wide p1
.end method
