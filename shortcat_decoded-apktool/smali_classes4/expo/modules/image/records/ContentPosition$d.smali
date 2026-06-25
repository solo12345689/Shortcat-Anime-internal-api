.class final synthetic Lexpo/modules/image/records/ContentPosition$d;
.super Lkotlin/jvm/internal/p;
.source "r8-map-id-a27a03ecaa04c3f144355334beb55c9cbfc36dda79e554423bceb24cf939fcb7"

# interfaces
.implements Lie/q;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/image/records/ContentPosition;->offsetY(Landroid/graphics/RectF;Landroid/graphics/RectF;)F
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1000
    name = null
.end annotation


# static fields
.field public static final a:Lexpo/modules/image/records/ContentPosition$d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lexpo/modules/image/records/ContentPosition$d;

    .line 2
    .line 3
    invoke-direct {v0}, Lexpo/modules/image/records/ContentPosition$d;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lexpo/modules/image/records/ContentPosition$d;->a:Lexpo/modules/image/records/ContentPosition$d;

    .line 7
    .line 8
    return-void
.end method

.method constructor <init>()V
    .locals 6

    .line 1
    const-string v4, "calcYTranslation(FLandroid/graphics/RectF;Landroid/graphics/RectF;ZZ)F"

    .line 2
    .line 3
    const/4 v5, 0x1

    .line 4
    const/4 v1, 0x5

    .line 5
    const-class v2, LIb/n;

    .line 6
    .line 7
    const-string v3, "calcYTranslation"

    .line 8
    .line 9
    move-object v0, p0

    .line 10
    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/p;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    check-cast p1, Ljava/lang/Number;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    move-object v2, p2

    .line 8
    check-cast v2, Landroid/graphics/RectF;

    .line 9
    .line 10
    move-object v3, p3

    .line 11
    check-cast v3, Landroid/graphics/RectF;

    .line 12
    .line 13
    check-cast p4, Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-virtual {p4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    check-cast p5, Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-virtual {p5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    move-object v0, p0

    .line 26
    invoke-virtual/range {v0 .. v5}, Lexpo/modules/image/records/ContentPosition$d;->j(FLandroid/graphics/RectF;Landroid/graphics/RectF;ZZ)Ljava/lang/Float;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    return-object p1
.end method

.method public final j(FLandroid/graphics/RectF;Landroid/graphics/RectF;ZZ)Ljava/lang/Float;
    .locals 1

    .line 1
    const-string v0, "p1"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "p2"

    .line 7
    .line 8
    invoke-static {p3, v0}, Lkotlin/jvm/internal/s;->h(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p1, p2, p3, p4, p5}, LIb/n;->d(FLandroid/graphics/RectF;Landroid/graphics/RectF;ZZ)F

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1
.end method
