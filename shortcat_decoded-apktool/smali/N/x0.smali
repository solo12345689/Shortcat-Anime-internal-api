.class public abstract LN/x0;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LN/x0$a;
    }
.end annotation


# static fields
.field private static final a:LN/x0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, LN/x0$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, LN/x0$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, LN/x0;->a:LN/x0$a;

    .line 8
    .line 9
    return-void
.end method

.method public static final synthetic a(LN/x0;)LM/a;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    throw p0
.end method

.method public static final synthetic b(LN/x0;)LM/c;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    throw p0
.end method

.method public static synthetic c(LN/x0;Ljava/lang/CharSequence;JLO/a;ZILjava/lang/Object;)V
    .locals 0

    .line 1
    and-int/lit8 p0, p6, 0x4

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    sget-object p0, LO/a;->a:LO/a;

    .line 6
    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    throw p0
.end method
