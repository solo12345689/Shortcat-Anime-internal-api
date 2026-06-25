.class final La1/Y$f;
.super Lkotlin/jvm/internal/u;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La1/Y;-><init>(Landroid/view/View;LE0/h;La1/v;Ljava/util/concurrent/Executor;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation


# static fields
.field public static final a:La1/Y$f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La1/Y$f;

    .line 2
    .line 3
    invoke-direct {v0}, La1/Y$f;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La1/Y$f;->a:La1/Y$f;

    .line 7
    .line 8
    return-void
.end method

.method constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0}, Lkotlin/jvm/internal/u;-><init>(I)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La1/s;

    .line 2
    .line 3
    invoke-virtual {p1}, La1/s;->p()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-virtual {p0, p1}, La1/Y$f;->a(I)V

    .line 8
    .line 9
    .line 10
    sget-object p1, LTd/L;->a:LTd/L;

    .line 11
    .line 12
    return-object p1
.end method
