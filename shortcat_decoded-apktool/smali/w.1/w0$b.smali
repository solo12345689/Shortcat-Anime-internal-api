.class public final Lw/w0$b;
.super Ljava/lang/Object;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lw/s;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw/w0;->c(Lw/q;FF)Lw/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private final a:Lw/J;


# direct methods
.method constructor <init>(FF)V
    .locals 6

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lw/J;

    .line 5
    .line 6
    const/4 v4, 0x4

    .line 7
    const/4 v5, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    move v1, p1

    .line 10
    move v2, p2

    .line 11
    invoke-direct/range {v0 .. v5}, Lw/J;-><init>(FFFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Lw/w0$b;->a:Lw/J;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public a(I)Lw/J;
    .locals 0

    .line 1
    iget-object p1, p0, Lw/w0$b;->a:Lw/J;

    .line 2
    .line 3
    return-object p1
.end method

.method public bridge synthetic get(I)Lw/H;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lw/w0$b;->a(I)Lw/J;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method
