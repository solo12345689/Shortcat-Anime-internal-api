.class public interface abstract Landroidx/compose/ui/e;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/compose/ui/e$a;,
        Landroidx/compose/ui/e$b;,
        Landroidx/compose/ui/e$c;
    }
.end annotation


# static fields
.field public static final a:Landroidx/compose/ui/e$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/ui/e$a;->b:Landroidx/compose/ui/e$a;

    .line 2
    .line 3
    sput-object v0, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public abstract all(Lkotlin/jvm/functions/Function1;)Z
.end method

.method public abstract foldIn(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;
.end method

.method public then(Landroidx/compose/ui/e;)Landroidx/compose/ui/e;
    .locals 1

    .line 1
    sget-object v0, Landroidx/compose/ui/e;->a:Landroidx/compose/ui/e$a;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Landroidx/compose/ui/a;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Landroidx/compose/ui/a;-><init>(Landroidx/compose/ui/e;Landroidx/compose/ui/e;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method
