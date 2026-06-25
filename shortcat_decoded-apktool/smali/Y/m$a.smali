.class public final LY/m$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LY/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:LY/m$a;

.field private static final b:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LY/m$a;

    .line 2
    .line 3
    invoke-direct {v0}, LY/m$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LY/m$a;->a:LY/m$a;

    .line 7
    .line 8
    new-instance v0, LY/m$a$a;

    .line 9
    .line 10
    invoke-direct {v0}, LY/m$a$a;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, LY/m$a;->b:Ljava/lang/Object;

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
.method public final a()Ljava/lang/Object;
    .locals 1

    .line 1
    sget-object v0, LY/m$a;->b:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method
