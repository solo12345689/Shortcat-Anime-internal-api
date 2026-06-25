.class public final Lv7/i$a;
.super Ltg/r;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lv7/i;->z(Ltg/Z;)Ltg/Z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic b:Lv7/i;


# direct methods
.method constructor <init>(Ltg/Z;Lv7/i;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lv7/i$a;->b:Lv7/i;

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
    .locals 9

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
    iget-object p3, p0, Lv7/i$a;->b:Lv7/i;

    .line 11
    .line 12
    const-wide/16 v0, -0x1

    .line 13
    .line 14
    cmp-long v0, p1, v0

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    invoke-static {p3}, Lv7/i;->q(Lv7/i;)J

    .line 19
    .line 20
    .line 21
    move-result-wide v1

    .line 22
    add-long/2addr v1, p1

    .line 23
    invoke-static {p3, v1, v2}, Lv7/i;->w(Lv7/i;J)V

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-static {p3}, Lv7/i;->m(Lv7/i;)Lv7/g;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-static {p3}, Lv7/i;->q(Lv7/i;)J

    .line 31
    .line 32
    .line 33
    move-result-wide v4

    .line 34
    invoke-static {p3}, Lv7/i;->o(Lv7/i;)Ldg/F;

    .line 35
    .line 36
    .line 37
    move-result-object p3

    .line 38
    invoke-virtual {p3}, Ldg/F;->h()J

    .line 39
    .line 40
    .line 41
    move-result-wide v6

    .line 42
    if-nez v0, :cond_1

    .line 43
    .line 44
    const/4 p3, 0x1

    .line 45
    :goto_0
    move v8, p3

    .line 46
    goto :goto_1

    .line 47
    :cond_1
    const/4 p3, 0x0

    .line 48
    goto :goto_0

    .line 49
    :goto_1
    invoke-interface/range {v3 .. v8}, Lv7/g;->a(JJZ)V

    .line 50
    .line 51
    .line 52
    return-wide p1
.end method
