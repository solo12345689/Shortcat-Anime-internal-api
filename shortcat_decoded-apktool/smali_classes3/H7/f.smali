.class public final LH7/f;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LH7/f$a;
    }
.end annotation


# static fields
.field public static final c:LH7/f$a;


# instance fields
.field private final a:Lcom/facebook/react/uimanager/t;

.field private final b:Lcom/facebook/react/uimanager/t;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LH7/f$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LH7/f$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LH7/f;->c:LH7/f$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lcom/facebook/react/uimanager/t;Lcom/facebook/react/uimanager/t;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LH7/f;->a:Lcom/facebook/react/uimanager/t;

    .line 5
    .line 6
    iput-object p2, p0, LH7/f;->b:Lcom/facebook/react/uimanager/t;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()Lcom/facebook/react/uimanager/t;
    .locals 1

    .line 1
    iget-object v0, p0, LH7/f;->a:Lcom/facebook/react/uimanager/t;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Lcom/facebook/react/uimanager/t;
    .locals 1

    .line 1
    iget-object v0, p0, LH7/f;->b:Lcom/facebook/react/uimanager/t;

    .line 2
    .line 3
    return-object v0
.end method
