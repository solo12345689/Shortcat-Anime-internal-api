.class final LC2/P$k;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LC2/P;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "k"
.end annotation


# instance fields
.field public final a:Lq2/O;

.field public final b:J

.field public final c:J

.field public d:J


# direct methods
.method private constructor <init>(Lq2/O;JJ)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LC2/P$k;->a:Lq2/O;

    .line 4
    iput-wide p2, p0, LC2/P$k;->b:J

    .line 5
    iput-wide p4, p0, LC2/P$k;->c:J

    return-void
.end method

.method synthetic constructor <init>(Lq2/O;JJLC2/P$a;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p5}, LC2/P$k;-><init>(Lq2/O;JJ)V

    return-void
.end method
