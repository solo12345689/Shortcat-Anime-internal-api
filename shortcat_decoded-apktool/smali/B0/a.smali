.class public final LB0/a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LB0/c;


# instance fields
.field private final a:J

.field private final b:J

.field private final c:I

.field private final d:Landroid/view/MotionEvent;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
.end method

.method private constructor <init>(JJILandroid/view/MotionEvent;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, LB0/a;->a:J

    .line 4
    iput-wide p3, p0, LB0/a;->b:J

    .line 5
    iput p5, p0, LB0/a;->c:I

    .line 6
    iput-object p6, p0, LB0/a;->d:Landroid/view/MotionEvent;

    return-void
.end method

.method public synthetic constructor <init>(JJILandroid/view/MotionEvent;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p6}, LB0/a;-><init>(JJILandroid/view/MotionEvent;)V

    return-void
.end method
