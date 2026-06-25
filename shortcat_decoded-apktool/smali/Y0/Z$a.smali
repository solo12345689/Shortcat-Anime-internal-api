.class public final LY0/Z$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LY0/Z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:LY0/Z$a;

.field private static final b:LY0/Z;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LY0/Z$a;

    .line 2
    .line 3
    invoke-direct {v0}, LY0/Z$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LY0/Z$a;->a:LY0/Z$a;

    .line 7
    .line 8
    new-instance v0, LY0/Z$a$a;

    .line 9
    .line 10
    invoke-direct {v0}, LY0/Z$a$a;-><init>()V

    .line 11
    .line 12
    .line 13
    sput-object v0, LY0/Z$a;->b:LY0/Z;

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
.method public final a()LY0/Z;
    .locals 1

    .line 1
    sget-object v0, LY0/Z$a;->b:LY0/Z;

    .line 2
    .line 3
    return-object v0
.end method
