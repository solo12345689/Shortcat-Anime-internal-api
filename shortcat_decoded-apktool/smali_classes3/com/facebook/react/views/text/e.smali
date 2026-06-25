.class public final Lcom/facebook/react/views/text/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/views/text/e$a;
    }
.end annotation


# static fields
.field public static final b:Lcom/facebook/react/views/text/e$a;

.field private static c:Lcom/facebook/react/views/text/e;


# instance fields
.field private final a:LX6/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/views/text/e$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/views/text/e$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/views/text/e;->b:Lcom/facebook/react/views/text/e$a;

    .line 8
    .line 9
    return-void
.end method

.method private constructor <init>(LX6/a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/react/views/text/e;->a:LX6/a;

    return-void
.end method

.method public synthetic constructor <init>(LX6/a;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/facebook/react/views/text/e;-><init>(LX6/a;)V

    return-void
.end method

.method public static final synthetic a()Lcom/facebook/react/views/text/e;
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/views/text/e;->c:Lcom/facebook/react/views/text/e;

    .line 2
    .line 3
    return-object v0
.end method

.method public static final synthetic b(Lcom/facebook/react/views/text/e;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/facebook/react/views/text/e;->c:Lcom/facebook/react/views/text/e;

    .line 2
    .line 3
    return-void
.end method

.method public static final c()Lcom/facebook/react/views/text/e;
    .locals 1

    .line 1
    sget-object v0, Lcom/facebook/react/views/text/e;->b:Lcom/facebook/react/views/text/e$a;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/facebook/react/views/text/e$a;->a()Lcom/facebook/react/views/text/e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method


# virtual methods
.method public final d(Ljava/lang/String;ILandroid/content/res/AssetManager;)Landroid/graphics/Typeface;
    .locals 1

    .line 1
    const-string v0, "fontFamilyName"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "assetManager"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/facebook/react/views/text/e;->a:LX6/a;

    .line 12
    .line 13
    invoke-virtual {v0, p1, p2, p3}, LX6/a;->d(Ljava/lang/String;ILandroid/content/res/AssetManager;)Landroid/graphics/Typeface;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method
