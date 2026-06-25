.class public final La5/k;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LS4/l;


# static fields
.field private static final b:LS4/l;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La5/k;

    .line 2
    .line 3
    invoke-direct {v0}, La5/k;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La5/k;->b:LS4/l;

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

.method public static c()La5/k;
    .locals 1

    .line 1
    sget-object v0, La5/k;->b:LS4/l;

    .line 2
    .line 3
    check-cast v0, La5/k;

    .line 4
    .line 5
    return-object v0
.end method


# virtual methods
.method public a(Landroid/content/Context;LU4/v;II)LU4/v;
    .locals 0

    .line 1
    return-object p2
.end method

.method public b(Ljava/security/MessageDigest;)V
    .locals 0

    .line 1
    return-void
.end method
