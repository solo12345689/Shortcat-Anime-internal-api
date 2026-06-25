.class LVh/h$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LVh/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private final a:Lai/d;

.field private b:I


# direct methods
.method constructor <init>(Lai/d;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LVh/h$b;->a:Lai/d;

    .line 5
    .line 6
    iput p2, p0, LVh/h$b;->b:I

    .line 7
    .line 8
    return-void
.end method

.method static synthetic a(LVh/h$b;)Lai/d;
    .locals 0

    .line 1
    iget-object p0, p0, LVh/h$b;->a:Lai/d;

    .line 2
    .line 3
    return-object p0
.end method

.method static synthetic b(LVh/h$b;)I
    .locals 0

    .line 1
    iget p0, p0, LVh/h$b;->b:I

    .line 2
    .line 3
    return p0
.end method

.method static synthetic c(LVh/h$b;I)I
    .locals 0

    .line 1
    iput p1, p0, LVh/h$b;->b:I

    .line 2
    .line 3
    return p1
.end method
