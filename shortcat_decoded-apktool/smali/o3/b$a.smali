.class final Lo3/b$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo3/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# instance fields
.field private final a:J

.field private final b:J


# direct methods
.method public constructor <init>(JJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lo3/b$a;->a:J

    .line 5
    .line 6
    iput-wide p3, p0, Lo3/b$a;->b:J

    .line 7
    .line 8
    return-void
.end method

.method static synthetic a(Lo3/b$a;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lo3/b$a;->b:J

    .line 2
    .line 3
    return-wide v0
.end method

.method static synthetic b(Lo3/b$a;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lo3/b$a;->a:J

    .line 2
    .line 3
    return-wide v0
.end method
