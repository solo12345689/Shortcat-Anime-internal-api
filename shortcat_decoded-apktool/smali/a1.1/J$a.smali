.class public final La1/J$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La1/J;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:La1/J$a;

.field private static final b:La1/J;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La1/J$a;

    .line 2
    .line 3
    invoke-direct {v0}, La1/J$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La1/J$a;->a:La1/J$a;

    .line 7
    .line 8
    new-instance v0, La1/J$a$a;

    .line 9
    .line 10
    invoke-direct {v0}, La1/J$a$a;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, La1/J$a;->b:La1/J;

    .line 14
    .line 15
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
.method public final a()La1/J;
    .locals 1

    .line 1
    sget-object v0, La1/J$a;->b:La1/J;

    .line 2
    .line 3
    return-object v0
.end method
