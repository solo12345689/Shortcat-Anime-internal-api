.class public final Lu0/f$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu0/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field static final synthetic a:Lu0/f$a;

.field private static final b:I

.field private static final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lu0/f$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lu0/f$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lu0/f$a;->a:Lu0/f$a;

    .line 7
    .line 8
    sget-object v0, Landroidx/compose/ui/graphics/c;->b:Landroidx/compose/ui/graphics/c$a;

    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/compose/ui/graphics/c$a;->B()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    sput v0, Lu0/f$a;->b:I

    .line 15
    .line 16
    sget-object v0, Ls0/X0;->a:Ls0/X0$a;

    .line 17
    .line 18
    invoke-virtual {v0}, Ls0/X0$a;->a()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    sput v0, Lu0/f$a;->c:I

    .line 23
    .line 24
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
.method public final a()I
    .locals 1

    .line 1
    sget v0, Lu0/f$a;->b:I

    .line 2
    .line 3
    return v0
.end method

.method public final b()I
    .locals 1

    .line 1
    sget v0, Lu0/f$a;->c:I

    .line 2
    .line 3
    return v0
.end method
