.class public final Lz/v;
.super Landroidx/compose/ui/e$c;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements LK0/I0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lz/v$a;
    }
.end annotation


# static fields
.field public static final c:Lz/v$a;

.field public static final d:I


# instance fields
.field private final a:Ljava/lang/Object;

.field private b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lz/v$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lz/v$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lz/v;->c:Lz/v$a;

    .line 8
    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    sput v0, Lz/v;->d:I

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/e$c;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lz/v;->c:Lz/v$a;

    .line 5
    .line 6
    iput-object v0, p0, Lz/v;->a:Ljava/lang/Object;

    .line 7
    .line 8
    iput-boolean p1, p0, Lz/v;->b:Z

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public B()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lz/v;->a:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method

.method public final E1()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lz/v;->b:Z

    .line 2
    .line 3
    return v0
.end method

.method public final F1(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lz/v;->b:Z

    .line 2
    .line 3
    return-void
.end method
