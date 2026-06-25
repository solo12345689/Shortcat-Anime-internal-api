.class final LU2/c$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LU2/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# instance fields
.field public a:Z

.field public b:I

.field public c:I

.field public d:Z

.field public e:I

.field public f:I

.field public g:I


# direct methods
.method private constructor <init>()V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 3
    iput-boolean v0, p0, LU2/c$b;->a:Z

    const/4 v1, -0x1

    .line 4
    iput v1, p0, LU2/c$b;->b:I

    .line 5
    iput v1, p0, LU2/c$b;->c:I

    .line 6
    iput-boolean v0, p0, LU2/c$b;->d:Z

    const/4 v1, 0x2

    .line 7
    iput v1, p0, LU2/c$b;->e:I

    .line 8
    iput v0, p0, LU2/c$b;->f:I

    const/4 v0, 0x0

    .line 9
    iput v0, p0, LU2/c$b;->g:I

    return-void
.end method

.method synthetic constructor <init>(LU2/c$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, LU2/c$b;-><init>()V

    return-void
.end method
