.class public final LIb/p;
.super Lb5/n;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# static fields
.field public static final j:LIb/p;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LIb/p;

    .line 2
    .line 3
    invoke-direct {v0}, LIb/p;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LIb/p;->j:LIb/p;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lb5/n;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public a(IIII)Lb5/n$g;
    .locals 0

    .line 1
    sget-object p1, Lb5/n$g;->b:Lb5/n$g;

    .line 2
    .line 3
    return-object p1
.end method

.method public b(IIII)F
    .locals 0

    .line 1
    const/high16 p1, 0x3f800000    # 1.0f

    .line 2
    .line 3
    return p1
.end method
