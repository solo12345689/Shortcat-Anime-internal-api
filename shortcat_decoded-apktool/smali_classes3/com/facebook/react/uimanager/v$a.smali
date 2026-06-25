.class public Lcom/facebook/react/uimanager/v$a;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/uimanager/v;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/react/uimanager/v$a$a;
    }
.end annotation


# static fields
.field private static final f:Lcom/facebook/react/uimanager/v$a$a;


# instance fields
.field public a:[D

.field public b:[D

.field public c:[D

.field public d:[D

.field public e:[D


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/facebook/react/uimanager/v$a$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/facebook/react/uimanager/v$a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/uimanager/v$a;->f:Lcom/facebook/react/uimanager/v$a$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x4

    .line 5
    new-array v0, v0, [D

    .line 6
    .line 7
    iput-object v0, p0, Lcom/facebook/react/uimanager/v$a;->a:[D

    .line 8
    .line 9
    const/4 v0, 0x3

    .line 10
    new-array v1, v0, [D

    .line 11
    .line 12
    iput-object v1, p0, Lcom/facebook/react/uimanager/v$a;->b:[D

    .line 13
    .line 14
    new-array v1, v0, [D

    .line 15
    .line 16
    iput-object v1, p0, Lcom/facebook/react/uimanager/v$a;->c:[D

    .line 17
    .line 18
    new-array v1, v0, [D

    .line 19
    .line 20
    iput-object v1, p0, Lcom/facebook/react/uimanager/v$a;->d:[D

    .line 21
    .line 22
    new-array v0, v0, [D

    .line 23
    .line 24
    iput-object v0, p0, Lcom/facebook/react/uimanager/v$a;->e:[D

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    sget-object v0, Lcom/facebook/react/uimanager/v$a;->f:Lcom/facebook/react/uimanager/v$a$a;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/facebook/react/uimanager/v$a;->a:[D

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/facebook/react/uimanager/v$a$a;->a(Lcom/facebook/react/uimanager/v$a$a;[D)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lcom/facebook/react/uimanager/v$a;->b:[D

    .line 9
    .line 10
    invoke-static {v0, v1}, Lcom/facebook/react/uimanager/v$a$a;->a(Lcom/facebook/react/uimanager/v$a$a;[D)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lcom/facebook/react/uimanager/v$a;->c:[D

    .line 14
    .line 15
    invoke-static {v0, v1}, Lcom/facebook/react/uimanager/v$a$a;->a(Lcom/facebook/react/uimanager/v$a$a;[D)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/facebook/react/uimanager/v$a;->d:[D

    .line 19
    .line 20
    invoke-static {v0, v1}, Lcom/facebook/react/uimanager/v$a$a;->a(Lcom/facebook/react/uimanager/v$a$a;[D)V

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, Lcom/facebook/react/uimanager/v$a;->e:[D

    .line 24
    .line 25
    invoke-static {v0, v1}, Lcom/facebook/react/uimanager/v$a$a;->a(Lcom/facebook/react/uimanager/v$a$a;[D)V

    .line 26
    .line 27
    .line 28
    return-void
.end method
