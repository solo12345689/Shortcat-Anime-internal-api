.class final Lx4/d$b;
.super Ltg/r;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx4/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field private b:Ljava/lang/Exception;


# direct methods
.method public constructor <init>(Ltg/Z;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ltg/r;-><init>(Ltg/Z;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public N0(Ltg/h;J)J
    .locals 0

    .line 1
    :try_start_0
    invoke-super {p0, p1, p2, p3}, Ltg/r;->N0(Ltg/h;J)J

    .line 2
    .line 3
    .line 4
    move-result-wide p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-wide p1

    .line 6
    :catch_0
    move-exception p1

    .line 7
    iput-object p1, p0, Lx4/d$b;->b:Ljava/lang/Exception;

    .line 8
    .line 9
    throw p1
.end method

.method public final b()Ljava/lang/Exception;
    .locals 1

    .line 1
    iget-object v0, p0, Lx4/d$b;->b:Ljava/lang/Exception;

    .line 2
    .line 3
    return-object v0
.end method
