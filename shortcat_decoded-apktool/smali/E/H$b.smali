.class final LE/H$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LE/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LE/H;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "b"
.end annotation


# static fields
.field public static final a:LE/H$b;

.field private static b:I

.field private static c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LE/H$b;

    .line 2
    .line 3
    invoke-direct {v0}, LE/H$b;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LE/H$b;->a:LE/H$b;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 0

    .line 1
    sput p1, LE/H$b;->b:I

    .line 2
    .line 3
    return-void
.end method

.method public b(I)V
    .locals 0

    .line 1
    sput p1, LE/H$b;->c:I

    .line 2
    .line 3
    return-void
.end method
