.class final LT6/A$b;
.super LT6/A$c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LT6/A;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field private c:D

.field final synthetic d:LT6/A;


# direct methods
.method public constructor <init>(LT6/A;)V
    .locals 0

    .line 1
    iput-object p1, p0, LT6/A$b;->d:LT6/A;

    .line 2
    .line 3
    invoke-direct {p0, p1}, LT6/A$c;-><init>(LT6/A;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c()D
    .locals 2

    .line 1
    iget-wide v0, p0, LT6/A$b;->c:D

    .line 2
    .line 3
    return-wide v0
.end method

.method public final d(D)V
    .locals 0

    .line 1
    iput-wide p1, p0, LT6/A$b;->c:D

    .line 2
    .line 3
    return-void
.end method
