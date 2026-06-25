.class public final Lu8/b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu8/b$a;
    }
.end annotation


# static fields
.field private static final b:Lu8/b;


# instance fields
.field private final a:Lu8/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lu8/b$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lu8/b$a;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lu8/b$a;->a()Lu8/b;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, Lu8/b;->b:Lu8/b;

    .line 11
    .line 12
    return-void
.end method

.method constructor <init>(Lu8/e;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu8/b;->a:Lu8/e;

    .line 5
    .line 6
    return-void
.end method

.method public static b()Lu8/b$a;
    .locals 1

    .line 1
    new-instance v0, Lu8/b$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lu8/b$a;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method


# virtual methods
.method public a()Lu8/e;
    .locals 1

    .line 1
    iget-object v0, p0, Lu8/b;->a:Lu8/e;

    .line 2
    .line 3
    return-object v0
.end method
