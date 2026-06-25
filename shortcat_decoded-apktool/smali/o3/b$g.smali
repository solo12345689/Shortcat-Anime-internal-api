.class final Lo3/b$g;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo3/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "g"
.end annotation


# instance fields
.field private final a:Z

.field private final b:Z

.field private final c:Z


# direct methods
.method public constructor <init>(ZZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lo3/b$g;->a:Z

    .line 5
    .line 6
    iput-boolean p2, p0, Lo3/b$g;->b:Z

    .line 7
    .line 8
    iput-boolean p3, p0, Lo3/b$g;->c:Z

    .line 9
    .line 10
    return-void
.end method

.method static synthetic a(Lo3/b$g;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lo3/b$g;->c:Z

    .line 2
    .line 3
    return p0
.end method

.method static synthetic b(Lo3/b$g;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lo3/b$g;->a:Z

    .line 2
    .line 3
    return p0
.end method

.method static synthetic c(Lo3/b$g;)Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lo3/b$g;->b:Z

    .line 2
    .line 3
    return p0
.end method
