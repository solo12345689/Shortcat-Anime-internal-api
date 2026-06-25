.class final LC/l$c;
.super LC/l;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LC/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# static fields
.field public static final e:LC/l$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LC/l$c;

    .line 2
    .line 3
    invoke-direct {v0}, LC/l$c;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LC/l$c;->e:LC/l$c;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, v0}, LC/l;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public a(ILi1/t;Landroidx/compose/ui/layout/s;I)I
    .locals 0

    .line 1
    sget-object p3, Li1/t;->a:Li1/t;

    .line 2
    .line 3
    if-ne p2, p3, :cond_0

    .line 4
    .line 5
    return p1

    .line 6
    :cond_0
    const/4 p1, 0x0

    .line 7
    return p1
.end method
