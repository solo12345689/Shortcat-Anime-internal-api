.class final Lo3/b$e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo3/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "e"
.end annotation


# instance fields
.field private final a:J

.field private final b:J

.field private final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(JJLjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lo3/b$e;->a:J

    .line 5
    .line 6
    iput-wide p3, p0, Lo3/b$e;->b:J

    .line 7
    .line 8
    iput-object p5, p0, Lo3/b$e;->c:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method

.method static synthetic a(Lo3/b$e;)Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lo3/b$e;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic b(Lo3/b$e;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lo3/b$e;->a:J

    .line 2
    .line 3
    return-wide v0
.end method

.method static synthetic c(Lo3/b$e;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lo3/b$e;->b:J

    .line 2
    .line 3
    return-wide v0
.end method
