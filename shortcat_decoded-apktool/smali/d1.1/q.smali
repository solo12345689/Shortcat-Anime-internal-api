.class public final Ld1/q;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Ld1/r;


# static fields
.field public static final a:Ld1/q;

.field private static b:Ld1/r;

.field public static final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ld1/q;

    .line 2
    .line 3
    invoke-direct {v0}, Ld1/q;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ld1/q;->a:Ld1/q;

    .line 7
    .line 8
    new-instance v0, Ld1/o;

    .line 9
    .line 10
    invoke-direct {v0}, Ld1/o;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, Ld1/q;->b:Ld1/r;

    .line 14
    .line 15
    const/16 v0, 0x8

    .line 16
    .line 17
    sput v0, Ld1/q;->c:I

    .line 18
    .line 19
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
.method public a()LY/h2;
    .locals 1

    .line 1
    sget-object v0, Ld1/q;->b:Ld1/r;

    .line 2
    .line 3
    invoke-interface {v0}, Ld1/r;->a()LY/h2;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
